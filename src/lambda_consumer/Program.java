package lambda_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import lambda_entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		list.forEach(new ProductConsumer());
//		list.forEach(Product::productConsumer);

		Consumer<Product> productConsumer = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};

		list.forEach(productConsumer);

//		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
		
	}
	
}
