
public class Main {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[4];
		
		pessoas[0] = new Estudante("Pedro", "Gestão Empresarial");
		pessoas[1] = new Empregado("Marcelo", "Diretor");
		pessoas[2] = new Estudante("Heitor", "Ciência de Dados");
		pessoas[3] = new Empregado("Tânia", "Analista");
		
		for (Pessoa p : pessoas) {
			p.exibirInfo();
		}
	}

}
