package PacoteJava;

import java.util.Scanner;

public class Aula1ex5 {
public static void main(String args[])
{
	Scanner ler = new Scanner(System.in);
	double notaA,notaB,notaC,media;
	String nome;
	
	System.out.println("Digite seu nome: ");
	nome = ler.next();
	System.out.println("Digite a sua primeira nota: ");
	notaA = ler.nextDouble();
	System.out.println("Digite a sua segundaa nota: ");
	notaB = ler.nextDouble();
	System.out.println("Digite a sua terceira nota: ");
	notaC = ler.nextDouble();
	
	media = ((notaA*2)+(notaB*3)+(notaC*5))/10;
	
	System.out.println("A sua média é: "+media);
	
			
			
	
	
	
			
}
}
