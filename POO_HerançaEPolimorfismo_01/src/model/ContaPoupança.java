package model;

public class ContaPoupança extends ContaBancaria {

	private int diaDeRendimento;

	public ContaPoupança(int diaDeRendimento) {
		super();
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public void CalcularNovoSaldo(int taxa) {
		double taxa1 = taxa * 0.01d;
		float novo = (float) ((getSaldo()*taxa1) + getSaldo());
		setSaldo(novo);
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

}
