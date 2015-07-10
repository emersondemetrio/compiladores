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

	private Lexico analisadorLexico;
	private Sintatico analisadorSintatico;
	private Semantico analisadorSemantico;

	public Controlador() {
		analisadorSintatico = new Sintatico();
	}

	private static void log(String msg) {
		System.out.println("[Controlador.java] " + msg);
	}

	public void analiseLexica(String texto) throws LexicalError {
		System.out.println("Analise Lexica");
		List<Token> allTokens = new ArrayList<Token>();
		analisadorLexico = new Lexico(texto);
		Token token;

		while ((token = analisadorLexico.nextToken()) != null) {
			allTokens.add(token);
			System.out.println("Analise Lexica" + token);
		}
	}

	public void analiseLexicaSintatica(String texto) throws LexicalError,
			SyntaticError, SemanticError {
		analisadorSintatico.parse(new Lexico(texto), null);
	}

	public void analiseSemantica(String texto) throws LexicalError,
			SyntaticError, SemanticError {
		analisadorSemantico = new Semantico();
		analisadorSintatico.executarSemantico();
		analisadorSintatico.parse(new Lexico(texto), analisadorSemantico);
	}
}
