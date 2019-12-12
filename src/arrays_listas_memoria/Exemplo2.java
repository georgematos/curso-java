package arrays_listas_memoria;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos produtos serão cadastrados? ");
		int n = scan.nextInt();

		Product[] produtos = new Product[n];
		double total = 0;

		for (int i = 0; i < produtos.length; i++) {

			Product p = new Product();

			System.out.printf("Nome do produto %d: ", i+1);
			p.setNome(scan.next());

			System.out.printf("Preco do produto %d: ", i+1);
			p.setPreco(scan.nextDouble());

			produtos[i] = p;			

			total += produtos[i].getPreco();
		}

		double media = total / produtos.length;
		
		System.out.printf("Média dos produtos cadastrdos: %.2f", media);
		
		scan.close();

	}

}
