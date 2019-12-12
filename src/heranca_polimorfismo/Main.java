package heranca_polimorfismo;

public class Main {

	public static void main(String[] args) {

		//comiAccount acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 50.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		System.out.println(acc1.getBalance());

		Account acc2 = new BusinessAccount(1003, "Bob", 30.0, 200.0);
		System.out.println(acc2.getBalance());
	
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
		
		// Sobreposicao, palavras super e anotação @override,
		
		Account conta1 = new Account(5102, "George", 560000.0);
		conta1.withdraw(60000.0);
		System.out.println(conta1.getBalance());
		
		Account conta2 = new SavingsAccount(5103, "Dara", 560000.0, 250000.0);
		conta2.withdraw(60000.0);
		System.out.println(conta2.getBalance());

		Account conta3 = new BusinessAccount(5104, "Vanda", 500500.0, 500.0);
		conta3.withdraw(200.0);
		System.out.println(conta3.getBalance());
		
	}

}
