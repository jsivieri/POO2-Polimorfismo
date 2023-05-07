package exercicio9;

import java.util.List;

public class CalculadoraDeAreas {
	

	
	public double somarAreas(List<Forma> formas) {
		double somaDaArray = 0;
		for(Forma f:formas){
			somaDaArray += f.calcularArea();
		}
	
			return somaDaArray;
			 
						
			}
	

			

}
