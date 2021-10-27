package tarefa09;

public class Employee {
	private int id;
	private String name;
	private double salary;
	protected Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	protected String getName() {return name;}
	protected void setName(String name) {this.name = name;}
	protected double getSalary() {return salary;}
	protected void setSalary(double salary) {this.salary = salary;}
	protected int getId() {return id;}
	
	public String toString() { return "employees [id=" + id + ", name=" + name + ", salary=" + salary + "]";}
	
	protected void increaseSalary(double porcentage) { this.salary += this.salary*(porcentage/100);}
}