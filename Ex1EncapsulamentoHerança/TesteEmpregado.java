package Ex1EncapsulamentoHeran�a;

public class TesteEmpregado {

	public static void main (String args[])
	{
		
		Empregado Joao = new Empregado ("Joao","Avenida 7","4512-4898",7,4500.0,0.2);
		
		System.out.println("Nome: "+Joao.getNome());
		System.out.println("C�digo: "+Joao.getCodigo());
		System.out.println("Endere�o: "+Joao.getEndere�o());
		System.out.println("Salario: "+Joao.CalcularSalario());
	}
}
