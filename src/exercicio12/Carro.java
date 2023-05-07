package exercicio12;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	@Override 
	public void ligar(){
		System.out.println("Ligar carro: "+getModelo());
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligar carro: "+getModelo());
	}
}
