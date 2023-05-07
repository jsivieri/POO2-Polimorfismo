package exercicio11;

public class ContaCorrente extends ContaEspecial {


	public ContaCorrente(double saldo, double limiteCredito) {
		super(saldo);
		this.setLimiteCredito(limiteCredito);
		this.setSaldo(saldo);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double sacar(double saque) {
		if (saque>(getSaldo()+getLimiteCredito())) {
			System.out.println("Saldo insuficiente");
			return getSaldo();
		} else {
			double saldoAtual = getSaldo()-saque;
			this.setSaldo(saldoAtual);
			System.out.println("Saldo atual incluindo limite: "+(saldoAtual+getLimiteCredito()));
			System.out.println("Saldo real atual: "+getSaldo());
			return saldoAtual;
		}
		
	}

}
