package ExInterfacePolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("O animal "+nome+", é um cavalo e faz o som: "+som);
	}
	
	public void Correr()
	{
		System.out.println("\nO cavalo está correndo.");
	}
}
