package POOex2;

public class Aviao {
 private String modelo;
 private String companhia;
 private String capacidade;
 
 public Aviao (String mod, String comp, String cap)
 {
	 modelo = mod;
	 companhia = comp;
	 capacidade = cap;
	 
 }
 public String getInforma�ao()
	{
		String informa�ao = modelo+" - "+companhia+" - "+capacidade;
		return informa�ao;
	}
}
