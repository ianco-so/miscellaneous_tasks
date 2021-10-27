package Tarefa05;
import java.util.Scanner;
import java.util.Locale;
public class Tarefa05Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = 0;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double t1 = sc.nextFloat(), t2 = sc.nextFloat(), t3 = sc.nextFloat();
			System.out.println((t1*2+t2*3+t3*5)/9);
		}
		sc.close();
	}
}