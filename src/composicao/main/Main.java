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

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Department dep = new Department();
		Worker worker = new Worker();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department name: ");
		dep.setName(sc.nextLine());
		worker.setDepartment(dep);
		
		System.out.println("Enter worker data: ");		
		System.out.print("Name: ");
		worker.setName(sc.nextLine());
		
		System.out.print("Level: ");
		int level = sc.nextInt();
		worker.setLevel(WorkerLevel.valueOf(level));
		
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		worker.setBaseSalary(baseSalary);
		
		System.out.print("How many contracts to this worker? ");
		int conts = sc.nextInt();
		for (int i = 0; i < conts; i++) {
			
			HourContract contract = new HourContract();
			
			System.out.print("Enter date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			contract.setDate(contractDate);

			System.out.print("Value per hour: ");
			contract.setValuePerHour(sc.nextDouble());
			
			System.out.print("Duration: ");
			contract.setHours(sc.nextInt());
						
			worker.addContract(contract);
		}
		
		System.out.println("-------------------------------");
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sdf.applyPattern("MM/yyyy");
		String stringDate = sc.next();
		Date date = sdf.parse(stringDate);
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.printf("Name: %s\n"
				+ "Department: %s\n"
				+ "Income for %s: %.2f\n", worker.getName(), worker.getDepartment().getName(), stringDate, worker.income(month, year));
		
		sc.close();
	}
}
