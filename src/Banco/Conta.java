package Banco;

public class Conta {
	
	protected String nome;
	protected int numero;
	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void creditar(double saldo) {
		this.saldo += saldo;
	}

	public void debitar(double saldo) {
		
		this.saldo -= saldo;
	}
	public void atualizar(double porcentagem) {
		this.saldo += this.saldo * (porcentagem*0.01);
	}

}
