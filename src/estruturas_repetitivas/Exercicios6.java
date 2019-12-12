package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double temp = 0.0;
		double fahr = 0.0;
		String option = "s";
		
		System.out.println("Conversão de Celcius para Fahrenheit");

		do {
			System.out.println("Por favor, entre com a temperatura em graus Celcius:");
			temp = sc.nextDouble();
			fahr = ((9 * temp) / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", fahr);
			System.out.print("Deseja repetir? (s/n) ");
			option = sc.next();
		} while (option.compareToIgnoreCase("s") == 0);
		
		sc.close();
		
	}
	
}
