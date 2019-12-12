package locadora.module.tests;

import java.util.Locale;

import locadora.module.entities.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Invoice inv = new Invoice(390.00, 0.15);
		System.out.println(inv.getTax());
		System.out.println(inv.getTotalPayment());
		
	}
}
