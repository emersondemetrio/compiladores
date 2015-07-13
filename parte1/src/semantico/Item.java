package semantico;

public class Item {

	private String nome;
	private int nivel;
	private int deslocamento;
	private String tipoAtual;
	private Categoria tipoCategoria;
	private SubCategoria tipoSubCategoria;
	
	private int tamanho;

	public Item() {

	}

	public Item(Categoria categoria, String nome, int nivel, int deslocamento) {
		this.tipoCategoria = categoria;
		this.nome = nome;
		this.nivel = nivel;
		this.deslocamento = deslocamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento = deslocamento;
	}

	public String getTipoAtual() {
		return tipoAtual;
	}

	public void setTipoAtual(String tipoAtual) {
		this.tipoAtual = tipoAtual;
	}

	public Categoria getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(Categoria tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public SubCategoria getTipoSubCategoria() {
		return tipoSubCategoria;
	}

	public void setTipoSubCategoria(SubCategoria tipoSubCategoria) {
		this.tipoSubCategoria = tipoSubCategoria;
	}
}
