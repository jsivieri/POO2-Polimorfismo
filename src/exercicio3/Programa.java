package exercicio3;

public class Programa {

	public static void main(String[] args) {

	
	
	Carro v1 = new Carro();
	Veiculo carro = v1;
	
	Moto v2 = new Moto();
	Veiculo moto = v2;
	
	Caminhao v3 = new Caminhao();
	Veiculo caminhao = v3;
	
	v1.acelerar();
	v2.acelerar();
	v3.acelerar();
	
	carro.acelerar();
	moto.acelerar();
	caminhao.acelerar();
	
	
	}
		

}


