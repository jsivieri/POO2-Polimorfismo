package exercicio8;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Notebook n1 = new Notebook();
		n1.iniciar();
		Computador notebook1 = n1;
		Desktop d1 = new Desktop();
		d1.iniciar();
		Computador desktop1 = d1;
		Servidor s1 = new Servidor();
		s1.iniciar();
		Computador servidor1 = s1;
		
		
		notebook1.iniciar();
		desktop1.iniciar();
		servidor1.iniciar();
		

	}

}
