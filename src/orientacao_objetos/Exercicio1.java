package orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.print("Entre com a base de retangulo: ");
		retangulo.setBase(sc.nextDouble());
		
		System.out.print("Entre com a altura de retangulo: ");
		retangulo.setAltura(sc.nextDouble());
		
		System.out.println(retangulo.toString());
		
		sc.close();
	}

}
