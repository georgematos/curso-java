package exceptions.exercicios.aplication;

import exceptions.exercicios.model.entities.Account;
import exceptions.exercicios.model.exections.TransactionException;

public class Aplication {
	public static void main(String[] args) {
		
		Account acc1 = new Account(0010, "Bob Brown", 500.00, 600.00);
		
		try {
			acc1.deposit(1000.00);
			acc1.withdraw(600.00);
			acc1.withdraw(700.00);
		} catch (TransactionException e) { 
			System.out.println(e.getMessage());
		}

	}
}
