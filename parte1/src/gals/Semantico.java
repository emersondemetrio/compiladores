package gals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import semantico.AnalisadorSemantico;
import semantico.Categoria;
import semantico.ContextoLID;
import semantico.Item;
import semantico.SubCategoria;
import semantico.Tabela;
import semantico.TipoParametro;
import semantico.TipoVariavel;


public class Semantico implements Constants {

	// LID = LIsta de Declaracao

	private Tabela ts = new Tabela();
	private AnalisadorSemantico analisador = new AnalisadorSemantico();

	private Categoria categoriaAtual;
	private SubCategoria subCategoria;
	private TipoVariavel tipoConstante;
	private TipoVariavel tipoAtual;
	private Integer numElementos;
	private String valConst;
	private int nivelAtual;
	private int deslocamentoAtual;
	private Stack<Integer> pilhaDeslocamento = new Stack<Integer>();
	private ContextoLID contextoLid;
	private TipoParametro MPP;//mecanismo de passagem de parametros
	private ArrayList<Item> listaPar = new ArrayList<Item>();
	private int NPF; //numero de parametros formais
	private TipoVariavel tipoMetodo;
	private int posID; //posição ID
	private TipoVariavel tipoLadoEsquerdo;
	private boolean opNega;
	private TipoVariavel tipoFator;
	private boolean OpUnario;
	private TipoVariavel tipoExpressao;
	private TipoVariavel tipoVariavel;
	private int NPA; //numero parametros atuais
	private ContextoLID contextoEXPR;
	
	private Stack<Item> pilhaMetodos;

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

		nivelAtual = 0;
		deslocamentoAtual = 0;
		pilhaDeslocamento.add(0);

		String idPrograma = token.getLexeme();

		Item identificadorAtual = new Item(Categoria.PROGRAMA, idPrograma);

