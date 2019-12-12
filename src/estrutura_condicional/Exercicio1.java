package estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é positivo");
		}
		
		sc.close();
	}

}
