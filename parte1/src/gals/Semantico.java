package gals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import semantico.Categoria;
import semantico.ContextoLID;
import semantico.Item;
import semantico.Operador;
import semantico.OperadorComparacao;
import semantico.SubCategoria;
import semantico.Tabela;
import semantico.TipoParametro;
import semantico.TipoVariavel;

public class Semantico implements Constants {

	private Tabela ts = new Tabela();
	private Categoria categoriaAtual;
	private SubCategoria subCategoria;
	private TipoVariavel tipoConstante;
	private TipoVariavel tipoAtual;
	private Integer numElementos;
	private String valConst;
	private int nivelAtual;
	private int deslocamentoAtual;
	private Stack<Integer> pilhaDeslocamento = new Stack<Integer>();
	private ContextoLID contextoLid;
	private TipoParametro MPP;// mecanismo de passagem de parametros
	private ArrayList<Item> listaPar = new ArrayList<Item>();
	private int NPF; // numero de parametros formais
	private TipoVariavel tipoMetodo;
	private int posID; // posi��o ID na TS
	private TipoVariavel tipoLadoEsquerdo;
	private boolean opNega;
	private TipoVariavel tipoFator;
	private boolean OpUnario;
	private TipoVariavel tipoExpressao;
	private TipoVariavel tipoVariavel;
	private int NPA; // numero parametros atuais
	private ContextoLID contextoEXPR;
	private int quantidadeIDs; // a��o 121 e 122
	private Stack<TipoVariavel> tipoTermo = new Stack<TipoVariavel>();
	private Operador operadorAtual;
	private Stack<TipoVariavel> tipoExpressaoSimples = new Stack<TipoVariavel>();
	private OperadorComparacao operadorComparacao;
	private TipoVariavel tipoResultadoFuncao;
	private SubCategoria tipoVarIndexada;
	private Stack<Item> pilhaMetodos = new Stack<Item>();

	// private tipoElementosVetor

	public void acao101(Token token) {
		nivelAtual = 0;
		deslocamentoAtual = 0;
		pilhaDeslocamento.add(0);
		Item identificadorAtual = new Item(Categoria.PROGRAMA,
				token.getLexeme());

		ts.addItem(identificadorAtual);
	}

	public void acao102(Token token) {
		contextoLid = ContextoLID.DECLARACAO;
		Item novo = new Item(Categoria.VARIAVEL, token.getLexeme(), nivelAtual,
				deslocamentoAtual);
		ts.addItem(novo);
		ts.setPrimeiraPosicaoLID(0);
	}

	public void acao103(Token token) {
		ts.setUltimaPosicaoLID(ts.getTabela().size() - 1);
	}

	public void acao104(Token token) {
		// cada identificador presente
		for (Item atual : ts.getTabela()) {
			atual.setTipoCategoria(categoriaAtual);
			atual.setTipoSubCategoria(subCategoria);
			atual.setTipo(tipoAtual);

			if (atual.getTipoCategoria() == Categoria.VARIAVEL
					&& atual.getTipoSubCategoria() == SubCategoria.VETOR) {
				pilhaDeslocamento.add(numElementos);
				deslocamentoAtual = numElementos;
			} else {
				pilhaDeslocamento.add(1);
				deslocamentoAtual++;
			}
		}
	}

	public void acao105(Token token) {
		setTipoAtual(TipoVariavel.INTEIRO);
	}

	public void acao106(Token token) {
		setTipoAtual(TipoVariavel.REAL);
	}

	public void acao107(Token token) {
		setTipoAtual(TipoVariavel.BOOLEANO);
	}

	public void acao108(Token token) {
		setTipoAtual(TipoVariavel.CARACTER);
	}

	public void acao109(Token token) throws SemanticError {
		if (this.tipoConstante != TipoVariavel.INTEIRO) {
			throw new SemanticError("Esperava-se uma constante inteira",
					token.getPosition());
		} else if (Integer.parseInt(valConst) > 256) {
			throw new SemanticError("cadeia > que o permitido",
					token.getPosition());
		} else {
			tipoAtual = TipoVariavel.CADEIA;
		}

	}

	public void acao110(Token token) throws SemanticError {
		if (getTipoAtual() == TipoVariavel.CADEIA) {
			throw new SemanticError("Vetor do tipo cadeia n�o � permitido",
					token.getPosition());
		} else {
			subCategoria = SubCategoria.VETOR;
		}
	}

