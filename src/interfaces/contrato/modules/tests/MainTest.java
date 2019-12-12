package interfaces.contrato.modules.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import interfaces.contrato.modules.entities.Contract;
import interfaces.contrato.modules.entities.Installment;
import interfaces.contrato.modules.entities.PaypalPayment;
import interfaces.contrato.modules.interfaces.Payment;
import interfaces.contrato.modules.services.ContractService;

public class MainTest {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
			Contract contract = new Contract(8028, sdf.parse("25/06/2019"), 600.0);
			Payment payPalPayment = new PaypalPayment();
			ContractService contractService = new ContractService();
			
			contractService.processContract(contract, 3, payPalPayment);
			
			System.out.printf("Contract number: %d\n"
					+ "Contract date: %s\n"
					+ "Contract value: %.2f\n", 
					contract.getNumber(), 
					sdf.format(contract.getDate()),
					contract.getValue()
					);
			
			for (Installment inst : contract.getInstallments()) {
				
				System.out.println(sdf.format(inst.getDate()) + " - " + inst.getAmount());
				
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
