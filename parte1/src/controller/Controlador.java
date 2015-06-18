package controller;

import gals.AnalysisError;
import gals.LexicalError;
import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;
import gals.Token;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Controlador {

	public void analiseLexica(String texto){
		try{
			List<Token> allTokens = new ArrayList<Token>();
			Lexico lex = new Lexico(texto);
			Token token;
			while ((token = lex.nextToken()) != null) {
				allTokens.add(token);
			}
			JOptionPane.showMessageDialog(null, "Não encontrou erros na Análise léxica.", "ANÁLISE", JOptionPane.INFORMATION_MESSAGE);
			
		}catch(LexicalError le){
			JOptionPane.showMessageDialog(null, le.getMessage(), "ERRO LÉXICO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	public void analiseLexicaSemantica(String texto){
		
		Sintatico sintatico = new Sintatico();
		try {
			sintatico.parse(new Lexico(texto), new Semantico());
			JOptionPane.showMessageDialog(null, "Não ocorreram erros na Análise Sintática.", "ANÁLISE", JOptionPane.INFORMATION_MESSAGE);
		}
		catch (LexicalError e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO LÉXICO", JOptionPane.ERROR_MESSAGE);
		}
		catch (SyntaticError e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO SINTÁTICO", JOptionPane.ERROR_MESSAGE);
		}
		catch (AnalysisError e) {
			e.printStackTrace();
		}
	}

}
