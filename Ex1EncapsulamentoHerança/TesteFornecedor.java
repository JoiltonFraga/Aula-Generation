package Ex1EncapsulamentoHeran�a;

public class TesteFornecedor {

	public static void main (String args[])
	{
		Fornecedor John = new Fornecedor ("John","Rua Washington 19","6589-9847",3000.00,2600.00);
		
		System.out.println("Nome: "+John.getNome());
		System.out.println("Endere�o: "+John.getEndere�o());
		System.out.println("Cr�dito: "+John.getValorCredito());
		System.out.println("Saldo Atual: "+John.ObterSaldo());
		
		
		
		
	}
}
