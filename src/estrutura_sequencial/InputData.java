package estrutura_sequencial;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com um nome: ");
		String x = sc.next();
		
		System.out.println("Voc� digitou: " + x);
		
		System.out.print("Entre com um numero: ");
		int n = sc.nextInt();
		
		System.out.println("Voc� digitou o n�mero: " + n);
		
		sc.close();
	}
	
}
