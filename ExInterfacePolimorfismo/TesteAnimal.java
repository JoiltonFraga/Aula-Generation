package ExInterfacePolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro Spyke = new Cachorro("Spyke",3);	
		Spyke.EmitirSom(Spyke.getNome(),"Auuu auuu");
		Spyke.Correr();
		
		Cavalo bird = new Cavalo("Bird",10);	
		bird.EmitirSom(bird.getNome(),"Ihi ihi");
		bird.Correr();
		
		Preguiça Slow = new Preguiça("Slow",20);	
		Slow.EmitirSom(Slow.getNome(),"zzzzzzzz");
		Slow.SubirArvores();
}
}