	public void acao111(Token token) throws SemanticError {
		if (tipoConstante != TipoVariavel.INTEIRO) {
			throw new SemanticError(
					"A dimens�o deve ser uma constante inteira",
					token.getPosition());
		} else {
			this.numElementos = Integer.parseInt(valConst);
		}
	}

	public void acao112(Token token) throws SemanticError {
		if (getTipoAtual() == TipoVariavel.CADEIA) {
			subCategoria = SubCategoria.CADEIA;
		} else {
			subCategoria = SubCategoria.PREDEFINIDO;
		}
	}

	public void acao113(Token token) throws SemanticError {
		if (contextoLid == ContextoLID.DECLARACAO) {
			if (ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id j� declarado", token.getPosition());
			} else {

				log("153 - additem: " + token.getLexeme());
				Item novo = new Item(Categoria.VARIAVEL, token.getLexeme(),
						nivelAtual, deslocamentoAtual,
						SubCategoria.PREDEFINIDO, tipoAtual);
				ts.addItem(novo);
				log(novo.toString());
			}

		} else if (contextoLid == ContextoLID.PARAMETRO_FORMAL) {

			if (ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id par�metro repetido",
						token.getPosition());
			} else {
				log("164 - additem");
				Item novo = new Item(Categoria.VARIAVEL, token.getLexeme(),
						nivelAtual, deslocamentoAtual,
						SubCategoria.PREDEFINIDO, tipoAtual);
				novo.setNome(token.getLexeme());
				ts.addItem(novo);
				NPF++;
			}

		} else if (contextoLid == ContextoLID.LEITURA) {
			if (!ts.estaDeclaradoNivelMenor(token.getLexeme(), nivelAtual)) {
				throw new SemanticError("Id n�o declarado", token.getPosition());
			} else {
				Item id = ts.getIdNomePosicaoNivelMenor(token.getLexeme(),
						nivelAtual);
				if ((id.getTipoCategoria() == Categoria.VARIAVEL || id
						.getTipoCategoria() == Categoria.PARAMETRO)
						&& (id.getTipoSubCategoria() == SubCategoria.PREDEFINIDO)
						&& (id.getTipo() != TipoVariavel.BOOLEANO && id
								.getTipo() != TipoVariavel.CADEIA)) {
					/* gera codigo para leitura */

				} else {
					throw new SemanticError("Tipo Invalido para leitura",
							token.getPosition());
				}
			}
		}
	}

	public void acao114(Token token) throws SemanticError {
		if (subCategoria == SubCategoria.CADEIA
				|| subCategoria == SubCategoria.VETOR) {
			throw new SemanticError(
					"Apenas id de tipo pr�-def podem ser declarados como constante",
					token.getPosition());
		} else {
			categoriaAtual = Categoria.CONSTANTE;
			log("114 - " + categoriaAtual);
		}

	}

	public void acao115(Token token) throws SemanticError {
		if (tipoConstante != tipoAtual) {
			throw new SemanticError("Tipo da constante incorreto",
					token.getPosition());
		}
	}

	public void acao116(Token token) {
		this.categoriaAtual = Categoria.VARIAVEL;
	}

	public void acao117(Token token) throws SemanticError {
		if (ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
			throw new SemanticError("Id j� declarado", token.getPosition());
		} else {
			NPF = 0;
			log("220 - additem");
			nivelAtual++;

			Item novo = new Item(Categoria.METODO, token.getLexeme(),
					nivelAtual);
			ts.addItem(novo);
			if (token.getLexeme() == "processa") {
				log(novo.toString());
				System.exit(0);
			}
		
		}
	}

	public void acao118(Token token) {
		ts.setNPF(NPF);
	}

	public void acao119(Token token) {
		ts.setTipoMetodo(tipoMetodo);
	}

	public void acao120(Token token) {
		/*
		 * for (Item i : ts.getTabela()) { if (i.getNivel() == nivelAtual) {
		 * ts.getTabela().remove(i); } }
		 */
		this.nivelAtual = this.nivelAtual - 1;
	}

	public void acao121(Token token) {
		contextoLid = ContextoLID.PARAMETRO_FORMAL;
		ts.setPrimeiraPosicaoLID(ts.getTabela().size());
	}

	public void acao122(Token token) {
		ts.setUltimaPosicaoLID(ts.getTabela().size() + NPF);
	}

	public void acao123(Token token) throws SemanticError {
		if (tipoAtual != TipoVariavel.BOOLEANO
				|| tipoAtual != TipoVariavel.CARACTER
				|| tipoAtual != TipoVariavel.INTEIRO
				|| tipoAtual != TipoVariavel.REAL) {
			throw new SemanticError(
					"Par�metros devem ser de tipo Pr�-Definido",
					token.getPosition());
		} else {

			for (int i = ts.getPrimeiraPosicaoLID(); i < ts
					.getUltimaPosicaoLID(); i++) {

				Item atual = ts.getTabela().get(i);
				atual.setTipoCategoria(Categoria.PARAMETRO);

				atual.setTipo(tipoAtual);

				atual.setMPP(MPP);
				listaPar.add(atual);
			}
		}
	}

	public void acao124(Token token) throws SemanticError {
		if (tipoAtual == TipoVariavel.CADEIA) {
			throw new SemanticError("M�todos devem ser de tipo pr�-definido",
					token.getPosition());
		} else {
			tipoMetodo = tipoAtual;
		}
	}

	public void acao125(Token token) {
		tipoMetodo = TipoVariavel.NULO;
	}

	public void acao126(Token token) {
		MPP = TipoParametro.REFERENCIA;
	}

	public void acao127(Token token) {
		MPP = TipoParametro.VALOR;
	}

	public void acao128(Token token) throws SemanticError {
		if (!ts.estaDeclaradoNivelMenor(token.getLexeme(), nivelAtual)) {
			throw new SemanticError("128 - Identificador n�o declarado",
					token.getPosition());
		} else {
			posID = ts.getPosicaoIDTS(token, nivelAtual);
		}
	}

	public void acao129(Token token) throws SemanticError {
		if (tipoExpressao != TipoVariavel.BOOLEANO
				&& tipoExpressao != TipoVariavel.INTEIRO) {
			throw new SemanticError("Tipo Inv�lido da express�o",
					token.getPosition());
		} else {
			/* A��o Gera��o de C�digo */
		}
	}

	public void acao130(Token token) {
		contextoLid = ContextoLID.LEITURA;
	}

	public void acao131(Token token) {
		contextoEXPR = ContextoLID.IMPRESSAO;
	}

	public void acao132(Token token) throws SemanticError {
		if (tipoMetodo == tipoMetodo.NULO) {
			throw new SemanticError(
					"'Retorne' s� pode ser usado em M�todo com tipo",
					token.getPosition());
		} else {
			if (tipoExpressao != tipoMetodo) {
				throw new SemanticError("Tipo retorno Invalido",
						token.getPosition());
			} else {
				/* A��o gera��o Codigo */
			}
		}
	}

	public void acao133(Token token) throws SemanticError {
		Item item = ts.getElementoPosicao(posID);
		if (item.getTipoCategoria() == Categoria.VARIAVEL
				|| item.getTipoCategoria() == Categoria.PARAMETRO) {
			if (item.getTipoSubCategoria() == SubCategoria.VETOR) {
				throw new SemanticError("Id deveria ser indexado",
						token.getPosition());
			} else {
				tipoLadoEsquerdo = item.getTipo();
				System.out.println("PosID: " + posID);
				System.out.println("Tipo lado esq: " + tipoLadoEsquerdo);
				System.out.println("Item: " + item);
			}
		} else {
			throw new SemanticError("Id deveria ser variavel ou parametro",
					token.getPosition());
		}
	}

	public void acao134(Token token) throws SemanticError {
		Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);
		if (tipoExpressao != tipoLadoEsquerdo) {
			throw new SemanticError("Tipos Inconpativeis ( "
					+ String.valueOf(tipoExpressao) + " - "
					+ String.valueOf(tipoLadoEsquerdo + " )"),
					token.getPosition());
		} else {
			/* gera��o c�digo */
		}
	}

	public void acao135(Token token) throws SemanticError {
		Item item = ts
				.getIdNomePosicaoNivelMenor(token.getLexeme(), nivelAtual);
		if (item.getTipoCategoria() == Categoria.VARIAVEL) {
			throw new SemanticError("Esperava-se uma vari�vel",
					token.getPosition());
		} else {
			if (item.getTipoSubCategoria() != SubCategoria.VETOR
					&& item.getTipoSubCategoria() != SubCategoria.CADEIA) {
				throw new SemanticError(
						"Apenas vetores e cadeias podem ser indexados",
						token.getPosition());
			} else {
				tipoVarIndexada = item.getTipoSubCategoria();
			}
		}
	}

	public void acao136(Token token) throws SemanticError {
		if (tipoExpressao != TipoVariavel.INTEIRO) {
			throw new SemanticError("Indice deveria ser inteiro",
					token.getPosition());
		} else {
			if (tipoVarIndexada == SubCategoria.CADEIA) {
				tipoLadoEsquerdo = TipoVariavel.CARACTER;
			} else {
				// verificar
				// tipoLadoEsquerdo = tipoElementosVetor;
			}
		}
	}

	public void acao137(Token token) throws SemanticError {
		Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);
		if (item.getTipoCategoria() == Categoria.METODO) {
			throw new SemanticError("id Deveria ser um metodo",
					token.getPosition());
		} else {
			if (tipoMetodo != TipoVariavel.NULO) {
				throw new SemanticError("Esperava-se m�todo sem tipo",
						token.getPosition());
			}
		}
	}

	public void acao138(Token token) {
		NPA = 0;
		contextoEXPR = ContextoLID.PARAMETRO_ATUAL;
	}

	public void acao139(Token token) throws SemanticError {
		if (NPA != NPF) {
			throw new SemanticError("Erro na quantidade de Parametros",
					token.getPosition());
		} else {
			/* G. C�digo para chamada de proc */
		}
	}

	public void acao140(Token token) throws SemanticError {
		Item item = ts
				.getIdNomePosicaoNivelMenor(token.getLexeme(), nivelAtual);
		System.out.println("asdasdasdas   " + item.toString());
		if (item.getTipoCategoria() != Categoria.METODO) {
			throw new SemanticError("id deveria ser metodo",
					token.getPosition());
		} else {
			if (tipoMetodo != TipoVariavel.NULO) {
				throw new SemanticError("Esperava-se metodo sem tipo",
						token.getPosition());

			} else {
				if (NPF != 0) {
					throw new SemanticError("Erro na quantidade de Parametros",
							token.getPosition());
				} else {
					/* GC para chamada de metodos */
				}
			}
		}
	}

	public void acao141(Token token) throws SemanticError {
		if (contextoEXPR == ContextoLID.PARAMETRO_ATUAL) {
			if (NPF > 0) {
				NPA++;
			}
		}

		if (contextoEXPR == ContextoLID.IMPRESSAO) {
			throw new SemanticError("Tipo invalido para impressao",
					token.getPosition());
		}
	}

	public void acao142(Token token) {
		tipoExpressao = tipoExpressaoSimples.pop();
	}

	public void acao143(Token token) throws SemanticError {
		if (tipoExpressao != tipoExpressaoSimples.peek()) {
			throw new SemanticError("Operandos incompat�veis",
					token.getPosition());
		} else {
			tipoExpressao = TipoVariavel.BOOLEANO;
		}
	}

	public void acao144(Token token) {
		operadorComparacao = OperadorComparacao.IGUAL;
	}

	public void acao145(Token token) {
		operadorComparacao = OperadorComparacao.MENOR;
	}

	public void acao146(Token token) {
		operadorComparacao = OperadorComparacao.MAIOR;
	}

	public void acao147(Token token) {
		operadorComparacao = OperadorComparacao.MAIOR_IGUAL;
	}

	public void acao148(Token token) {
		operadorComparacao = OperadorComparacao.MENOR_IGUAL;
	}

	public void acao149(Token token) {
		operadorComparacao = OperadorComparacao.DIFERENTE;
	}

	public void acao150(Token token) {
		tipoExpressaoSimples.push(tipoFator);
	}

	public void acao151(Token token) throws SemanticError {
		TipoVariavel tpe = tipoExpressaoSimples.peek();
		TipoVariavel tpm = tipoTermo.peek();

		switch (operadorAtual) {
		case ADICAO:

			if (tpe == TipoVariavel.INTEIRO || tpe == TipoVariavel.REAL) {
				if (tpm == TipoVariavel.INTEIRO || tpm == TipoVariavel.REAL) {
					// gera cdo
				} else {
					throw new SemanticError(
							"151 [ add ] Operandos incompat�veis",
							token.getPosition());
				}
			} else {
				throw new SemanticError("151 [ add ] Operandos incompat�veis",
						token.getPosition());
			}

			break;
		case SUBTRACAO:
			if (tpe == TipoVariavel.INTEIRO || tpe == TipoVariavel.REAL) {
				if (tpm == TipoVariavel.INTEIRO || tpm == TipoVariavel.REAL) {
					// gera cdo
				} else {
					throw new SemanticError(
							"151 [ add ] Operandos incompat�veis",
							token.getPosition());
				}
			} else {
				throw new SemanticError("151 [ add ] Operandos incompat�veis",
						token.getPosition());
			}
			break;
		case OU:
			if (tipoExpressaoSimples.peek() != TipoVariavel.BOOLEANO) {
				throw new SemanticError("151 [ ou ] Operandos incompat�veis",
						token.getPosition());
			}
			break;
		default:
			log(token.getLexeme());
			break;
		}
	}

	public void acao152(Token token) throws SemanticError {

		if (tipoFator != tipoExpressaoSimples.peek()) {
			throw new SemanticError("Operandos incompat�veis�",
					token.getPosition());
		} else {
			TipoVariavel tipo = tipoExpressaoSimples.pop();
			switch (operadorAtual) {
			case ADICAO:
				if ((tipo == TipoVariavel.INTEIRO && tipoFator == TipoVariavel.REAL)
						|| (tipo == TipoVariavel.REAL && tipoFator == TipoVariavel.REAL)
						|| tipo == TipoVariavel.REAL
						&& tipoFator == TipoVariavel.INTEIRO) {
					tipoExpressaoSimples.push(TipoVariavel.REAL);
				} else {
					tipoExpressaoSimples.push(TipoVariavel.INTEIRO);
				}
				break;
			case SUBTRACAO:
				if ((tipo == TipoVariavel.INTEIRO && tipoFator == TipoVariavel.REAL)
						|| (tipo == TipoVariavel.REAL && tipoFator == TipoVariavel.REAL)
						|| tipo == TipoVariavel.REAL
						&& tipoFator == TipoVariavel.INTEIRO) {
					tipoExpressaoSimples.push(TipoVariavel.REAL);
				} else {
					tipoExpressaoSimples.push(TipoVariavel.INTEIRO);
				}
				break;

			case OU:
				if (tipo == TipoVariavel.BOOLEANO
						&& tipoFator == TipoVariavel.BOOLEANO) {
					tipoExpressaoSimples.push(TipoVariavel.BOOLEANO);
				}
				break;
			default:
				log(token.getLexeme());
				break;
			}
		}
	}

	public void acao153(Token token) {
		operadorAtual = Operador.ADICAO;
	}

	public void acao154(Token token) {
		operadorAtual = Operador.SUBTRACAO;
	}

	public void acao155(Token token) {
		operadorAtual = Operador.OU;
	}

	public void acao156(Token token) {
		tipoTermo.push(tipoFator);
	}

	public void acao157(Token token) throws SemanticError {

		switch (operadorAtual) {
		case MULTIPLICACAO:
			if (tipoTermo.peek() != TipoVariavel.INTEIRO
					&& tipoTermo.peek() != TipoVariavel.REAL) {
				throw new SemanticError("157 - Operandos incompat�veis",
						token.getPosition());
			}
			break;

		case DIVISAO:
			if (tipoTermo.peek() != TipoVariavel.INTEIRO
					&& tipoTermo.peek() != TipoVariavel.REAL) {
				throw new SemanticError("Operandos incompat�veis�",
						token.getPosition());
			}
			break;
		case E:
			if (tipoTermo.peek() != TipoVariavel.BOOLEANO) {
				throw new SemanticError("Operandos incompat�veis�",
						token.getPosition());
			}
			break;

		case DIV:
			if (tipoTermo.peek() != TipoVariavel.INTEIRO) {
				throw new SemanticError("Operandos incompat�veis",
						token.getPosition());
			}
			break;

		default:
			break;
		}
	}

	public void acao158(Token token) throws SemanticError {

		boolean operavel = false;

		TipoVariavel t1 = tipoTermo.pop();
		TipoVariavel t2 = tipoTermo.pop();

		switch (operadorAtual) {
		case ADICAO:
			if ((t1 == TipoVariavel.INTEIRO || t1 == TipoVariavel.REAL)
					&& (t1 == TipoVariavel.INTEIRO || t1 == TipoVariavel.REAL)) {
				operavel = true;
			}
			break;
		case DIVISAO:
			if (t1 == TipoVariavel.INTEIRO || t1 == TipoVariavel.REAL) {
				if (t2 == TipoVariavel.INTEIRO || t2 == TipoVariavel.REAL) {
					operavel = true;
				}
			}
			break;
		case DIV:
			operavel = (t1 == TipoVariavel.INTEIRO && t2 == TipoVariavel.INTEIRO);
			break;
		case MULTIPLICACAO:
			if (t1 == TipoVariavel.INTEIRO || t1 == TipoVariavel.REAL) {
				if (t2 == TipoVariavel.INTEIRO || t2 == TipoVariavel.REAL) {
					operavel = true;
				}
			}
			break;
		case E:
			operavel = (t1 == TipoVariavel.BOOLEANO && t2 == TipoVariavel.BOOLEANO);
			break;

		case OU:
			operavel = (t1 == TipoVariavel.BOOLEANO && t2 == TipoVariavel.BOOLEANO);
			break;

		case SUBTRACAO:
			if (t1 == TipoVariavel.INTEIRO || t1 == TipoVariavel.REAL) {
				if (t2 == TipoVariavel.INTEIRO || t2 == TipoVariavel.REAL) {
					operavel = true;
				}
			}
			break;

		default:
			break;
		}

		if (operavel) {
			// Geracao de cod
		} else {
			throw new SemanticError("Operadores n�o s�o compat�veis",
					token.getPosition());
		}
	}

	public void acao159(Token token) {
		operadorAtual = Operador.MULTIPLICACAO;
	}

	public void acao160(Token token) {

		operadorAtual = Operador.DIVISAO;
	}

	public void acao161(Token token) {
		operadorAtual = Operador.E;
	}

	public void acao162(Token token) {
		operadorAtual = Operador.DIV;
	}

	public void acao163(Token token) throws SemanticError {
		if (opNega) {
			throw new SemanticError("Opera��o 'n�o' repetido - n�o pode!",
					token.getPosition());
		} else {
			opNega = true;
		}
	}

	public void acao164(Token token) throws SemanticError {
		if (tipoFator != TipoVariavel.BOOLEANO) {
			throw new SemanticError("Opera��o 'n�o' exige operando booleano",
					token.getPosition());
		} else {
			opNega = false;
		}
	}

	public void acao165(Token token) throws SemanticError {
		if (OpUnario) {
			throw new SemanticError("Operador Un�rio repetido",
					token.getPosition());
		} else {
			OpUnario = true;
		}
	}

	public void acao166(Token token) throws SemanticError {
		if (tipoFator != TipoVariavel.INTEIRO || tipoFator != TipoVariavel.REAL) {
			throw new SemanticError(
					"Operador Un�rio exige exige operando numero",
					token.getPosition());
		} else {
			OpUnario = false;
		}
	}

	public void acao167(Token token) {
		opNega = OpUnario = false;
	}

	public void acao168(Token token) {
		tipoFator = tipoExpressao;
	}

	public void acao169(Token token) {
		tipoFator = tipoVariavel;
	}

	public void acao170(Token token) {
		tipoFator = tipoConstante;
	}

	public void acao171(Token token) throws SemanticError {

		Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);
		pilhaMetodos.push(item);
		if (item.getTipoCategoria() != Categoria.METODO) {
			throw new SemanticError("id deveria ser um metodo",
					token.getPosition());
		} else {
			if (tipoMetodo == TipoVariavel.NULO) {
				throw new SemanticError("Esperava-se m�todo com tipo",
						token.getPosition());
			} else {
				NPA = 0;
				contextoEXPR = ContextoLID.PARAMETRO_ATUAL;
			}
		}
	}

	public void acao172(Token token) throws SemanticError {
		if (NPA == NPF) {
			if (tipoVariavel == tipoResultadoFuncao) {
			} else {
				throw new SemanticError("Erro no numero de parametros",
						token.getPosition());
			}
		}
	}

	// verificar tipoVarIndexada e tipoElementos
	public void acao173(Token token) throws SemanticError {

		if (tipoExpressao != TipoVariavel.INTEIRO) {
			throw new SemanticError("Indice deveria ser inteiro",
					token.getPosition());
		} else {
		}
	}

	// verificar tipo resultado
	public void acao174(Token token) throws SemanticError {

		Item id = ts.getIdNomePosicaoNivelMenor(token.getLexeme(), nivelAtual);

		if (id == null) {
			throw new SemanticError("Id n�o existe o_O", token.getPosition());
		}

		if (id.getTipoCategoria() == Categoria.VARIAVEL
				|| id.getTipoCategoria() == Categoria.PARAMETRO) {

			if (id.getTipoSubCategoria() == SubCategoria.VETOR) {
				throw new SemanticError("Indice deveria ser inteiro",
						token.getPosition());
			} else {
				tipoVariavel = id.getTipo();
			}

		} else {

			if (id.getTipoCategoria() == Categoria.METODO) {
				if (tipoMetodo == TipoVariavel.NULO) {
					throw new SemanticError("Esperava-se metodo com tipo",
							token.getPosition());
				} else {
					if (NPF != 0) {
						throw new SemanticError(
								"Erro na quantidade de parametros",
								token.getPosition());
					} else {
						tipoVariavel = tipoAtual;
					}
				}
			} else {
				if (id.getTipoCategoria() == Categoria.CONSTANTE) {
					tipoVariavel = tipoConstante;
				} else {
					throw new SemanticError(
							"Esperava-se var, id-m�todo ou constante",
							token.getPosition());
				}
			}
		}
	}

	public void acao175(Token token) throws SemanticError {
		if (!ts.estaDeclarado(token.getLexeme(), nivelAtual)) {
			throw new SemanticError("Identificador n�o declarado: "
					+ token.getLexeme(), token.getPosition());
		} else {
			Item item = ts.getIdNomePosicao(token.getLexeme(), nivelAtual);// constante

			if (item.getTipoCategoria() != Categoria.CONSTANTE) {
				throw new SemanticError("id de Constante esperado",
						token.getPosition());
			} else {
				tipoConstante = item.getTipo();
				valConst = item.getValor();
			}
		}
	}

	public void acao176(Token token) throws SemanticError {

		tipoConstante = TipoVariavel.INTEIRO;
		valConst = token.getLexeme();
	}

	public void acao177(Token token) throws SemanticError {

		tipoConstante = TipoVariavel.REAL;
		valConst = token.getLexeme();
	}

	public void acao178(Token token) throws SemanticError {

		tipoConstante = TipoVariavel.BOOLEANO;
		valConst = token.getLexeme();
	}

	public void acao179(Token token) throws SemanticError {

		tipoConstante = TipoVariavel.BOOLEANO;
		valConst = token.getLexeme();
	}

	public void acao180(Token token) throws SemanticError {

		tipoConstante = TipoVariavel.CARACTER;
		valConst = token.getLexeme();
	}

	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("A��o #" + action + ", Token: " + token);

		try {
			@SuppressWarnings("rawtypes")
			Class[] classeParametros = new Class[] { Token.class };
			java.lang.String nomeMetodo = "acao" + action;
			Method metodo = getClass().getMethod(nomeMetodo, classeParametros);
			Object[] argumentos = new Object[] { token };

			metodo.invoke(this, argumentos);

		} catch (InvocationTargetException e) {
			if (e.getCause() instanceof SemanticError) {
				SemanticError erroSemantico = (SemanticError) e.getCause();
				throw erroSemantico;
			} else {
				e.printStackTrace();
			}

		} catch (NoSuchMethodException e) {
			throw new SemanticError("Erro, a a��o #" + action
					+ " n�o foi implementada. ", token.getPosition());
		} catch (Exception e) {
			throw new SemanticError("Erro ao invocar m�todo."
					+ e.getCause().getMessage(), token.getPosition());
		}
	}

	public TipoVariavel getTipoAtual() {
		return tipoAtual;
	}

	public void setTipoAtual(TipoVariavel tipoVariavel) {
		this.tipoAtual = tipoVariavel;
	}

	public static void logline(int line) {
		System.out.println(" (" + new Semantico().getClass().getSimpleName()
				+ ".java:" + line + ") ");
	}

	public static void log(Object e) {
		System.out.println(e);
	}
}

// LID = LIsta de Declaracao
