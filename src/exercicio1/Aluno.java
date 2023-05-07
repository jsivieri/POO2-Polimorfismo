package exercicio1;

public class Aluno extends Pessoa {
	
	private int periodo;

	public Aluno() {
		super();
	}
	
	


	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	
	public void apresentar() {
		
		System.out.println("Aluno: "+super.getNome()+" Período: "+this.getPeriodo());
	}




}
