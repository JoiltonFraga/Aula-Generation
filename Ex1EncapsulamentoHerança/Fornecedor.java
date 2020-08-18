package Ex1EncapsulamentoHeran�a;

public class Fornecedor extends Pessoa{

	private double ValorCredito;
	private double ValorDivida;
	
	
	public Fornecedor ( String nome, String endere�o, String telefone, double ValorCredito, double ValorDivida)
	{
		
		super (nome, endere�o, telefone);
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
