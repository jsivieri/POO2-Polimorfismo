package exercicio11;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldo) {
		this.setSaldo(saldo);
		
	}
		
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public double sacar(double saque) {
		if (saque>(getSaldo())) {
			System.out.println("Saldo insuficiente");
			return getSaldo();
		} else {
			double saldoAtual = (getSaldo())-saque;
			this.setSaldo(saldoAtual);
			System.out.println("Saldo atual em poupança: "+getSaldo());
			return saldoAtual;
		}
		
	}
	
	public double pagarJuros(double juro) {
		double calculo = 1+juro/100;
		if (this.getSaldo()>0) {
			setSaldo(this.getSaldo()*calculo);
			return getSaldo();	
		
		}
		else 
			return getSaldo(); 
				
	}

}
