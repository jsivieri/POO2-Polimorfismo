package exercicio7;

public class Triangulo  extends Figura{
	
	private int base, altura;

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public void calcularArea() {
		System.out.println("Área do triângulo: "+(this.getBase()*this.getAltura())/2);
	}

}
