package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.InternalException;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String holder = null;
		double balance = 0.0, withdrawLimit = 0.0, amount = 0.0;
		Account account;
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Initial balance: ");
		balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		withdrawLimit = sc.nextDouble();
		try {
			account =  new Account (number, holder, balance, withdrawLimit);
			
			System.out.println("");
			System.out.println("Enter amount for withdraw: ");
			amount = sc.nextDouble();
			account.withdraw(amount);
		} 
		catch (InternalException e) {	System.out.println(e.getMessage());}
		catch (InputMismatchException e) {	System.out.println("This value should not be accepted");}
		
		sc.close();
	}
}