package PacoteJava;

import java.util.Scanner;

public class Aula3RepeticaoWHILEex3 {
public static void main(String args[])
{
	int idade,menos21=0,mais50=0;
	Scanner ler = new Scanner(System.in);
	
	System.out.printf("Digite a sua idade: ");
	idade = ler.nextInt();
	
	while (idade!=-99)
	{
		if(idade<21)
		{
			menos21++;
		}
		if(idade>50)
		{
			mais50++;
		}
		
		System.out.printf("Digite a sua idade: ");
		idade = ler.nextInt();
	}
	
	System.out.printf("\nPessoas com menos de 21 anos: %d",menos21);
	System.out.printf("\nPessoas com mais de 50 anos: %d",mais50);
}
}
