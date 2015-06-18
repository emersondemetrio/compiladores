package controller;

import gals.AnalysisError;
import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import gals.Token;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Controlador {

	private int posicaoErro;

	public int getPosicaoErro() {
		return posicaoErro;
	}

	public void setPosicaoErro(int posicaoErro) {
		this.posicaoErro = posicaoErro;
	}

	public void analiseLexica(String texto) throws LexicalError {

		List<Token> allTokens = new ArrayList<Token>();
		Lexico lex = new Lexico(texto);
		Token token;
		while ((token = lex.nextToken()) != null) {
			allTokens.add(token);
		}
	}

	public void analiseLexicaSintatica(String texto) throws LexicalError,
			SyntaticError, SemanticError {
		Sintatico sintatico = new Sintatico();
		sintatico.parse(new Lexico(texto), null);
	}

}
