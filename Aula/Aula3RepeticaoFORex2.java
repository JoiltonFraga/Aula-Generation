package PacoteJava;

import java.util.Scanner;

public class Aula3RepeticaoFORex2 {
public static void main (String args[])
{
	Scanner ler = new Scanner(System.in);
	
	int x,i,par=0,impar=0;
	
	
	for (x=1;x<=10;x++)
	{
		System.out.printf("Digite um n�mero: ");
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
	
	System.out.printf("s�o n�mero(s) par: %d",par);
	System.out.printf("\ns�o n�mero(s) impar: %d",impar);
	
}
}
