package escola;

public class Professor extends Pessoa {
	String disciplina;
	
	public Professor(String nome, int idade, String endereco, String disciplina) {
		super(nome, idade, endereco);
		this.disciplina = disciplina;
	}

	public String toString() {
		return super.toString() + " - Professor de " + disciplina;
	}
	
}
