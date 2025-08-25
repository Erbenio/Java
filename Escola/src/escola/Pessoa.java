package escola;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	
	public Pessoa(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade  = idade;
		this.endereco = endereco;
	}
	
	public String toString() {
		return nome + " = " + idade + " anos - Endereco: " + endereco;
	}

}
