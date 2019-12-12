package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escolha o produto escolhido:\n"
				+ "1. Alcool\n"
				+ "2. Gasolina\n"
				+ "3. Diesel\n"
				+ "4. Sair\n");
		
		int alcool = 0; 
		int gasolina = 0; 
		int diesel = 0;
		
		int codigo = sc.nextInt();

		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3){
				diesel += 1;
			}
			
			System.out.println("Escolha do cliente: ");
			codigo = sc.nextInt();
		}

		System.out.printf("Resultado:\n1"
				+ "Muito Obrigado\n"
				+ "Alcool: %d\n"
				+ "Gasolina: %d\n"
				+ "Diesel: %d\n", alcool, gasolina, diesel);
		
		sc.close();

	}
}
