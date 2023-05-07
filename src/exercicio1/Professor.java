package exercicio1;

public class Professor extends Pessoa {
	
	private String disciplina;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
		public void apresentar() {
		
		System.out.println("Professor: "+this.getNome()+" Disciplina: "+this.getDisciplina());
	}

}