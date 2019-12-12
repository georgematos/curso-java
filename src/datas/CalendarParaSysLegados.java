package datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarParaSysLegados {

	public static void main(String[] args) {
		// permite criar formato de texto para data, depois fazer a conversão de data para texto (formatting) ou texto para data (parsing)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// cria uma data(instant) usando o formato padrão
		Date d = Date.from(Instant.parse("2018-06-25T15:42:01Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
	}
	
}
