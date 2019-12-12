package interfaces.contrato.modules.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import interfaces.contrato.modules.entities.Contract;
import interfaces.contrato.modules.entities.Installment;
import interfaces.contrato.modules.interfaces.Payment;

public class ContractService {

	public Contract processContract(Contract contract, int months, Payment payment) {
		
		List<Installment> installments = new ArrayList<Installment>();
		double value = contract.getValue() / months;
		Date dueDate = contract.getDate();
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i < months; i++) {

			// adds 1 month to date.
			cal.setTime(dueDate);
			cal.add(Calendar.MONTH, +1);
			dueDate = cal.getTime();

			Installment installment = new Installment(dueDate, value);

			installments.add(installment);
		}
		
		payment.applyPayment(installments);
		contract.setInstallments(installments);
		
		return contract;

	}
	
}
