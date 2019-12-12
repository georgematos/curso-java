package arrays_listas_memoria;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalary(double percertage) {
		
		double plus = salary * (percertage / 100);
		this.salary = this.salary + plus;
		
	}
	
	public String toString() {
		String string = String.format("ID: %d / Name: %s / Salary: %.2f", id, name, salary);
		return string;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}	
	
}
