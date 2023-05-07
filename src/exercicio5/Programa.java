package exercicio5;

public class Programa {

	public static void main(String[] args) {


		Eletronico p1 = new Eletronico();
		p1.setValor(1000);
		Produto eletronico = p1;
		
		Vestuario p2 = new Vestuario();
		p2.setValor(280);
		Produto vestuario = p2;
		
		Alimento p3 = new Alimento();
		p3.setValor(25);
		Produto alimento = p3;
		
		
		eletronico.calcularDesconto();
		vestuario.calcularDesconto();
		alimento.calcularDesconto();
		
		p1.calcularDesconto(0);
		p2.calcularDesconto(0);
		p3.calcularDesconto(0);
		


	}

}
