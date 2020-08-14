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
	
	public String getInformaçao()
	{
		String informaçao = nomeCompleto+" - "+genero+" - "+mesAniversario;
		return informaçao;
	}
}
