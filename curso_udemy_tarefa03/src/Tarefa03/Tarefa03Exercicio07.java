package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		if (x == 0 || y == 0) {
			if (x == 0 && y != 0) System.out.println("Axle Y");
			else if (x != 0 && y == 0) System.out.println("Axle X");
			else System.out.println("Root");
		}
		else if (x > 0 && y > 0) System.out.println("Q1");
		else if (x < 0 && y > 0) System.out.println("Q2");
		else if (x < 0 && y < 0) System.out.println("Q3");
		else if (x > 0 && y < 0) System.out.println("Q4");
		sc.close();
	}
}