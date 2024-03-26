package model;

public class ContaEspecial extends ContaBancaria {

	private float limite;

	public ContaEspecial(float limite) {
		super();
		this.limite = limite;
	}

	@Override
	public void sacar(float retirada) throws Exception {
		if (retirada > getSaldo() + limite) {
			String e = "Saldo Insuficiente";
		} else {
			setSaldo(getSaldo() - retirada);
		}
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

}
