package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), j = sc.nextInt();
		if (i%j == 0 || j%i == 0) System.out.println("They're multiple");
		else System.out.println("They'arent multiple");
		sc.close();
	}
}