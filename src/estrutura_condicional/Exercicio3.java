package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int n2 = sc.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}

		sc.close();
	}
}
