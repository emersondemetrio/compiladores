package semantica;

import java.util.ArrayList;

public class Tabela {

	private ArrayList<String> tabela;

	public Tabela() {
		tabela = new ArrayList<String>();
	}

	public ArrayList<String> get() {
		return tabela;
	}

	public boolean add(String valor) {
		tabela.add(valor);
		return false;
	}

	public boolean remover(int indice) {
		return false;
	}

	public boolean comparar(String cp1, String cp2) {
		return false;
	}

	public int indexOfElemento(String elemento) {
		return -1;
	}
}
