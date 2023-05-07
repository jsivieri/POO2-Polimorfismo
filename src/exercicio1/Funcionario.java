package exercicio1;

public class Funcionario extends Pessoa {
	
	private String cargo;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void apresentar() {
		
		System.out.println("Funcionario: "+this.getNome()+" Cargo: "+this.getCargo());
	}

}

