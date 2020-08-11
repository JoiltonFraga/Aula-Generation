package PacoteJava;

import java.util.Scanner;

public class Aula3RepeticaoFORex2 {
public static void main (String args[])
{
	Scanner ler = new Scanner(System.in);
	
	int x,i,par=0,impar=0;
	
	
	for (x=1;x<=10;x++)
	{
		System.out.printf("Digite um número: ");
		i = ler.nextInt();
		
		if (i%2==0)
		{
			par++;
		}
		else
		{
			impar++;
		}
		
	}
	
	System.out.printf("são número(s) par: %d",par);
	System.out.printf("\nsão número(s) impar: %d",impar);
	
}
}
