package gals;

public interface ParserConstants {
	int START_SYMBOL = 60;

	int FIRST_NON_TERMINAL = 60;
	int FIRST_SEMANTIC_ACTION = 94;

	int[][] PARSER_TABLE = {
			{ -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, 1, 1, -1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 1, -1, -1, 1, -1, -1, -1, -1,
					-1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, 2, 2, -1, -1, -1, 2, 2, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 2, -1, -1, 3, -1, -1, -1, -1,
					-1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, 7, 8, -1, -1, -1, 4, 6, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 13, 12, -1, -1, -1, 13,
					-1, 13, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, 14,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1,
					-1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1,
					19, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1,
					-1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, 26, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 29, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, 37, 34,
					35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, 36,
					-1, -1, 31, 37, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 39, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 43, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1,
					42, -1, 41, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1 },
			{ -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 44, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 44, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1,
					44, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1,
					-1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 47, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 47, -1, -1, -1, 47, 47, -1, -1, -1, -1, -1, -1, -1, -1,
					47, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 49, -1,
					-1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 49, 48, -1, -1, -1, -1, 49, 49, -1, 48, 48, 48,
					-1, 49, -1, 49, -1, -1, -1, -1, -1, -1, -1, 48, 48 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, 52, 51, 50,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 54 },
			{ -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 56, -1, -1, -1, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1,
					56, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1,
					-1, 57, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 58, 58, -1, -1, -1, -1, 58, 58, -1, 58, 58, 58,
					-1, 58, -1, 58, 57, 57, -1, -1, -1, -1, -1, 58, 58 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, 59, 60, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 62, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 62, 62, 62, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 62, -1, -1, -1, 62, 62, -1, -1, -1, -1, -1, -1, -1, -1,
					62, -1, -1, -1, -1, 62, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1,
					-1, 64, 63, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1,
					63, -1, -1, 64, 64, -1, -1, -1, -1, 64, 64, -1, 64, 64, 64,
					-1, 64, -1, 64, 64, 64, 63, 63, -1, -1, -1, 64, 64 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, 65, 66, -1, -1, -1, -1, -1 },
			{ -1, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 69, 73, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 73, -1, -1, -1, 73, 73, -1, -1, -1, -1, -1, -1, -1, -1,
					71, -1, -1, -1, -1, 70, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 76, 76, -1,
					-1, 76, 76, -1, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1,
					76, -1, -1, 76, 76, -1, -1, -1, -1, 76, 76, -1, 76, 76, 76,
					74, 76, 75, 76, 76, 76, 76, 76, -1, -1, -1, 76, 76 },
			{ -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 78, -1, -1, -1, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, 81, 82, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 83, -1, -1, -1, 79, 80, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 } };

	int[][] PRODUCTIONS = { { 3, 2, 41, 61, 43 }, { 62, 68, 74 },
			{ 63, 64, 65, 67, 41, 62 }, { 0 }, { 10 }, { 25 }, { 11 }, { 5 },
			{ 6, 49, 92, 50 }, { 49, 92, 50 }, { 0 }, { 2, 66 }, { 42, 65 },
			{ 0 }, { 46, 92 }, { 0 }, { 69, 41, 68 }, { 0 },
			{ 28, 2, 70, 72, 41, 61 }, { 47, 73, 65, 55, 63, 71, 48 }, { 0 },
			{ 41, 73, 65, 55, 63, 71 }, { 0 }, { 55, 63 }, { 0 }, { 29 },
			{ 30 }, { 34, 76, 75, 35 }, { 41, 76, 75 }, { 0 }, { 2, 78 },
			{ 74 }, { 13, 81, 14, 76, 77 }, { 27, 81, 24, 76 },
			{ 16, 47, 65, 48 }, { 17, 47, 79, 48 }, { 31, 81 }, { 0 },
			{ 15, 76 }, { 0 }, { 56, 81 }, { 49, 81, 50, 56, 81 },
			{ 47, 79, 48 }, { 0 }, { 81, 80 }, { 42, 81, 80 }, { 0 },
			{ 84, 82 }, { 83, 84 }, { 0 }, { 46 }, { 45 }, { 44 }, { 36 },
			{ 59 }, { 58 }, { 87, 85 }, { 86, 87, 85 }, { 0 }, { 51 }, { 52 },
			{ 18 }, { 90, 88 }, { 89, 90, 88 }, { 0 }, { 53 }, { 54 }, { 32 },
			{ 19 }, { 20, 90 }, { 52, 90 }, { 47, 81, 48 }, { 2, 91 }, { 93 },
			{ 47, 81, 80, 48 }, { 49, 81, 50 }, { 0 }, { 2 }, { 93 }, { 37 },
			{ 38 }, { 21 }, { 22 }, { 33 } };

