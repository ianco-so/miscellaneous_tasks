package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <=3;j++) System.out.print((int)Math.pow(i, j)+"   ");
			System.out.println();
		}
		sc.close();
	}
}