package ExInterfacePolimorfismo;

public class Preguiça extends Animal {

	public Preguiça (String nome, int idade) 
	{
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("O animal "+nome+", é um cachorro e faz o som: "+som);
	}
	
	public void SubirArvores()
	{
		System.out.println("\nA preguiça sobe na árvore...");
	}
}
