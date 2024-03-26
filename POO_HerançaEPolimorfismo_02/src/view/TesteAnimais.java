package view;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class TesteAnimais {

	public static void main(String[] args) {
		
		List<Animal>Zoologico = new ArrayList<Animal>();
		
		Animal Camelo = new Animal();
		Camelo.alteraNome("Camelo");
		Camelo.alteraComprimento(150);
		Camelo.alteraNumPatas(4);
		Camelo.alteraCor("Amarelo");
		Camelo.alteraAmbiente("Terra");
		Camelo.alteraVelocidade(2.0f);
		Zoologico.add(Camelo);
		
		Peixe Tubarão = new Peixe("Barbatanas e Cauda");
		Tubarão.alteraNome("Tubarão");
		Tubarão.alteraComprimento(300);
		Tubarão.alteraNumPatas(0);
		Tubarão.alteraCor("Cor");
		Tubarão.alteraAmbiente("Mar");
		Tubarão.alteraVelocidade(1.5f);
		Zoologico.add(Tubarão);
		
		Mamifero Urso_Do_Canada = new Mamifero("Mel");
		Urso_Do_Canada.alteraComprimento(180);
		Urso_Do_Canada.alteraNumPatas(4);
		Urso_Do_Canada.alteraCor("Vermelho");
		Urso_Do_Canada.alteraAmbiente("Terra");
		Urso_Do_Canada.alteraVelocidade(0.5f);
		Zoologico.add(Urso_Do_Canada);
	}

}
