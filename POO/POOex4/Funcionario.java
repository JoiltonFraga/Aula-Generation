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
	
	public String getInforma�ao()
	{
		String informa�ao = nomeCompleto+" - "+profissao+" - "+idadee;
		return informa�ao;
	}
}
