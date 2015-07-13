package semantico;

import java.util.ArrayList;
import java.util.Hashtable;

public class Tabela {

	private ArrayList<Item> tabela;
	private int primeiraPosicaoLID;
	private int ultimaPosicaoLID;

	public Tabela() {
		tabela = new ArrayList<Item>();
	}

	public void addItem(Item identificador) {
		tabela.add(identificador);
	}

	public int getUltimaPosicao() {
		return this.tabela.size() - 1;
	}

	public Item getElementoPosicao(int posicao) {
		return this.tabela.get(posicao);
	}

	public void setElementoPosicao(int posicao, Item identificador) {
		tabela.set(posicao, identificador);
	}

	public void excluiElemento(int posicao) {
		tabela.remove(posicao);
	}

	public int retornaTamanho() {
		return this.tabela.size();
	}

	public Item getIdNomePosicao(String nome, int nivel) {
		Item i = new Item();
		for (int x = 0; x < tabela.size() - 1; x++) {
			if (tabela.get(x).getNome().equals(nome)
					&& tabela.get(x).getNivel() == nivel) {
				i = tabela.get(x);
			}
		}

		return i;
	}

	public ArrayList<Item> getTabela() {
		return tabela;
	}

	public void show() {
		System.out.println(tabela.toString());
	}

	public int getPrimeiraPosicaoLID() {
		return primeiraPosicaoLID;
	}

	public void setPrimeiraPosicaoLID(int primeiraPosicaoLID) {
		this.primeiraPosicaoLID = primeiraPosicaoLID;
	}

	public int getUltimaPosicaoLID() {
		return ultimaPosicaoLID;
	}

	public void setUltimaPosicaoLID(int ultimaPosicaoLID) {
		this.ultimaPosicaoLID = ultimaPosicaoLID;
	}
	
	public boolean estaDeclarado(String lexeme, int nivel){
		boolean declarado = false;
	}

	public boolean identificadorDeclarado(String lexeme, int nivel) {
		boolean resultado = false;
		
		if (this.indexLexeme.containsKey(lexeme)) {
			ArrayList<Integer> indices = this.indexLexeme.get(lexeme);
			for (Integer i : indices) {
				Identificador identificador = this.get(i);
				if (identificador.getNivel() <= nivel) {
					resultado = true;
					break;
				}
			}
		}
		return resultado;
	}
}
