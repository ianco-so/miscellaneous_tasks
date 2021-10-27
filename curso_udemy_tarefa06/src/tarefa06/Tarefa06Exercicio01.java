package tarefa06;

import java.util.Scanner;

public class Tarefa06Exercicio01 {

	public static void main(String[] args) {
		Rectangle  rectangle = new Rectangle();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		System.out.println(rectangle.diagonal());
		sc.close();
	}
}
