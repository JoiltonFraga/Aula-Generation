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
	
	public String getInformašao()
	{
		String informašao = nomeCompleto+" - "+profissao+" - "+idadee;
		return informašao;
	}
}
