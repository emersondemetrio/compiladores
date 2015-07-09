package controller;

import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import gals.Token;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

	public Controlador() {

	}

	private static void log(String msg) {
		System.out.println("[Controlador.java] " + msg);
	}

	public void analiseLexica(String texto) throws LexicalError {
		System.out.println("Analise Lexica");
		List<Token> allTokens = new ArrayList<Token>();
		Lexico lex = new Lexico(texto);
		Token token;

		while ((token = lex.nextToken()) != null) {
			allTokens.add(token);
			System.out.println("Analise Lexica" + token);
		}
	}

	public void analiseLexicaSintatica(String texto) throws LexicalError,
			SyntaticError, SemanticError {
		Sintatico sintatico = new Sintatico();
		sintatico.parse(new Lexico(texto), new Semantico());
	}

	public void analiseSemantica() {
		System.out.println("Nada por aqui.");
	}
}
