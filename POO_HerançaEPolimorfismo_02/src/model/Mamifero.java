package model;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero(String alimento) {
		super();
		this.alimento = alimento;
	}

	public String Alimento() {
		return alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String dados() {
		return "Nome: " + getNome() + "\nComprimento: " + getComprimento() + 
				"\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + 
				"\nAlimento: "+ alimento;
	}
	
	
	
}
