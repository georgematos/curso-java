package interfaces.contrato.modules.entities;

import java.util.List;

import interfaces.contrato.modules.interfaces.Payment;

public class PaypalPayment implements Payment {

	final double SIMPLEINTERESTTAX = 0.01;
	final double PAYMENTFEETAX = 0.02;

	@Override
	public List<Installment> applyPayment(List<Installment> installments) {

		int month = 0;

		for (Installment installment : installments) {

			month = installments.indexOf(installment) + 1;
			double amount = installment.getAmount();

			amount += (amount * SIMPLEINTERESTTAX) * month;
			amount += (amount * PAYMENTFEETAX);

			installment.setAmount(amount);

		}

		return installments;

	}

}
