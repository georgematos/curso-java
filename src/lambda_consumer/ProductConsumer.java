package lambda_consumer;

import java.util.function.Consumer;

import lambda_entities.Product;

public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
