package Banco;

public class Programa extends Conta{

	public static void main(String[] args) {
		Conta cc = new Conta();
		ContaCorrente cc2 = new ContaCorrente();
		ContaPoupanca cc3 = new ContaPoupanca();
		cc.setSaldo(1000);
		cc.atualizar(10);
		cc2.setSaldo(1000);
		cc2.atualizar(10);
		cc3.setSaldo(1000);
		cc3.atualizar(10);
		cc2.creditar(10);
		
		
		System.out.println(cc.getSaldo());
		System.out.println(cc2.getSaldo());
		System.out.println(cc3.getSaldo());
	}
}
