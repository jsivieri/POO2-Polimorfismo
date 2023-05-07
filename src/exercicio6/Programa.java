package exercicio6;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	ContaCorrente cc1 = new ContaCorrente();
	Conta cCorrente1 = cc1;
	ContaPoupanca cp1 = new ContaPoupanca();
	Conta cPoupanca = cp1;
	ContaCorrente cc2 = new ContaCorrente();
	Conta cCorrente2 = cc2;
	
	cc1.verificarConta();
	cCorrente1.verificarConta();
	cc2.verificarConta();
	cPoupanca.verificarConta();
	cc2.verificarConta();
	cCorrente2.verificarConta();
	
	
	}	
	
}
