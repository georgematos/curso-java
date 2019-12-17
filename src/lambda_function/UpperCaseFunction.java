package lambda_function;

import java.util.function.Function;

import lambda_entities.Product;

public class UpperCaseFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
