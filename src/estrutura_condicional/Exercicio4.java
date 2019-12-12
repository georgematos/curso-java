package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total;
			
		System.out.print("Hora inicial: ");
		int h1 = sc.nextInt();
		
		System.out.print("Hora final: ");
		int h2 = sc.nextInt();
		
		if (h1 < h2) {
			total = Math.abs(h1 - h2);
			System.out.printf("O jogo durou %d horas", total);
		} else {
			total = (24 - h1) + h2;
			System.out.printf("O jogo durou %d horas", total);
		}

		sc.close();
	}
	
}
