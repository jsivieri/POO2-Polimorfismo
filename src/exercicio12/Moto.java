package exercicio12;

public class Moto extends Veiculo{

	public Moto(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		
	}
	
	@Override 
	public void ligar(){
		System.out.println("Ligar moto");
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligar moto");
	}

}
