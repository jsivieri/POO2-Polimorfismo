package exercicio9;

public class Triangulo extends Forma{
	
	private int lado, altura;

	public Triangulo(int lado, int altura) {
		this.altura = altura;
		this.lado = lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	public double calcularArea() {
		return this.getLado()*this.getAltura()/2;
		
	}

}
