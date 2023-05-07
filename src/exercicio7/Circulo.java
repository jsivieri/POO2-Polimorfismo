package exercicio7;

public class Circulo extends Figura{

	private int raio;

	public Circulo() {

	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	
	public void calcularArea() {
		System.out.println("Área do círculo: "+(this.getRaio()*this.getRaio()*Math.PI)/2);
	}

}
