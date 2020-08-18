package ExInterfacePolimorfismo;

public class Pregui�a extends Animal {

	public Pregui�a (String nome, int idade) 
	{
		super(nome, idade);
	}

	public void EmitirSom(String nome, String som) {
		System.out.printf("O animal "+nome+", � um cachorro e faz o som: "+som);
	}
	
	public void SubirArvores()
	{
		System.out.println("\nA pregui�a sobe na �rvore...");
	}
}
