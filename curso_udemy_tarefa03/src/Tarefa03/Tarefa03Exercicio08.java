package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble(), tax;
		if (salary <= 2000.0 && salary >= 0.0) System.out.println("Isento");
		else if (salary <= 3000.0) {tax = (salary-2000.0)*0.08; System.out.printf("R$: %.2f\n",tax);}
		else if (salary <= 4500.0) {tax = 1000.0*0.08+(salary-3000.0)*0.18; System.out.printf("R$: %.2f\n",tax);}
		else if (salary > 4500.0) {tax = 1000.0*0.08+1500*0.18+(salary-4500.0)*0.28; System.out.printf("R$: %.2f\n",tax);}
		else System.out.println("Invalid salary");
		sc.close();
	}
}