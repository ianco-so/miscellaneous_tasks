package tarefa09;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Aplication {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		int n = 0;
		
		System.out.print("How many employees will be registred?");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = employees.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		if (emp != null) {
			System.out.print("Enter the porcentage: ");
			double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
		} else System.out.println("This employee id does not exist!");
		
		System.out.println("List of employees:");
		for(Employee e: employees) {
			System.out.println(e);
		}
		
		sc.close();
	}
}
