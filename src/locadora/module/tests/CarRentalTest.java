package locadora.module.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import locadora.module.entities.CarRental;
import locadora.module.entities.Vehicle;
import locadora.module.services.BrazilTaxService;
import locadora.module.services.RentalService;

public class CarRentalTest {
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);

		double pricePerHour = 10.00;
		double pricePerDay = 130.00;
	
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Vehicle vehicle = new Vehicle("Civic");
		Date start = sdf.parse("25/6/2018 10:30");
		Date finish = sdf.parse("27/6/2018 11:40");
		
		CarRental carRental = new CarRental(start, finish, vehicle);

		rentalService.processInvoice(carRental);
		
		System.out.println("Invoice:");
		System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

	}
}
