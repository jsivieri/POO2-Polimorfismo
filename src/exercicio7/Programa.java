package exercicio7;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Circulo c1 = new Circulo();
		c1.setRaio(8);
		Figura circulo1 = c1;
		Retangulo r1 = new Retangulo();
		r1.setAltura(20);
		r1.setBase(30);
		Figura retangulo1 = r1;
		Triangulo t1 = new Triangulo();
		t1.setAltura(13);
		t1.setBase(22);
		Figura triangulo1 = t1;
		
		
		c1.calcularArea();
		r1.calcularArea();
		t1.calcularArea();
		circulo1.calcularArea();
		retangulo1.calcularArea();
		triangulo1.calcularArea();

	}

}
