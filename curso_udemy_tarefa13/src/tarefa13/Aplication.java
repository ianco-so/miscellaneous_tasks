package tarefa13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Scanner sc;
		File file = new File("C:\\Users\\ianco\\eclipse-workspace\\curso_programacao\\src\\tarefa13\\data.txt");
		try {	sc = new Scanner(file);} catch (FileNotFoundException e) {	sc = null;}
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Character p = sc.next().charAt(0);
			sc.nextLine();
			String name = sc.nextLine();
			Double income = sc.nextDouble();
			switch (p) {
			case 'i':
				Double healExpend = sc.nextDouble();
				list.add(new PhysicalPerson(name, income, healExpend));
				break;
			case 'c':
				Integer employee = sc.nextInt();
				list.add(new LegalPerson(name, income, employee));
				break;
			default:
				break;
			}
		}
		sc.close();
		
		System.out.println("TAXES PAID:");
		double total = 0.0;
		for (Person p: list) {
			System.out.printf(p.getName()+": $%.2f\n",p.tax());
			total += p.tax();
		}
		System.out.print("\nTOTAL TAXES: "+total);
	}
}