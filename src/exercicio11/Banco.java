package exercicio11;


public class Banco extends Conta{

	
	public Banco(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public Banco() {
		// TODO Auto-generated constructor stub
	}
	
	
	public double pagarJuros(double juro) {
		double calculo = 1+juro/100;
		if (this.getSaldo()>0) {
			double valor;
			valor = this.getSaldo()*calculo;
			return valor;
		
		}
		else 
			return getSaldo();	
	}
	
	

}
