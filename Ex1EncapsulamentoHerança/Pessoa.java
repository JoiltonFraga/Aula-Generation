package Ex1EncapsulamentoHerança;

public class Pessoa {

	private String nome;
	private String endereço;
	private String telefone;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	public Pessoa (String nome, String endereço, String telefone)
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
		
	void falar() {
		System.out.println("A pessoa está falando");
	}
	 
	
	void respirar ()
	{
		System.out.println("A pessoa está respirando");
	}
	
	
}
