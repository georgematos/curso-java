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
		 * usando lambda, não precisamos usar Collectors.sort, que exige a implementação
		 * da interface Comparable assim trazemos a lógica da comparação de produtos
		 * para uma função anonima que será usada uma única vez no código
		 */
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		list.forEach(System.out::println);
	}
}
