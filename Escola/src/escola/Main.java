package escola;

public class Main {
	public static void main(String[] args) {
		Professor p = new Professor("Fernanda", 35, "Rua Março", "Técnicas de Programação");
		System.out.println(p);
		
		Aluno nf = new Aluno("\nFrancisco", 25, "Rua Outono", 10);
		System.out.println(nf);
	}
	
}
