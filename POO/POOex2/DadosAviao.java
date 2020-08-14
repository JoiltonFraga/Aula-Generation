package POOex2;

import POOex1.Cliente;

public class DadosAviao {
	public static void main (String args[])
	{
		Cliente cliente1 = new Cliente("Boing","Latam","240 lugares");
		System.out.println(cliente1.getInformaçao());
	}
}
