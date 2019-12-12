package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

public class TesteCurrencyConverter {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double dollar, real;
		
		System.out.println("Valor do dólar $: ");
		dollar = sc.nextDouble();
		
		System.out.println("Valor do real R$: ");
		real = sc.nextDouble();
		
		System.out.printf("Total a ser pago em reais: %.2f", CurrencyConverter.toConvert(real, dollar));
		
		sc.close();
		
	}

}
