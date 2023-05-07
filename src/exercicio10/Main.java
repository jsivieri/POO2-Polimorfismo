package exercicio10;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
				
		Cachorro c1 = new Cachorro();
		Animal cachorro1 = c1;
		Gato g1 = new Gato();
		Animal gato1 = g1;
		Vaca v1 = new Vaca();
		Animal vaca1 = v1;
		Galinha gl1 = new Galinha();
		Animal galinha1 = gl1;
		
		
		List<Animal> animais = new ArrayList<Animal>();
		animais.add(c1);
		animais.add(g1);
		animais.add(v1);
		animais.add(gl1);
		
				
		cachorro1.comer();
		c1.amamentar();
		gato1.comer();
		g1.amamentar();
		vaca1.comer();
		v1.amamentar();
		gl1.comer();
		galinha1.comer();
		
		
		

	}

}