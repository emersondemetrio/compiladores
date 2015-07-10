package semantico;

import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

public class AnalisadorSemantico {

	private int nivelAtual;
	private Stack<Integer> deslocamento = new Stack<Integer>();
	private ContextoLID contextoLid;
	private ArrayList<String> listaIDs = new ArrayList<String>();

	public ArrayList<String> getListaIDs() {
		return listaIDs;
	}

	public void setListaIDs(ArrayList<String> listaIDs) {
		this.listaIDs = listaIDs;
	}

	public int getNivelAtual() {
		return nivelAtual;
	}

	public void setNivelAtual(int nivel) {
		this.nivelAtual = nivel;
	}

	public Stack<Integer> getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento.push(deslocamento);
	}

	public ContextoLID getContextoLid() {
		return contextoLid;
	}

	public void setContextoLid(ContextoLID contextoLid) {
		this.contextoLid = contextoLid;
	}

}
