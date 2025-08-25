
public class Estudante extends Pessoa {
	private String curso;

	public Estudante(String nome, String curso) {
		super(nome);
		this.curso = curso;
	}

	@Override
	public void exibirInfo() {
		System.out.println("\nEstudante: " + nome + " | Curso: " + curso);
	}
	
}
