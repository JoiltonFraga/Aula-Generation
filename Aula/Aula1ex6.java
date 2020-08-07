package PacoteJava;

import java.util.Scanner;

public class Aula1ex6 {
public static void main(String args[])
{
Scanner ler =new Scanner(System.in);
double x1,x2,y1,y2,d;

System.out.println("Digite um valor para X1: ");
x1 = ler.nextDouble();
System.out.println("Digite um valor para X2: ");
x2 = ler.nextDouble();
System.out.println("Digite um valor para Y1: ");
y1 = ler.nextDouble();
System.out.println("Digite um valor para Y2: ");
y2 = ler.nextDouble();


d = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));

System.out.println("A raiz de (X2-X1)² + (Y2-Y1)² é: "+d);


}
}
