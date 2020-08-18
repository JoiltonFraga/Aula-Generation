package Ex1EncapsulamentoHerança;

public class Fornecedor extends Pessoa{

	private double ValorCredito;
	private double ValorDivida;
	
	
	public Fornecedor ( String nome, String endereço, String telefone, double ValorCredito, double ValorDivida)
	{
		
		super (nome, endereço, telefone);
		this.ValorCredito = ValorCredito;
		this.ValorDivida = ValorDivida;
		
	}

	public double getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(float valorCredito) {
		ValorCredito = valorCredito;
	}

	public double getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(float valorDivida) {
		ValorDivida = valorDivida;
	}
	
	public double ObterSaldo()
	{
		double saldo = this.ValorCredito - this.ValorDivida;
		return saldo;
		
	}
	
}
