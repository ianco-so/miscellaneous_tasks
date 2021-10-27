package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i%2 == 0) System.out.println("Par");
		else System.out.println("Impar");
		sc.close();
	}
}