package exercicio11;

public class ContaEspecial extends Conta{

	public ContaEspecial() {
		// TODO Auto-generated constructor stub
	}

		public ContaEspecial(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	private double limiteCredito;

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	

}
