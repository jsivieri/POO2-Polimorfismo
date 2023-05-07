package exercicio4;

public class Programa {

	public static void main(String[] args) {
		
		Assistente a1 = new Assistente();
		a1.setSalario(1000);
		Funcionario assistente = a1;
		
		Diretor a2 = new Diretor();
		a2.setSalario(1000);
		Funcionario diretor = a2;
		
		Gerente a3 = new Gerente();
		a3.setSalario(1000);
		Funcionario gerente = a3;
		
		
		a1.calcularSalario();
		a2.calcularSalario();
		a3.calcularSalario();
		
		assistente.calcularSalario();
		gerente.calcularSalario();
		diretor.calcularSalario();
		
		
		
	}

}
