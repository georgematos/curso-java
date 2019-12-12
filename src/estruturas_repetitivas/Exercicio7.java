package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse número é par ou impar? Digite: ");
		int n = sc.nextInt();
		
		parOuImpar(n);
		
		sc.close();
		
	}

	private static void parOuImpar(int n) {
		
		if (n % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
		
	}
	
}
