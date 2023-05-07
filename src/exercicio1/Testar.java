package exercicio1;

public class Testar {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Joao");
		aluno.setPeriodo(5);
		Pessoa p1 = aluno;
	
		
		Professor professor = new Professor();
		professor.setNome("Jose");
		professor.setDisciplina("POO");
		Pessoa p2 = professor;
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Marcia");
		funcionario.setCargo("Secretaria");
		Pessoa p3 = funcionario;
		
		p1.apresentar();
		p2.apresentar();
		p3.apresentar();
		
			

	}

}
