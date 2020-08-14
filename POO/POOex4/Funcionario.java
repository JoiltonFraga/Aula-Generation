package POOex4;

public class Funcionario {
	
	String nomeCompleto;
	String profissao;
	int idadee;
	
	public Funcionario (String nome, String prof, int idade)
	{
		nomeCompleto = nome;
		profissao = prof;
		idadee = idade;
	}
	
	public String getInformaçao()
	{
		String informaçao = nomeCompleto+" - "+profissao+" - "+idadee;
		return informaçao;
	}
}
