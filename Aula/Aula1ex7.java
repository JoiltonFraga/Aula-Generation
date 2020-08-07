package PacoteJava;

import java.util.Scanner;

public class Aula1ex7 {
public static void main(String args[])
{
	Scanner ler = new Scanner(System.in);
	float a,b,c,d,e,f,x,y;
	
	System.out.println("Digite um valor para A: ");
	a = ler.nextFloat();
	System.out.println("Digite um valor para B: ");
	b = ler.nextFloat();
	System.out.println("Digite um valor para C: ");
	c = ler.nextFloat();
	System.out.println("Digite um valor para D: ");
	d = ler.nextFloat();
	System.out.println("Digite um valor para E: ");
	e = ler.nextFloat();
	System.out.println("Digite um valor para F: ");
	f = ler.nextFloat();
	
	x = ((c*e)-(b*f))/((a*e)-(b*d));
	y = ((a*f)-(c*d))/((a*e)-(b*d));
	
	System.out.println("Para X = ((CxE)-(BxF)) / ((AxE)-(BxD)) temos X= "+x+"\n"
			+"Para Y = ((AxF)-(CxD)) / ((AxE)-(BxD)) temos Y= "+ y);
}
}
