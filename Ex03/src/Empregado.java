
public class Empregado extends Pessoa{
	private String cargo;

	public Empregado(String nome,String cargo) {
		super(nome);
		this.cargo = cargo;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("\nEmpregado: " + nome + " | Cargo: " + cargo);
	}

}
