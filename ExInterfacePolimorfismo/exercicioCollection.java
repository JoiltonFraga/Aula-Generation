package ExInterfacePolimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class exercicioCollection {

public static void main(String[] args) {
		
		Collection<String> produtos = new ArrayList<String>();
		
		produtos.add("Camisa do São Paulo");
		produtos.add("Camisa do Grêmio");
		produtos.add("Camisa do Internacional");
		produtos.add("Camisa do Coritiba");
		
		System.out.println("Número total de produtos em estoque: "+produtos.size());
		System.out.println("\nOs produtos disponíveis em estoque são: "+produtos);
		produtos.remove("Camisa do Coritiba");
		System.out.println("\nFoi vendido uma camisa do Coritiba, ainda temos: "+produtos.size());
		System.out.println("\nOs produtos disponíveis em estoque são: "+produtos);
		
		
		
		
		
		
		
	}
}
