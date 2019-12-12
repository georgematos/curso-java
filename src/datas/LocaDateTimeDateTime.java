package datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocaDateTimeDateTime {

	public static void main(String[] args) {
		
		// data atual
		LocalDate today = LocalDate.now();
		
		// data atual + 1 dia
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		
		// data atual - 1 mes
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		
		// obter dia da semana na data especificada
		DayOfWeek dayOfWeekInDate = LocalDate.parse("2019-11-16").getDayOfWeek();
		
		// obter dia da semana hoje
		DayOfWeek dayOfWeekToday = LocalDate.now().getDayOfWeek();
		
		// obter dia do mes
		int day = LocalDate.now().getDayOfMonth();
		
		// obert mes
		int month = LocalDate.now().getMonthValue();
		
		System.out.println(today);
		System.out.println(tomorrow);
		System.out.println(previousMonthSameDay);
		System.out.println(dayOfWeekInDate);
		System.out.println(dayOfWeekToday);
		System.out.println(day);
		System.out.println(month);
		
		// ver mais em https://www.baeldung.com/java-8-date-time-intro
	}
	
}
