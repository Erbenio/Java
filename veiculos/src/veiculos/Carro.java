package veiculos;

public class Carro extends Veiculo {
	int portas;
	
	public Carro(String marca, int portas) {
		super(marca);
		this.portas = portas;		
	}
	
	public void mover() {
		System.out.println("O carro da marca " + marca + " com " + portas + " postas está andando na estrada.");
	}

}
