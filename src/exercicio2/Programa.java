package exercicio2;

public class Programa {

	public static void main(String[] args) {

		Cachorro a1 = new Cachorro();
		Animal cachorro = a1;
		
		Gato a2 = new Gato();
		Animal gato = a2;

		Vaca a3 = new Vaca();
		Animal vaca = a3;
		
		
		cachorro.emitirSom();
		gato.emitirSom();
		vaca.emitirSom();
		
	}

}
