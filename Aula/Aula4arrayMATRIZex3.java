package PacoteJava;

import java.util.Scanner;

public class Aula4arrayMATRIZex3 {
public static void main(String args[])
{
	Scanner ler = new Scanner(System.in);
	
	int [][] matriz = new int [3][3];
	int linha=0, coluna=0,maior=0;
	
	
	for (linha=0;linha<3;linha++)
	{
		for (coluna=0;coluna<3;coluna++)
		{
			System.out.printf("Digite uma valor para a matriz: %d %d ",linha+1,coluna+1);
			matriz[linha][coluna] = ler.nextInt();
			
			if (matriz[linha][coluna]>10)
			{
				maior++;
			}
		}
	}
	
	System.out.println("\nA matriz ficou:\n");
	for (linha=0;linha<3;linha++)
	{
		for (coluna=0;coluna<3;coluna++)
		{
			System.out.printf("\t %d \t",matriz[linha][coluna]);
			
		}	
		System.out.println();
}
	System.out.println("\n"+ maior+" são números maiores que 10");
}
}
