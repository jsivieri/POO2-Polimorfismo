package exercicio1;

public class Pessoa {
	
	private String nome, cpf, cargo;
	private double salario;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Pessoa(String nome, String cpf, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void apresentar() {
		
		System.out.println("Pessoa: "+this.getNome());
	}

}

