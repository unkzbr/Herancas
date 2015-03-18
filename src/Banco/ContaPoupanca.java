package Banco;

public class ContaPoupanca extends Conta{

	public void atualizar(int porcentagem) {
		this.saldo += (getSaldo()) * (porcentagem*0.03);
	}

	
}
