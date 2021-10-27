package Tarefa02;
import java.util.Scanner;
public class Tarefa02Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int Code1, Code2, Number1, Number2;
		float Price1, Price2;
		Code1 = sc.nextInt();
		Number1 = sc.nextInt();
		Price1 = sc.nextFloat();
		Code2 = sc.nextInt();
		Number2 = sc.nextInt();
		Price2 = sc.nextFloat();
		System.out.printf("Valor a pagar: R$ %.2f", (Number1*Price1 + Number2*Price2));
		sc.close();
	}
}