package lambda_exercicio_resolvido;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import lambda_entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String file = "src\\produtos.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		
			List<Product> produtos = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				
				String[] field = line.split(",");
				
				produtos.add(new Product(field[0], Double.parseDouble(field[1])));
				
				line = br.readLine();
			}
			
			// Minha implementação: a linha de cima é a uma "explicação" da de baixo.
//			double media = produtos.stream().reduce(0.0, (acumulador, product) -> acumulador + product.getPrice(), Double::sum) / produtos.size();
//			double media = produtos.stream().reduce(0.0, (x, y) -> x + y.getPrice(), Double::sum) / produtos.size();
			
			double media = produtos.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / produtos.size();
			
			List<Product> produtosPrecoAbaixoMedia = produtos.stream().filter(p -> p.getPrice() < media).collect(Collectors.toList());
			produtosPrecoAbaixoMedia.forEach(System.out::println);
			
			// Obter uma lista com os nomes em ordem decrescente
			Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> collect = produtos.stream()
					.filter(p -> p.getPrice() < media)
					.map(p -> p.getName())
					.sorted(comparator.reversed())
					.collect(Collectors.toList());
			
			System.out.println(collect);
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
