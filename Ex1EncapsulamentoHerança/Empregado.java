package Ex1EncapsulamentoHerança;

public class Empregado extends Pessoa{

	private int codigo;
	private double salario;
	private double imposto=0.20;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public Empregado (String nome, String endereço, String telefone, int codigo, double salario, double imposto)
	{
		super (nome, endereço, telefone);
		this.codigo = codigo;
		this.salario = salario;
		this.imposto = imposto;
		
	}
	
	public double CalcularSalario()
	{
		double salario =this.salario - (this.salario*this.imposto);
		return salario;
	}
}
