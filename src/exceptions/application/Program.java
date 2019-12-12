package exceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.model.entities.Reservation;
import exceptions.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Integer roomNumber;
		Date checkIn;
		Date checkOut;

		try {

			System.out.print("Room number: ");
			roomNumber = scan.nextInt();

			System.out.print("Check-in date: ");
			checkIn = sdf.parse(scan.next());

			System.out.print("Check-out date: ");
			checkOut = sdf.parse(scan.next());

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation.toString());

			System.out.println("--------------updating dates-----------------");

			System.out.print("Check-in date: ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date: ");
			checkOut = sdf.parse(scan.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Date update sucess.");
			System.out.println(reservation.toString());

		} catch (ParseException e) {

			System.out.println("Invalide date format.");

		} catch (DomainException e) {

			System.out.println("Error in reservation: " + e.getMessage());

		} catch (InputMismatchException e) {

			System.out.println("Input error: enter with numbers");

		} catch (RuntimeException e) {

			System.out.println("Unexpected error.");

		}

		scan.close();
	}

}
