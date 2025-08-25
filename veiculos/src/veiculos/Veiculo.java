package veiculos;

public class Veiculo {
	String marca;
	
	public Veiculo(String marca){
		this.marca = marca;
	}
	
	public void mover() {
		System.out.println("O veículo da marca " +  marca + " está se movendo.");
	}

}
