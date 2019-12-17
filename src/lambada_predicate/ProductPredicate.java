package lambada_predicate;

import java.util.function.Predicate;

import lambda_entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		
		return p.getPrice() >= 100.0;
		
	}
	
}
