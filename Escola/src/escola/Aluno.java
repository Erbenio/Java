package escola;

public class Aluno extends Pessoa {
	float notaFinal;

	public Aluno(String nome, int idade, String endereco, float notaFinal) {
		super(nome, idade, endereco);
		this.notaFinal = notaFinal;
	}

	public String toString() {
		return super.toString() + " - Nota Final " + notaFinal;
	}

}