	String[] PARSER_ERROR = { "", 
			"Era esperado fim de programa",
			"Era esperado id", 
			"Era esperado programa", 
			"Era esperado var",
			"Era esperado caracter", 
			"Era esperado cadeia",
			"Era esperado procedimento", 
			"Era esperado inicio",
			"Era esperado fim", 
			"Era esperado inteiro",
			"Era esperado booleano", 
			"Era esperado funcao", 
			"Era esperado se",
			"Era esperado entao", 
			"Era esperado senao", 
			"Era esperado leia",
			"Era esperado escreva", 
			"Era esperado ou", 
			"Era esperado e",
			"Era esperado nao", 
			"Era esperado falso",
			"Era esperado verdadeiro", 
			"Era esperado de", 
			"Era esperado faca",
			"Era esperado real", 
			"Era esperado vetor", 
			"Era esperado enquanto",
			"Era esperado metodo", 
			"Era esperado ref", 
			"Era esperado val",
			"Era esperado retorne", 
			"Era esperado div", 
			"Era esperado literal",
			"Era esperado \"{\"", 
			"Era esperado \"}\"", 
			"Era esperado \">=\"",
			"Era esperado num_int", 
			"Era esperado num_real",
			"Era esperado comentarioLinha", 
			"Era esperado comentarioBloco",
			"Era esperado \";\"", 
			"Era esperado \",\"", 
			"Era esperado \".\"",
			"Era esperado \">\"", 
			"Era esperado \"<\"", 
			"Era esperado \"=\"",
			"Era esperado \"(\"", 
			"Era esperado \")\"", 
			"Era esperado \"[\"",
			"Era esperado \"]\"", 
			"Era esperado \"+\"", 
			"Era esperado \"-\"",
			"Era esperado \"*\"", 
			"Era esperado \"/\"", 
			"Era esperado \":\"",
			"Era esperado \":=\"", 
			"Era esperado \"..\"",
			"Era esperado \"<>\"", 
			"Era esperado \"<=\"",
			"Era esperado programa", 																				// "<programa> inv�lido", 
			"Era esperado caracter ou cadeia ou inteiro ou booleano ou real ou metodo ou '{'",						// "<bloco> inv�lido",
			"Era esperado � ou caracter ou cadeia ou inteiro ou booleano ou real", 									// "<dcl_var_const> inv�lido", 
			"Era esperado caracter ou cadeia ou inteiro ou booleano ou real", 										// "<tipo> inv�lido",
			"Era esperado � ou '['", 																				// "<dimensao> inv�lido", 
			"Era esperado id", 																						// "<lid> inv�lido", 
			"Era esperado � ou ','", 																				// "<rep_lid> inv�lido",
			"Era esperado � ou '='", 																				// "<fator_const> inv�lido", 
			"Era esperado � ou um m�todo", 																			// "<dcl_metodos> inv�lido",
			"Era esperado um m�todo", 																				// "<dcl_metodo> inv�lido", 
			"Era esperado � ou '('",																				// "<par_formais> inv�lido",
			"Era esperado � ou ';'",																				// "<rep_par> inv�lido", 
			"Era esperado � ou ':'",																				// "<tipo_metodo> inv�lido",
			"Era esperado ref ou valor",																			// "<mp_par> inv�lido", 
			"Era esperado '{'", 																					// "<com_composto> inv�lido",
			"Era esperado � ou ':' ",																				// "<replistacomando> inv�lido", 
			"Era esperado � ou id ou se ou leia ou escreva ou enquanto ou retorne ou '{'", 							// "<comando> inv�lido",
			"Era esperado � ou senao",																				// "<senaoparte> inv�lido", 
			"Era esperado � ou '(' ou '[' ou ':='", 																// "<rcomid> inv�lido",
			"Era esperado id ou nao ou falso ou verdadeiro ou literal ou num_int ou num_real ou '(' ou '-'	", 		// "<lista_expr> inv�lido", 
			"Era esperado � ou ','", 																				// "<rep_lexpr> inv�lido",
			"Era esperado id ou nao ou falso ou verdadeiro ou literal ou num_int ou num_real ou '(' ou '-'	", 		// "<expressao> inv�lido", 
			"Era esperado � ou '>=' ou '>' ou '<' ou '=' ou '<>' ou '<='", 											// "<resto_expressao> inv�lido",
			"Era esperado '>=' ou '>' ou '<' ou '=' ou '<>' ou '<='", 												// "<oprel> inv�lido", 
			"Era esperado id ou nao ou falso ou verdadeiro ou literal ou num_int ou num_real ou '(' ou '-'", 		// "<expsimp> inv�lido", 
			"Era esperado � ou 'ou' ou '+' ou '-'", 																// "<rep_expsimp> inv�lido",
			"Era esperado 'ou' ou '+' ou '-'", 																		// "<op_add> inv�lido", 
			"Era esperado id ou nao ou falso ou verdadeiro ou literal ou num_int ou num_real ou '(' ou '-'", 		// "<termo> inv�lido", 
			"Era esperado � ou e ou div ou '*' ou '/'", 															// "<rep_termo> inv�lido",
			"Era esperado e ou div ou '*' ou '/'",																	// "<op_mult> inv�lido", 
			"Era esperado id ou nao ou falso ou verdadeiro ou literal ou num_int ou num_real ou '(' ou '-'", 		// "<fator> inv�lido", 
			"Era esperado � ou '(' ou '[' ", 																		// "<rvar> inv�lido",
			"Era esperado id ou falso ou verdadeiro ou literal ou num_int ou num_real", 							// "<constante> inv�lido", 
			"Era esperado falso ou verdadeiro ou literal ou num_int ou num_real"									// "<constante_explicita> inv�lido" 
			};
}
