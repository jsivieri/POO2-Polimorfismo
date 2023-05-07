package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	public Programa() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		
	
		// 

		Circulo c1 = new Circulo(2);
		
		Circulo c2 = new Circulo(4);
				
		Quadrado q1 = new Quadrado(4);
		
		Triangulo t1 = new Triangulo(3,5);
		
		Triangulo t2 = new Triangulo(7,12);
		
		
	
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(c1);
		formas.add(c2);
		formas.add(t1);
		formas.add(t2);
		formas.add(q1);
			
		CalculadoraDeAreas calc = new CalculadoraDeAreas();
		System.out.println(calc.somarAreas(formas));
		
	
	}
	}
