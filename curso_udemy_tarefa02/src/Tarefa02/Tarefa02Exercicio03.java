package Tarefa02;
import java.util.Scanner;
public class Tarefa02Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		System.out.printf("Diferença = "+(A*B - C*D));
		sc.close();
	}
}