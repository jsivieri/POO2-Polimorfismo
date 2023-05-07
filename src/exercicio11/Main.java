package exercicio11;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {


		ContaCorrente cc1 = new ContaCorrente(2000,3000);
		cc1.sacar(300);
						
		ContaPoupanca cp1 = new ContaPoupanca(10000);
		ContaPoupanca cp2 = new ContaPoupanca(500);
		ContaPoupanca cp3 = new ContaPoupanca(3900);
		ContaPoupanca cp4 = new ContaPoupanca(4852);
		ContaPoupanca cp5 = new ContaPoupanca(45000);
		ContaPoupanca cp6 = new ContaPoupanca(14752);
		cp1.sacar(2000);
					
		ArrayList<Double> juros = new ArrayList<Double>();
		juros.add(cp1.pagarJuros(0.49));
		juros.add(cp2.pagarJuros(0.5));
		juros.add(cp3.pagarJuros(0.8));
		juros.add(cp4.pagarJuros(0.49));
		juros.add(cp5.pagarJuros(0.87));
		juros.add(cp6.pagarJuros(0.44));
					
		
	    int i;
		int n = juros.size();
	    for (i=0; i<n; i++) {
	    	 System.out.printf("Saldo com juros %d- %s\n", i, juros.get(i));
	    	 	      		
	}

}
}
