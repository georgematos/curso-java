package estrutura_sequencial;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 4382;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n"
				+ "%s, which price is $ %.2f\n"
				+ "%s, which price is $ %.2f\n"
				+ "\n"
				+ "Record: %d years old, code %d and gender: %c\n"
				+ "\n"
				+ "Measure with eight decimal places: %f\n"
				+ "Rouded (three decimal places): %.3f\n", product1, price1, product2, price2, age, code, gender, measure, measure
		);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n", measure);
		
		// casting
		int a = 7;
		int b = 5;
		double resultado1 = a / b;
		double resultado2 = (double) a / b;
		System.out.printf("Resultado SEM casting de int para double: %.1f\n", resultado1);
		System.out.printf("Resultado COM casting de int para double: %.1f\n", resultado2);
		
	}
	
}
