package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

public class TesteTrianguloStatico {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC;
		
		System.out.println("Enter the measures of triangle X: ");
		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();
						
		System.out.printf("Triangle area: %.4f\n", Triangulo.getArea(ladoA, ladoB, ladoC));
		
		sc.close();
	}
	
}
