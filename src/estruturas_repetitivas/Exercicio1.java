package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		String senha = sc.nextLine();
		
		while (senha.compareTo("2002") != 0) {
			System.out.println("Senha incorreta, tente novamente.");
			senha = sc.nextLine();
		}
		
		System.out.println("Senha correta, bem vindo!");
		
		sc.close();
		
	}
	
}
