package tarefa07;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa07Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;
		int number = 0;
		String holder = null;
		char yn = ' ';
		
		Locale.setDefault(Locale.US);
		System.out.print("Enter acoount number: ");
		number = sc.nextInt();
		System.out.print("Enter acoount holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("There is an initial deposit? (y/n): ");
		yn = Character.toLowerCase(sc.next().charAt(0));
		if (yn == 'y') {
			double initialValue = 0.0;
			System.out.print("Enter initial deposit value: ");
			initialValue = sc.nextDouble();
			account = new Account(number, holder, initialValue);
		}
		else if (yn == 'n') {
			System.out.println("Okay");
			account = new Account(number, holder);
		}
		else System.out.println("Invalid value");
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter deposit value: ");
		account.add(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdrew value: ");
		account.take(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
