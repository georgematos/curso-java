package estrutura_sequencial;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com um nome: ");
		String x = sc.next();
		
		System.out.println("Você digitou: " + x);
		
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		
		System.out.println("Você digitou o número: " + n);
		
		sc.close();
	}
	
}
