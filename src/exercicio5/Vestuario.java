package exercicio5;

public class Vestuario extends Produto{

	public void calcularDesconto(double valorVestuario) {
		valorVestuario = this.getValor()*0.5;
		
		
		System.out.println("Vestuário sem desconto: R$ "+this.getValor()+"  Vestuário com desconto: R$ "+valorVestuario);
	}

}
