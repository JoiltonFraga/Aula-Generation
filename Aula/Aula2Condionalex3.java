package PacoteJava;

import java.util.Scanner;

public class Aula2Condionalex3 {
public static void main (String args[])
{
	Scanner ler = new Scanner(System.in);
	int idade;
	String nome;
	
	System.out.println("Digite o seu nome: ");
    nome = ler.next();
    System.out.println("Digite a sua idade: ");
    idade = ler.nextInt();
    
    if (idade>=10 && idade<=14)
    {
    	System.out.println("Sua faixa etaria é classificada como infantil.");
    }
    if (idade>=15 && idade<=17)
    {
    	System.out.println("Sua faixa etaria é classificada como juvenil.");
    }
    if (idade>=18 && idade<=25)
    {
    	System.out.println("Sua faixa etaria é classificada como adulto.");
    }
    
    else 
    {
    	System.out.println("Sua idade está fora de nossa classificação.");
    }
}
}
