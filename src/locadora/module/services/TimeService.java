package locadora.module.services;

import java.util.Date;

/**
 * The class TimeService was created for getting easy to work with dates in this project.
 *
 * @author  George Matos
 * @since   JDK1.8
 */
public abstract class TimeService {

	public static double getTimeDifferenceInHours(Date finishDate, Date startDate) {
		double hours = (double) (finishDate.getTime() - startDate.getTime()) / 1000 / 60 / 60;
		return hours;
	}

}
