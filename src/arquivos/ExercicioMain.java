package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class ExercicioMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		String path = "D:\\temp\\source_products.csv";
		ArrayList<Product> productsList = new ArrayList<Product>();
		File dir = new File("D:\\temp\\out");
		File file = new File("D:\\temp\\out\\summary.cvs");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			dir.mkdir();

			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				Product product = new Product(campos[0], Double.valueOf(campos[1]), Integer.valueOf(campos[2]));
				productsList.add(product);
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				for (Product p : productsList) {
					bw.write(p.getName() + "," + String.format("%.2f", p.getTotalPriceOf()));
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
