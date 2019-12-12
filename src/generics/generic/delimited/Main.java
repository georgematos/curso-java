package generics.generic.delimited;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader("src\\generic\\delimited\\products.csv"))) {

			String line = bf.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bf.readLine();
			}

			Product moreExpansiveProduct = CalculationService.max(list);
			Product moreCheapProduct = CalculationService.min(list);

			System.out.println(moreExpansiveProduct);
			System.out.println(moreCheapProduct);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
