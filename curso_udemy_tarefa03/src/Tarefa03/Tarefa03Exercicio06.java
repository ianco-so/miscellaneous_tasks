package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float i = sc.nextInt();
		if (0 <= i && i <= 25) System.out.println("In Range [0, 25]");
		else if (25 < i && i <= 50) System.out.println("In Range (25, 50]");
		else if (50 < i && i <= 75) System.out.println("In Range (50, 75]");
		else if (75 < i && i <= 100) System.out.println("In Range (75, 100]");
		else System.out.println("Out OF Any Range");
		sc.close();
	}
}