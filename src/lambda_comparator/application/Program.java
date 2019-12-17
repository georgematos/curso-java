package lambda_comparator.application;

import java.util.ArrayList;
import java.util.List;

import lambda_entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		/*
		 * usando lambda, n�o precisamos usar Collectors.sort, que exige a implementa��o
		 * da interface Comparable assim trazemos a l�gica da compara��o de produtos
		 * para uma fun��o anonima que ser� usada uma �nica vez no c�digo
		 */
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		list.forEach(System.out::println);
	}
}
