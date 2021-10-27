package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0, in = 0, out = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (10 <= x && x <= 20) in++;
			else out++;
		}
		System.out.println(in+" in\n"+out+" out");
		sc.close();
	}
}