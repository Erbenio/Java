
public class Main {
	public static void main(String[] args) {
		Animal[] animais = {new Cachorro("Fred", 3), new Gato("Bolinha", 1), new Animal("",0)};
		for (Animal a : animais) {
			a.emitirSom(); 
		}
	}
}

