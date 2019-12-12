package interfaces.contrato.modules.entities;

import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amount;

	public Installment(Date dueDate, Double value) {
		this.dueDate = dueDate;
		this.amount = value;
	}

	public Date getDate() {
		return dueDate;
	}

	public void setDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double value) {
		this.amount = value;
	}

}
