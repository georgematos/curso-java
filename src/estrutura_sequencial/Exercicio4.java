package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtd1, qtd2;
		double preco1, preco2;
		
		System.out.print("Qtd: ");
		qtd1 = sc.nextInt();
		System.out.println("Preço: ");
		preco1 = sc.nextDouble();
		
		System.out.print("Qtd: ");
		qtd2 = sc.nextInt();
		System.out.println("Preço: ");
		preco2 = sc.nextDouble();
		
		double totalPr1 = qtd1 * preco1;
		double totalPr2 = qtd2 * preco2;
		
		double finalTotal= totalPr1 + totalPr2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", finalTotal);
		
		sc.close();
		
	}
}
