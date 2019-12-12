package orientacao_objetos_2;

import java.util.Scanner;

public class BancoDoGeorge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final Conta conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Entre com o nome do usuario: ");
		String usuario = sc.next();
		
		System.out.print("Existe um depósito inicial?: (s/n) ");
		char option = sc.next().charAt(0);
		
		if (option == 's') {
			System.out.print("Digite o valor do depósito: ");
			double deposito = sc.nextDouble();
			conta = new Conta(numConta, usuario, deposito);
			System.out.println(conta.toString());
		} else {
			conta = new Conta(numConta, usuario);
			System.out.println(conta.toString());
		}
		
		
		System.out.print("Valor do depósito: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println(conta.toString());

		System.out.print("Valor do saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println(conta.toString());
		
		sc.close();

	}

}
