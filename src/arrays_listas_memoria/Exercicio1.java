package arrays_listas_memoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.println("How many employees will be resistered? ");
		int qtdEmp = sc.nextInt();

		for (int i = 0; i < qtdEmp; i++) {
			System.out.printf("Employee #%d ", i + 1);
			System.out.print("Enter ID: ");
			Integer id = sc.nextInt();
			System.out.print("Entre name: ");
			String name = sc.next();
			System.out.print("Enter initial salary: ");
			Double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			employees.add(emp);
			System.out.println("----------------------------");
		}

		for (Employee emp : employees) {
			System.out.println(emp.toString());
			System.out.println("----------------------------");
		}

		System.out.println("Enter the employee ID that will have salary increase: ");
		int id = sc.nextInt();

		Employee employee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employee != null) {
		
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			employee.increaseSalary(percent);
			
		} else {
			
			System.out.println("This ID does not exist!");			
			
		}

		for (Employee emp : employees) {
			System.out.println(emp.toString());
			System.out.println("----------------------------");
		}

		sc.close();

	}

}
