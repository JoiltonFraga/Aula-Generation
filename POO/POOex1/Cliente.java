package POOex1;

public class Cliente {

	String nomeCompleto;
	String genero;
	String mesAniversario;
	
	public Cliente (String nome, String sexo, String mes)
	{
		nomeCompleto = nome;
		genero = sexo;
		mesAniversario = mes;
	}
	
	public String getInformašao()
	{
		String informašao = nomeCompleto+" - "+genero+" - "+mesAniversario;
		return informašao;
	}
}
