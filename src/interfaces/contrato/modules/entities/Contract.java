package interfaces.contrato.modules.entities;

import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double value;

	private List<Installment> Installments;

	public Contract(Integer number, Date date, Double value) {
		this.number = number;
		this.date = date;
		this.value = value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double totalValue) {
		this.value = totalValue;
	}

	public List<Installment> getInstallments() {
		return Installments;
	}

	public void setInstallments(List<Installment> installments) {
		Installments = installments;
	}

}
