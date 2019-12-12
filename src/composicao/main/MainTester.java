package composicao.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.entities.Department;
import composicao.entities.HourContract;
import composicao.entities.Worker;
import composicao.enums.WorkerLevel;

public class MainTester {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Department dep = new Department();
		Worker worker = new Worker();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		dep.setName("Design");
		worker.setDepartment(dep);
		worker.setName("Alex");
		worker.setLevel(WorkerLevel.valueOf(2));		
		worker.setBaseSalary(1200.00);

		HourContract contract1 = getHourContract("20/08/2018", 50.0, 20, sdf);
		HourContract contract2 = getHourContract("13/06/2018", 30.0, 18, sdf);
		HourContract contract3 = getHourContract("25/08/2018", 80.0, 10, sdf);
		
		worker.addContract(contract1);
		worker.addContract(contract2);
		worker.addContract(contract3);

		System.out.println("-------------------------------");
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sdf.applyPattern("MM/yyyy");
		String stringDate = sc.next();
		Date date = sdf.parse(stringDate);
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.printf("Name: %s\n" + "Department: %s\n" + "Income for %s: %.2f\n", worker.getName(),
				worker.getDepartment().getName(), stringDate, worker.income(month, year));

		sc.close();
	}

	private static HourContract getHourContract(String data, double valuePerOur, int duration, SimpleDateFormat sdf) throws ParseException {
		
		HourContract contract = new HourContract();
		
		contract.setDate(sdf.parse(data));
		
		contract.setValuePerHour(valuePerOur);
		
		contract.setHours(duration);
		
		return contract;
	}
	
}
