package ExInterfacePolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class exercicioCollection {

public static void main(String[] args) {
		
		Collection<String> produtos = new ArrayList<String>();
		
		produtos.add("Camisa do S�o Paulo");
		produtos.add("Camisa do Gr�mio");
		produtos.add("Camisa do Internacional");
		produtos.add("Camisa do Coritiba");
		
		System.out.println("N�mero total de produtos em estoque: "+produtos.size());
		System.out.println("\nOs produtos dispon�veis em estoque s�o: "+produtos);
		produtos.remove("Camisa do Coritiba");
		System.out.println("\nFoi vendido uma camisa do Coritiba, ainda temos: "+produtos.size());
		System.out.println("\nOs produtos dispon�veis em estoque s�o: "+produtos);
		
		
		
		
		
		
		
	}
}
