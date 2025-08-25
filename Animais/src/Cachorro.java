
public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nMeu cachorro " + nome + ", com " + idade + " anos, faz Au Au!");
	}

}
