package lambda_exercicio_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String file = "src\\employee.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		
			List<Employee> employees = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				
				String[] field = line.split(",");
				
				employees.add(new Employee(field[0], field[1], Double.parseDouble(field[2])));
				
				line = br.readLine();
			}
			
			List<String> employeesMails = employees.stream()
					.filter(e -> e.getSalary() > 2000.0)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			employeesMails.forEach(System.out::println);
			
			Double salarySum = employees.stream()
			.filter(e -> e.getName().startsWith("M"))
			.map(e -> e.getSalary())
			.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose starts with 'M': " + salarySum);
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
