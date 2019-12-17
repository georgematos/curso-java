package lambda_func_parametro;

import java.util.List;
import java.util.function.Consumer;

public class ProductServiceWithConsumer {

	public void filteredCriteria(List<Product> list, Consumer<Product> criteria) {

		for (Product p : list) {
			
			criteria.accept(p);
			
		}
	}

}
