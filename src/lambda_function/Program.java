package lambda_function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import lambda_entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// a função map aplica a função passada a cada elemento da stream
//		List<String> names = list.stream().map(new UpperCaseFunction()).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
//		Function<Product, String> function = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(function).collect(Collectors.toList());
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
