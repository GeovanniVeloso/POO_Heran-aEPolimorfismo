package view;

import model.ContaEspecial;
import model.ContaPoupança;

public class Contas {

	public static void main(String[] args) {
		
		ContaPoupança ContP = new ContaPoupança(22);
		ContP.setCliente("Geovanni");
		ContP.setNum_conta(6865);
		ContP.setSaldo(1200f);
		
		ContaEspecial ContE = new ContaEspecial(150f);
		ContE.setCliente("Gustavo");
		ContE.setNum_conta(1467);
		ContE.setSaldo(2000f);
		
		try {
			ContP.sacar(200f);
			ContE.sacar(200f);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			ContP.sacar(5000f);
			ContE.sacar(5000f);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			ContE.sacar(1900f);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		ContP.depositar(1000);
		ContE.depositar(1000);
		
		ContP.CalcularNovoSaldo(15);
		System.out.println(ContP.getSaldo());
		
		System.out.println("Cliente: "+ContP.getCliente()+"\nSaldo: R$"+ContP.getSaldo()+"\nNúmero da Conta: "+ContP.getNum_conta());
		System.out.println("Cliente: "+ContE.getCliente()+"\nSaldo: R$"+ContE.getSaldo()+"\nNúmero da Conta: "+ContE.getNum_conta()+"\nLimite: "+ContE.getLimite());

	}

}
