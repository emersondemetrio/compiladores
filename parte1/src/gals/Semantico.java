package gals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import semantico.AnalisadorSemantico;
import semantico.Categoria;
import semantico.ContextoLID;
import semantico.Item;
import semantico.SubCategoria;
import semantico.Tabela;
import semantico.TipoVariavel;

public class Semantico implements Constants {

	// LID = LIsta de Declaracao

	private Tabela ts = new Tabela();
	private AnalisadorSemantico analisador = new AnalisadorSemantico();

	private Categoria categoriaAtual;
	private SubCategoria subCategoriaAtual;
	private TipoVariavel tipoConstante;
	private TipoVariavel tipoAtual;
	private int valConstante;

	public void executeAction(int action, Token token) throws SemanticError {
		// System.out.println("Ação #" + action + ", Token: " + token);
		try {
			@SuppressWarnings("rawtypes")
			Class[] classeParametros = new Class[] { Token.class };
			java.lang.String nomeMetodo = "acao" + action;
			Method metodo = getClass().getMethod(nomeMetodo, classeParametros);
			Object[] argumentos = new Object[] { token };
			// System.out.println(this);
			// System.out.println(argumentos);
			metodo.invoke(this, argumentos);

		} catch (InvocationTargetException e) {
			if (e.getCause() instanceof SemanticError) {
				SemanticError erroSemantico = (SemanticError) e.getCause();
				throw erroSemantico;
			} else {
				// throw new SemanticError("Erro nao esperado: " +
				// e.getCause().getMessage(), token.getPosition());
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			throw new SemanticError("Erro, a ação #" + action
					+ " não foi implementada. ", token.getPosition());
		} catch (Exception e) {
			throw new SemanticError("Erro ao invocar método."
					+ e.getCause().getMessage(), token.getPosition());
		}
	}

	public ArrayList<String> getList(String[] params) {
		ArrayList<String> temp = new ArrayList<String>();
		for (String t : params) {
			temp.add(t);
		}
		return temp;
	}

	public void acao101(Token token) {

		analisador.setNivelAtual(0);
		analisador.setDeslocamento(0);
		analisador.addDeslocamento(0);

		String idPrograma = token.getLexeme();
		int nivelAtual = analisador.getNivelAtual();
		int deslocamento = analisador.getDeslocamento();

		Item identificadorAtual = new Item(Categoria.PROGRAMA, idPrograma,
				nivelAtual, deslocamento);

		ts.addItem(identificadorAtual);
		ts.show();
	}

	public void acao102(Token token) {
		analisador.setContextoLid(ContextoLID.DECLARACAO);
		ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(), analisador
				.getNivelAtual(), analisador.getDeslocamento()));
		ts.setPrimeiraPosicaoLID(0);
	}

	public void acao103(Token token) {
		ts.setUltimaPosicaoLID(analisador.getLid().size() -1);
	}

	public void acao104(Token token) {
		// cada identificador presente;
		int deslocamento = 0;

		for (Item atual : ts.getTabela()) {
			atual.setTipoCategoria(categoriaAtual);
			atual.setTipoSubCategoria(subCategoriaAtual);

		}
	}

	public void acao105(Token token) {
		setTipoAtual(TipoVariavel.INTEIRO);
	}

	public void acao106(Token token) {
		setTipoAtual(TipoVariavel.REAL);
	}

	public void acao107(Token token) {
		setTipoAtual(TipoVariavel.BOOLEANO);
	}

	public void acao108(Token token) {
		setTipoAtual(TipoVariavel.CARACTER);
	}

	public void acao109(Token token) throws SemanticError {
		if (this.tipoConstante != TipoVariavel.INTEIRO) {
			throw new SemanticError("Esperava-se uma constante inteira");
		}
		this.tipoAtual = TipoVariavel.CADEIA;
		
		// falta fazer valConstante;
	}

	public void acao110(Token token) throws SemanticError {
		if (getTipoAtual() == TipoVariavel.CADEIA) {
			throw new SemanticError("Vetor do tipo cadeia não é permitido");
		} else {
			analisador.setSubCategoria(SubCategoria.VETOR);
		}
	}

	public void acao111(Token token) throws SemanticError {
		// analisador.tipoConstante;
	}

	public void acao112(Token token) throws SemanticError {
		if (getTipoAtual() != TipoVariavel.CADEIA) {
			analisador.setSubCategoria(SubCategoria.CADEIA);
		} else {
			analisador.setSubCategoria(SubCategoria.PREDEFINIDO);
		}
	}

	public void acao113(Token token) throws SemanticError {
		boolean jaExiste = false;
		int indice = 0;

		if (analisador.getContextoLid() == ContextoLID.DECLARACAO) {

			while (!jaExiste && indice <= ts.getTabela().size()) {
				Item atual = ts.getTabela().get(indice);

				if (atual.getNome().equals(token.getLexeme())) {
					jaExiste = true;
					throw new SemanticError("Id já declarado");
				} else {
					indice++;
				}
			}
			if (!jaExiste) {
				ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(),
						analisador.getNivelAtual(), analisador
								.getDeslocamento()));
			}

		} else if (analisador.getContextoLid() == ContextoLID.PARAMETRO_FORMAL) {

			while (!jaExiste && indice <= ts.getTabela().size()) {
				Item atual = ts.getTabela().get(indice);

				if (atual.getNome().equals(token.getLexeme())) {
					jaExiste = true;
					throw new SemanticError("Parametro repetido");
				} else {
					indice++;
				}
			}

			if (!jaExiste) {
				ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(),
						analisador.getNivelAtual(), analisador
								.getDeslocamento()));

				analisador.setNPF(analisador.getNPF() + 1);
			}
		} else if (analisador.getContextoLid() == ContextoLID.LEITURA) {
			// comparar se id ja foi declarado

		}

	}

	public void acao114(Token token) throws SemanticError {
		
	}

	public void acao115(Token token) throws SemanticError {

	}

	public void acao116(Token token) {
		this.categoriaAtual = Categoria.VARIAVEL;
	}

	public void acao117(Token token) throws SemanticError {

	}

	public void acao118(Token token) {

	}

	public void acao119(Token token) {

	}

	public void acao120(Token token) {

	}

	public void acao121(Token token) {

	}

	public void acao122(Token token) {

	}

	public void acao123(Token token) throws SemanticError {

	}

	public void acao124(Token token) throws SemanticError {

	}

	public void acao125(Token token) {

	}

	public void acao126(Token token) {

	}

	public void acao127(Token token) {

	}

	public void acao128(Token token) throws SemanticError {

	}

	public void acao129(Token token) throws SemanticError {

	}

	public void acao130(Token token) {

	}

	public void acao131(Token token) {

	}

	public void acao132(Token token) throws SemanticError {

	}

	public void acao133(Token token) throws SemanticError {

	}

	public void acao134(Token token) throws SemanticError {

	}

	public void acao135(Token token) throws SemanticError {

	}

	public void acao136(Token token) throws SemanticError {

	}

	public void acao137(Token token) throws SemanticError {

	}

	public void acao138(Token token) {

	}

	public void acao139(Token token) throws SemanticError {

	}

	public void acao140(Token token) throws SemanticError {

	}

	public void acao141(Token token) throws SemanticError {

	}

	public void acao142(Token token) {

	}

	public void acao143(Token token) throws SemanticError {

	}

	public void acao144(Token token) {

	}

	public void acao145(Token token) {

	}

	public void acao146(Token token) {

	}

	public void acao147(Token token) {

	}

	public void acao148(Token token) {

	}

	public void acao149(Token token) {

	}

	public void acao150(Token token) {

	}

	public void acao151(Token token) throws SemanticError {

	}

	public void acao152(Token token) throws SemanticError {

	}

	public void acao153(Token token) {

	}

	public void acao154(Token token) {

	}

	public void acao155(Token token) {

	}

	public void acao156(Token token) {

	}

	public void acao157(Token token) throws SemanticError {

	}

	public void acao158(Token token) throws SemanticError {

	}

	public void acao159(Token token) {

	}

	public void acao160(Token token) {

	}

	public void acao161(Token token) {

	}

	public void acao162(Token token) {

	}

	public void acao163(Token token) throws SemanticError {

	}

	public void acao164(Token token) throws SemanticError {

	}

	public void acao165(Token token) throws SemanticError {

	}

	public void acao166(Token token) throws SemanticError {

	}

	public void acao167(Token token) {

	}

	public void acao168(Token token) {

	}

	public void acao169(Token token) {

	}

	public void acao170(Token token) {

	}

	public void acao171(Token token) throws SemanticError {

	}

	public void acao172(Token token) throws SemanticError {

	}

	public void acao173(Token token) throws SemanticError {

	}

	public void acao174(Token token) throws SemanticError {

	}

	public void acao175(Token token) throws SemanticError {
		if(token.getLexeme()){
			
		}
	}

	public void acao176(Token token) throws SemanticError {

	}

	public void acao177(Token token) throws SemanticError {

	}

	public void acao178(Token token) throws SemanticError {

	}

	public void acao179(Token token) throws SemanticError {

	}

	public void acao180(Token token) throws SemanticError {

	}
	
	public TipoVariavel getTipoAtual() {
		return tipoAtual;
	}

	public void setTipoAtual(TipoVariavel tipoVariavel) {
		this.tipoAtual = tipoVariavel;
	}

}
