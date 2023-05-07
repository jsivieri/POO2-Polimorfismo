package exercicio4;

public class Funcionario {
	
	private double salario;


	
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public void calcularSalario() {
		System.out.println("Salario de funcionario: "+this.getSalario());
	}
	
	

}
