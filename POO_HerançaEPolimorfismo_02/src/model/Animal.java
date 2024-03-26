package model;

public class Animal {

	private String nome;
	private int comprimento;
	private int numPatas = 4;
	private String cor;
	private String ambiente;
	private float velocidade;

	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void alteraNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public String dados() {
		return "Nome: " + nome + "\nComprimento: " + comprimento + "cm\nCor: " + cor + "\nAmbiente: " + ambiente;
	}

}
