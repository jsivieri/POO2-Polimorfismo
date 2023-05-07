package exercicio12;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Veiculo v1 = new Veiculo();
		v1.ligar();
		v1.desligar();
		
		Carro c1 = new Carro("Chevrolet","Cruze",2022);
		c1.ligar();
		c1.desligar();
		
		Moto m1 = new Moto("Yamaha","Fazer",2014);
		m1.ligar();
		m1.desligar();
		
	}

}
