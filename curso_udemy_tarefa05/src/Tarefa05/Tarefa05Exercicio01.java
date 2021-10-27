package Tarefa05;
import java.util.Scanner;
public class Tarefa05Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (0 <= x && x <= 1000) {
			for (int i = 0; i < x; i++) {
				if (i%2 != 0) System.out.println(i);
			}
		} else System.out.println("valor invalido");
		sc.close();
	}
}