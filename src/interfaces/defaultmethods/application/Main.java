package interfaces.defaultmethods.application;

import interfaces.defaultmethods.interfaces.InterestService;
import interfaces.defaultmethods.services.BrazilInterestService;
import interfaces.defaultmethods.services.UsaInterestService;

public class Main {
	public static void main(String[] args) {

		double interestBr = 0.02;
		double interestUsa = 0.01;
		InterestService bisBr = new BrazilInterestService(interestBr);
		InterestService bisUsa = new UsaInterestService(interestUsa);
		double amount = 200.0;
		int months = 3;
		
		System.out.printf("Payment after %d months: %.2f\n", months, bisBr.payment(amount, months));
		System.out.printf("Payment after %d months: %.2f", months, bisUsa.payment(amount, months));
		
	}
}
