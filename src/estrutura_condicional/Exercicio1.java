package estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("O n�mero � negativo");
		} else {
			System.out.println("O n�mero � positivo");
		}
		
		sc.close();
	}

}
