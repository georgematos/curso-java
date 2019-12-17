package lambada_predicate;

import java.util.ArrayList;
import java.util.List;

import lambda_entities.Product;

public class Program {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		list.removeIf(new ProductPredicate());
//		list.removeIf(Product::productPredicate); // method reference com método estático
//		list.removeIf(Product::nonStaticProductPredicate); // method reference com método comum
		
//		Predicate<Product> predicate = p -> p.getPrice() >= 100;
//		list.removeIf(predicate); 
		
		list.removeIf(p -> p.getPrice() >= 100.0);

		list.forEach(System.out::println);
	}
	
}
