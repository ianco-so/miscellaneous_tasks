package tarefa06;

import java.util.Scanner;

public class Tarefa06Exercicio02 {

	public static void main(String[] args) {
		Employee  employee = new Employee();
		Scanner sc = new Scanner (System.in);
		employee.name = sc.next();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		System.out.println("Employee: "+employee);
		System.out.println("Witch percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Updated data: "+employee);
		sc.close();
	}
}
