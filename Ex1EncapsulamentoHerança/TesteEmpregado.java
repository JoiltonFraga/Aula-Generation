package Ex1EncapsulamentoHerança;

public class TesteEmpregado {

	public static void main (String args[])
	{
		
		Empregado Joao = new Empregado ("Joao","Avenida 7","4512-4898",7,4500.0,0.2);
		
		System.out.println("Nome: "+Joao.getNome());
		System.out.println("Código: "+Joao.getCodigo());
		System.out.println("Endereço: "+Joao.getEndereço());
		System.out.println("Salario: "+Joao.CalcularSalario());
	}
}
