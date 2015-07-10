package semantico;

import java.util.ArrayList;
import java.util.Hashtable;

public class Tabela {

	private Hashtable<String, ArrayList<String>> tabela = new Hashtable<String, ArrayList<String>>();

	public Hashtable<String, ArrayList<String>> getTabela() {
		return tabela;
	}

	public void setTabela(Hashtable<String, ArrayList<String>> tabela) {
		this.tabela = tabela;
	}

	public void add(String lexeme, ArrayList<String> atributos) {
		tabela.put(lexeme, atributos);
	}

	public int getUltimaPosicao() {
		return this.tabela.size() - 1;
	}

	public int getPrimeiraPosicao() {
		return this.tabela.size() - (this.tabela.size() - 1);
	}

	public void show() {
		System.out.println(tabela.toString());
		/*
		 * for (Identificador id : this.tabelaSimbolos) {
		 * System.out.println(id.toString()); }
		 */
	}
}
