package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch (x) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			case 8:
				System.out.println("Jupturno");
				break;
	
			default:
				
				System.out.println("Dia inexistente: " + x);
		}
		
		sc.close();

	}
	
}
