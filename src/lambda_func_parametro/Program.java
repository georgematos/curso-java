package lambda_func_parametro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductServiceWithPredicate pswp = new ProductServiceWithPredicate();
		ProductServiceWithConsumer pswc = new ProductServiceWithConsumer();
		
		double total = pswp.filteredCriteria(list, p -> p.getPrice() < 100.0);

		System.out.println(total);
		
		pswc.filteredCriteria(list, p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // faz absolutamente a mesma fucking coisa
		
		list.forEach(System.out::println);
	}

}
