package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDeRepeticoes = sc.nextInt();
		for (int i = (numeroDeRepeticoes > 0)? numeroDeRepeticoes: 0; i > 0; i--) {
			System.out.println(i);
			double t1 = sc.nextDouble(), t2 = sc.nextDouble();
			if (t2 == 0) System.out.println("Divisao impossivel");
			else System.out.println(t1/t2);
		}
		sc.close();
	}
}