package heranca_polimorfismo.exercicio;

import java.util.Calendar;
import java.util.Locale;

public class Maintest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 10, 24);

		Product product1 = new Product("SmartPhone", 1400.0);
		Product product2 = new ImportedProduct("Notebook", 2000.0);
		Product product3 = new UsedProduct("Notebook", 2000.0, cal.getTime());

		System.out.println(product1.priceTag());
		System.out.println(product2.priceTag());
		System.out.println(product3.priceTag());

	}

}
