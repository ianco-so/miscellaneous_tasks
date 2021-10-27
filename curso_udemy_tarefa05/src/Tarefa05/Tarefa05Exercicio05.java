package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N > 0) for (int i = N-1; i > 0; i--) N = N*i;
		else if (N == 0) N = 1;
		System.out.println(N);
		sc.close();
	}
}