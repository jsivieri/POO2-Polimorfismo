package exercicio11;

public class Conta {

	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}


	private double saldo;
		
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double sacar(double saque) {
		if (saque>saldo) {
			System.out.println("Saldo insuficiente");
			return saldo;
		} else {
			return saldo-saque;
		}
		
	}

}
