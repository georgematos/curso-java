package arrays_listas_memoria;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		
		System.out.println("Quantas pessoas serão analisadas? ");
		int n = scan.nextInt();
		double[] altura = new double[n];
		
		for (int i = 0; i < altura.length; i++) {
			System.out.printf("Digite a altura da pessoa %d: ", i+1);
			altura[i] = scan.nextDouble();
			soma += altura[i];
		}
		
		double result = soma / altura.length;
		
		System.out.printf("A média de altura é: %.2f m", result);
		
		scan.close();
	}	
}
