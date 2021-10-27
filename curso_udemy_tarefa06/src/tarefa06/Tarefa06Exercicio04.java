package tarefa06;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa06Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dollarPrice = 0.0, amount = 0.0;
		
		Locale.setDefault(Locale.US);
		System.out.println("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		amount = sc.nextDouble();
		System.out.printf("Amount to be paid in real is: %.2f",CurrencyConverter.dollarToReal(dollarPrice, amount));
	}
}