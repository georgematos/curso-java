package locadora.module.services;

import locadora.module.entities.CarRental;
import locadora.module.entities.Invoice;
import locadora.module.interfaces.TaxService;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.setTaxService(taxService);
	}

	public void processInvoice(CarRental carRental) {

		double hours = TimeService.getTimeDifferenceInHours(carRental.getFinishHour(), carRental.getStartHour());
		double basicPayment = 0.0;

		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));

	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

}
