package Tarefa02;
import java.util.Scanner;
public class Tarefa02Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		System.out.printf("Area = %.4f",Math.PI*Math.pow(radius, 2));
		sc.close();
	}
}