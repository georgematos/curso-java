package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os quatro valores inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diff = a * b -c * d;
		
		System.out.printf("A diferença é: %d", diff);
		
		sc.close();

	}

}
