package exercicio9;

public class Circulo extends Forma{
	
	private int raio;
	
	

	public Circulo(int raio) {
		this.raio = raio;
	}
	
		
	
	public int getRaio() {
		return raio;
	}



	public void setRaio(int raio) {
		this.raio = raio;
	}


		
	public double calcularArea() {
		return this.getRaio()*this.getRaio()*Math.PI;
						
	}
	


}