		ts.addItem(identificadorAtual);
		ts.show();
	}

	public void acao102(Token token) {
		contextoLid = ContextoLID.DECLARACAO;
		ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(), nivelAtual,
				deslocamentoAtual));
		ts.setPrimeiraPosicaoLID(0);
	}

	public void acao103(Token token) {
		ts.setUltimaPosicaoLID(ts.getTabela().size() - 1);
	}

	public void acao104(Token token) {
		// cada identificador presente;

		for (Item atual : ts.getTabela()) {
			atual.setTipoCategoria(categoriaAtual);
			atual.setTipoSubCategoria(subCategoria);
			if (atual.getTipoCategoria() == Categoria.VARIAVEL
					&& atual.getTipoSubCategoria() == SubCategoria.VETOR) {
				pilhaDeslocamento.add(numElementos);
				deslocamentoAtual = numElementos;
			} else {
				pilhaDeslocamento.add(1);
				deslocamentoAtual++;
			}
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
			throw new SemanticError("Esperava-se uma constante inteira",
					token.getPosition());
		} else if (Integer.parseInt(valConst) > 256) {
			throw new SemanticError("cadeia > que o permitido",
					token.getPosition());
		} else {
			tipoAtual = TipoVariavel.CADEIA;
		}

	}

	public void acao110(Token token) throws SemanticError {
		if (getTipoAtual() == TipoVariavel.CADEIA) {
			throw new SemanticError("Vetor do tipo cadeia não é permitido",
					token.getPosition());
		} else {
			subCategoria = SubCategoria.VETOR;
		}
	}

	public void acao111(Token token) throws SemanticError {
		if (tipoConstante != TipoVariavel.INTEIRO) {
			throw new SemanticError(
					"A dimensão deve ser uma constante inteira",
					token.getPosition());
		} else {
			this.numElementos = Integer.parseInt(valConst);
		}

	}

	public void acao112(Token token) throws SemanticError {
		if (getTipoAtual() == TipoVariavel.CADEIA) {
			subCategoria = SubCategoria.CADEIA;
		} else {
			subCategoria = SubCategoria.PREDEFINIDO;
		}
	}

	public void acao113(Token token) throws SemanticError {

		if (contextoLid == ContextoLID.DECLARACAO) {
			if (ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id já declarado", token.getPosition());
			} else {
				ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(),
						nivelAtual, deslocamentoAtual, SubCategoria.PREDEFINIDO));
			}

		} else if (contextoLid == ContextoLID.PARAMETRO_FORMAL) {

			if (ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id parâmetro repetido",
						token.getPosition());
			} else {
				ts.addItem(new Item(Categoria.VARIAVEL, token.getLexeme(),
						nivelAtual, deslocamentoAtual, SubCategoria.PREDEFINIDO));
				NPF++;
			}

		} else if (contextoLid == ContextoLID.LEITURA) {
			if (!ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id não declarado", token.getPosition());
			} else {
				Item id = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);
				if ((id.getTipoCategoria() == Categoria.VARIAVEL || id
						.getTipoCategoria() == Categoria.PARAMETRO)
						&& (id.getTipoSubCategoria() == SubCategoria.PREDEFINIDO)
						&& (id.getTipo() != TipoVariavel.BOOLEANO && id
								.getTipo() != TipoVariavel.CADEIA)) {
					/* gera codigo para leitura */

				} else {
					throw new SemanticError("Tipo Invalido para leitura",
							token.getPosition());
				}
			}

		}

	}

	public void acao114(Token token) throws SemanticError {
		if (subCategoria == SubCategoria.CADEIA
				|| subCategoria == SubCategoria.VETOR) {
			throw new SemanticError(
					"Apenas id de tipo pré-def podem ser declarados como constante",
					token.getPosition());
		} else {
			categoriaAtual = Categoria.CONSTANTE;
		}

	}

	public void acao115(Token token) throws SemanticError {
		if (tipoConstante != tipoAtual) {
			throw new SemanticError("Tipo da constante incorreto",
					token.getPosition());
		}
	}

	public void acao116(Token token) {
		this.categoriaAtual = Categoria.VARIAVEL;
	}

	public void acao117(Token token) throws SemanticError {
		if(ts.estaDeclarado(token.getLexeme(), nivelAtual)){
			throw new SemanticError("Id já declarado",
					token.getPosition());
		}else{
			NPF = 0;
			ts.addItem(new Item(Categoria.METODO, token.getLexeme(), nivelAtual + 1));
		}
	}

	public void acao118(Token token) {
		ts.setNPF(NPF);
	}

	public void acao119(Token token) {
		ts.setTipoMetodo(tipoMetodo);
	}

	public void acao120(Token token) {

	}

	public void acao121(Token token) {
		contextoLid = ContextoLID.PARAMETRO_FORMAL;
		ts.setPrimeiraPosicaoLID(0);
	}

	public void acao122(Token token) {
		ts.setUltimaPosicaoLID(ts.getTabela().size() - 1);
	}

	public void acao123(Token token) throws SemanticError {
		if(tipoAtual != TipoVariavel.BOOLEANO || tipoAtual != TipoVariavel.CARACTER || tipoAtual != TipoVariavel.INTEIRO ||
				tipoAtual != TipoVariavel.REAL){
			throw new SemanticError("Parâmetros devem ser de tipo Pré-Definido", token.getPosition());
		}else{
			for (Item atual : ts.getTabela()) {
				atual.setTipoCategoria(Categoria.PARAMETRO);
				atual.setTipo(tipoAtual);
				atual.setMPP(MPP);
				listaPar.add(atual);
			}
		}
		
	}
	//parei aquiiiiiiiiii
	public void acao124(Token token) throws SemanticError {
		if(tipoAtual == TipoVariavel.CADEIA){
			throw new SemanticError("Métodos devem ser de tipo pré-definido", token.getPosition());
		}else{
			tipoMetodo = tipoAtual; 
		}
	}

	public void acao125(Token token) {
		tipoMetodo = TipoVariavel.NULO;
	}

	public void acao126(Token token) {
		MPP = TipoParametro.REFERENCIA;
	}

	public void acao127(Token token) {
		MPP = TipoParametro.VALOR;
	}

	public void acao128(Token token) throws SemanticError {
		if(!ts.estaDeclarado(token.getLexeme(), nivelAtual)){
			throw new SemanticError("“Identificador não declarado", token.getPosition());
		}else{
			posID = ts.getPosicaoIDTS(token, nivelAtual);
		}
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
		Item item = ts.getElementoPosicao(posID);
		if(item.getTipoCategoria() == Categoria.VARIAVEL || item.getTipoCategoria()  == Categoria.PARAMETRO){
			if(item.getTipoSubCategoria() == SubCategoria.VETOR){
				throw new SemanticError("Id deveria ser indexado", token.getPosition());
			}else{
				tipoLadoEsquerdo = item.getTipo();
			}
		}else{
			throw new SemanticError("Id deveria ser variavel ou parametro", token.getPosition());
		}
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
	//Continuar!!!!
	public void acao141(Token token) throws SemanticError {
		if(contextoEXPR == ContextoLID.PARAMETRO_ATUAL){
			NPA++;
			Item metodo = pilhaMetodos.peek();
			
		}
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
		if(opNega){
			throw new SemanticError("Operação 'não' repetido - não pode!", token.getPosition());
		}else{
			opNega = true;
		}
	}

	public void acao164(Token token) throws SemanticError {
		if(tipoFator != TipoVariavel.BOOLEANO){
			throw new SemanticError("Operação 'não' exige operando booleano", token.getPosition());
		}else{
			opNega = false;
		}
	}

	public void acao165(Token token) throws SemanticError {
		if(OpUnario){
			throw new SemanticError("Operador Unário repetido", token.getPosition());
		}else{
			OpUnario = true;
		}
	}

	public void acao166(Token token) throws SemanticError {
		if(tipoFator != TipoVariavel.INTEIRO || tipoFator != TipoVariavel.REAL){
			throw new SemanticError("Operador Unário exige exige operando numero", token.getPosition());
		}else{
			OpUnario = false;
		}
	}

	public void acao167(Token token) {
		opNega = OpUnario = false;
	}

	public void acao168(Token token) {
		tipoFator = tipoExpressao;
	}

	public void acao169(Token token) {
		tipoFator = tipoVariavel;
	}

	public void acao170(Token token) {
		tipoFator = tipoConstante;
	}

	public void acao171(Token token) throws SemanticError {
		Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);
		pilhaMetodos.push(item);
		if(item.getTipoCategoria() != Categoria.METODO ){
			throw new SemanticError("id deveria ser um metodo", token.getPosition());
		}else{
			if(tipoMetodo == TipoVariavel.NULO){
				throw new SemanticError("Esperava-se método com tipo", token.getPosition());
			}else{
				NPA = 0;
				contextoEXPR = ContextoLID.PARAMETRO_ATUAL;
			}
		}
	}

	public void acao172(Token token) throws SemanticError {

	}

	public void acao173(Token token) throws SemanticError {

	}

	public void acao174(Token token) throws SemanticError {

	}

	public void acao175(Token token) throws SemanticError {
		if (!ts.estaDeclarado(token.getLexeme(), 0)) {
			throw new SemanticError("id não declarado", token.getPosition());
		} else {
			Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);// constante
			if (item.getTipoCategoria() != Categoria.CONSTANTE) {
				throw new SemanticError("id de Constante esperado",
						token.getPosition());
			} else {
				tipoConstante = item.getTipo();
				valConst = item.getValor();
			}
		}

	}

	public void acao176(Token token) throws SemanticError {
		tipoConstante = TipoVariavel.INTEIRO;
		valConst = token.getLexeme();
	}

	public void acao177(Token token) throws SemanticError {
		tipoConstante = TipoVariavel.REAL;
		valConst = token.getLexeme();
	}

	public void acao178(Token token) throws SemanticError {
		tipoConstante = TipoVariavel.BOOLEANO;
		valConst = token.getLexeme();
	}

	public void acao179(Token token) throws SemanticError {
		tipoConstante = TipoVariavel.BOOLEANO;
		valConst = token.getLexeme();
	}

	public void acao180(Token token) throws SemanticError {
		tipoConstante = TipoVariavel.CARACTER;
		valConst = token.getLexeme();
	}

	public TipoVariavel getTipoAtual() {
		return tipoAtual;
	}

	public void setTipoAtual(TipoVariavel tipoVariavel) {
		this.tipoAtual = tipoVariavel;
	}

}
