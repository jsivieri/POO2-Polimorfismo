package exercicio5;

public class Alimento extends Produto{

	public void calcularDesconto(double valorAlimento) {
		valorAlimento = this.getValor()*0.5;
		
		
		System.out.println("Alimento sem desconto: R$ "+this.getValor()+"  Alimento com desconto: R$ "+valorAlimento);
	}

}
