package locadora.module.entities;

import java.util.Date;

public class CarRental {

	private Date startHour;
	private Date finishHour;
	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental(Date start, Date finish, Vehicle vehicle) {
		setStartHour(start);
		setFinishHour(finish);
		this.vehicle = vehicle;
	}

	public Date getStartHour() {
		return startHour;
	}

	public void setStartHour(Date startHour) {
		if(validateStartDate(startHour)) {
			this.startHour = startHour;
		} else {
			throw new RuntimeException("The start date must be now or after now.");
		};
	}

	public Date getFinishHour() {
		return finishHour;
	}

	public void setFinishHour(Date finishHour) {
		if (this.startHour == null) {
			throw new RuntimeException("There's no start date.");
		} else if (validateFinishDate(finishHour)) {
			this.finishHour = finishHour;
		} else {
			throw new RuntimeException("The finish date must be after start date.");
		};
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	private boolean validateStartDate(Date startDate) {
		Date now = new Date();
		if (startDate.before(now)) {
			return true;
		} else {
			return false;			
		}
	}

	private boolean validateFinishDate(Date finishDate) {
		if (this.startHour.before(finishDate)) {
			return true;
		} else {
			return false;
		}
	}

}
