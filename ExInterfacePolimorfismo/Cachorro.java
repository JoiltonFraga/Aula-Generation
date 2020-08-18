package ExInterfacePolimorfismo;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("O animal "+nome+", é um cachorro e faz o som: "+som);
	}

	public void Correr()
	{
		System.out.println("\nO cachorro corre no parque.");
	}
}
