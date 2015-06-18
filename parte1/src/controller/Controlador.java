package controller;

import gals.LexicalError;
import gals.Lexico;
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
			JOptionPane.showMessageDialog(null, "Análise léxica não encontrou erros.", "ANÁLISE", JOptionPane.INFORMATION_MESSAGE);
			
		}catch(LexicalError le){
			JOptionPane.showMessageDialog(null, le.getMessage(), "ERRO LÉXICO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	public void analiseSemantica(String texto){
		
	}

}
