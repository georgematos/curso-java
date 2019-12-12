package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

public class OrientadaAObjetos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		Triangulo tX = new Triangulo();
		Triangulo tY = new Triangulo();
		
		System.out.println("Enter the measures of triangle X: ");		
		tX.setLadoA(sc.nextDouble());
		tX.setLadoB(sc.nextDouble());
		tX.setLadoC(sc.nextDouble());
		
		System.out.println("Enter the measures of triangle Y: ");
		tY.setLadoA(sc.nextDouble());
		tY.setLadoB(sc.nextDouble());
		tY.setLadoC(sc.nextDouble());
		
		double areaX = tX.getArea();
		double areaY = tY.getArea();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if ( areaX > areaY ) {
			
			System.out.println("Larger area: X");
			
		} else {
			
			System.out.println("Larger area: Y");

		}
		
		sc.close();
	}
	
}
