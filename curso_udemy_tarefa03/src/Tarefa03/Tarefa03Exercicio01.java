package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i > 0) {
			System.out.println("Positivo");
		}
		else if (i == 0) System.out.println("Zero");
		else System.out.println("Negativo");
		sc.close();
	}
}