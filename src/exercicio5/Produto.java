package exercicio5;

public class Produto {

	private double valor;



	public Produto() {
		super();
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void calcularDesconto() {
		
		System.out.println("Valor do produto: R$ "+this.getValor());
	}
	
	

	

}
