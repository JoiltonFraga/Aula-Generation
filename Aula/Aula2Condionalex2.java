package PacoteJava;

import java.util.Scanner;

public class Aula2Condionalex2 {
public static void main (String args[])
{
	Scanner ler = new Scanner (System.in);
	float num1,num2,num3;
	
	System.out.println("Digite um n�mero: ");
	num1 = ler.nextFloat();
	System.out.println("Digite um n�mero: ");
	num2 = ler.nextFloat();
	System.out.println("Digite um n�mero: ");
	num3 = ler.nextFloat();
	
	if (num1>=num2 && num1>=num3)
	{
		if (num2>=num3)
		{
			System.out.println("A ordem crescente dos n�meros �: "+num3+", "+num2+", "+num1);
		}
		
		else
		{
			System.out.println("A ordem crescente dos n�meros �: "+num2+", "+num3+", "+num1);
		}
	}
	
	if (num2>=num1 && num2>=num3)
	{
		if (num1>=num3)
		{
			System.out.println("A ordem crescente dos n�meros �: "+num3+", "+num1+", "+num2);
		}
		
		else
		{
			System.out.println("A ordem crescente dos n�meros �: "+num1+", "+num3+", "+num2);
		}
	}
	
	if (num3>=num1 && num2>=num3)
	{
		if (num1>=num2)
		{
			System.out.println("A ordem crescente dos n�meros �: "+ num2+", "+num1+", "+num3);
		}
		
		else
		{
			System.out.println("A ordem crescente dos n�meros �: "+num1+", "+num2+", "+num3);
		}
	}
}
}
