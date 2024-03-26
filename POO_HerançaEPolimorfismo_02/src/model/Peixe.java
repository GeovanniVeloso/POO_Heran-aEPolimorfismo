package model;

public class Peixe extends Animal {
	
	private String caracteristica;

	public Peixe(String caracteristica) {
		super();
		this.caracteristica = caracteristica;
	}

	public String Caracteristica() {
		return caracteristica;
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String dados() {
		return "Nome: " + getNome() + "\nComprimento: " + getComprimento() + 
				"\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + 
				"\nCaracterísticas: "+ caracteristica;
	}

}
