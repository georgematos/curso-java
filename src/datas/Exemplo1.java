package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Exemplo1 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = sdf1.parse("15/11/2019");
		Date d2 = sdf2.parse("15/11/2019 13:57:00");

		System.out.println("Mostrando com o formato de data padrão do Java");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("Mostrando com o formato defindo com SimpleDateFormat");
		System.out.println(sdf2.format(d1));
		System.out.println(sdf2.format(d2));
		
		System.out.println("Data atual");
		Date data = new Date();
		System.out.println(data);
		System.out.println(sdf2.format(data));
		
		System.out.println("Mostrando data no formato UTC");
		Date dataUTC = Date.from(Instant.parse("2019-11-15T14:24:04Z"));		
		System.out.println(sdf3.format(dataUTC));
		
	}
	
}
