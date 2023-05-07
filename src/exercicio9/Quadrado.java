package exercicio9;

public class Quadrado extends Forma{
	
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;

	}
	
	
	
	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}



	public double calcularArea() {
		return this.getLado()*this.getLado();
		
	}

}
