package PacoteJava;

import java.util.Scanner;

public class Aula3RepeticaoDOWHILEex5 {
public static void main(String args[])
{
	Scanner ler = new Scanner(System.in);
	int x,soma=0;
	
	do
	{
		System.out.println("Digite um número: ");
		x = ler.nextInt();
		
		soma = soma + x;
	}
	while ( x!=0);
	
	System.out.printf("A soma dos números é de: %d",soma);
}
}
