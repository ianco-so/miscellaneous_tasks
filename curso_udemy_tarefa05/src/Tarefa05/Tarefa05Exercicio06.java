package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = Math.abs(N); i > 0; i--) if (N%i == 0) System.out.println(i);;
		sc.close();
	}
}