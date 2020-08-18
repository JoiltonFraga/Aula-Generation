package Ex1EncapsulamentoHerança;

public class TesteFornecedor {

	public static void main (String args[])
	{
		Fornecedor John = new Fornecedor ("John","Rua Washington 19","6589-9847",3000.00,2600.00);
		
		System.out.println("Nome: "+John.getNome());
		System.out.println("Endereço: "+John.getEndereço());
		System.out.println("Crédito: "+John.getValorCredito());
		System.out.println("Saldo Atual: "+John.ObterSaldo());
		
		
		
		
	}
}
