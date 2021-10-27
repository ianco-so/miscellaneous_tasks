package Tarefa02;
import java.util.Scanner;
public class Tarefa02Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int hour = sc.nextInt();
		double salary = sc.nextInt();
		System.out.printf("NUMBER: %d\nSALARY: R$ %.2f",number,(hour*salary));
		sc.close();
	}
}