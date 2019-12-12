package interfaces.contrato.modules.interfaces;

import java.util.List;

import interfaces.contrato.modules.entities.Installment;

public interface Payment {
	
	List<Installment> applyPayment(List<Installment> installments);
	
}
