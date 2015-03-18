package Banco;

public class ContaCorrente extends Conta {
	
	
	
	public void atualizar(int porcentagem) {
		this.saldo += (getSaldo()) * (porcentagem*0.02);
		
	}

	public void creditar(double valor) {
		super.creditar(valor - 0.10);
	}
	

}
