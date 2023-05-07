package exercicio5;

public class Eletronico extends Produto{
	
		
	public void calcularDesconto(double valorEletronico) {
		valorEletronico = this.getValor()*0.8;
		
		
		System.out.println("Eletronico sem desconto: R$ "+this.getValor()+"  Eletronico com desconto: R$ "+valorEletronico);
	}

}
