package gals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import semantico.AnalisadorSemantico;
import semantico.Categoria;
import semantico.ContextoLID;
import semantico.Tabela;

public class Semantico implements Constants {

	private Tabela ts = new Tabela();
	private AnalisadorSemantico analisador = new AnalisadorSemantico();

	public void executeAction(int action, Token token) throws SemanticError {
		// System.out.println("Ação #" + action + ", Token: " + token);
		try {
			@SuppressWarnings("rawtypes")
			Class[] classeParametros = new Class[] { Token.class };
			java.lang.String nomeMetodo = "acao" + action;
			Method metodo = getClass().getMethod(nomeMetodo, classeParametros);
			Object[] argumentos = new Object[] { token };
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

		ts.add(token.getLexeme(),
				getList(new String[] {
						String.valueOf(analisador.getNivelAtual()),
						String.valueOf(analisador.getDeslocamento().peek()),
						String.valueOf(Categoria.PROGRAMA) }));

		ts.show();
	}

	public void acao102(Token token) {
		analisador.setContextoLid(ContextoLID.DECLARACAO);

		ts.add("Primeiro ID da Lista:", getList(new String[] { String
				.valueOf(analisador.getListaIDs().get(0)) }));
		ts.show();
	}

	public void acao103(Token token) {
		ts.add("Ultimo ID da Lista:", getList(new String[] { String
				.valueOf(analisador.getListaIDs().get(
						analisador.getListaIDs().size() - 1)) }));
	}

	public void acao104(Token token) {

	}

	public void acao105(Token token) {

	}

	public void acao106(Token token) {

	}

	public void acao107(Token token) {

	}

	public void acao108(Token token) {

	}

	public void acao109(Token token) throws SemanticError {

	}

	public void acao110(Token token) throws SemanticError {

	}

	public void acao111(Token token) throws SemanticError {

	}

	public void acao112(Token token) {

	}

	public void acao113(Token token) throws SemanticError {

	}

	public void acao114(Token token) throws SemanticError {

	}

	public void acao115(Token token) throws SemanticError {

	}

	public void acao116(Token token) {

	}

	public void acao117(Token token) throws SemanticError {

	}

	public void acao118(Token token) throws SemanticError {

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

}
