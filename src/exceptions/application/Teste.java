package exceptions.application;

import java.util.Calendar;
import java.util.Date;

import exceptions.model.entities.Reservation;
import exceptions.model.exceptions.DomainException;

public class Teste {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2019, 12, 9);
		Date checkIn = cal.getTime();
		cal.set(2019, 12, 8);
		Date checkOut = cal.getTime();
		Reservation reservation;
		try {
			reservation = new Reservation(0212, checkIn, checkOut);
			System.out.println(reservation.toString());
		} catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
