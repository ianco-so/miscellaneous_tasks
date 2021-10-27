package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt(), quantity = sc.nextInt();
		if (code == 1) System.out.println("Total: R$"+quantity*4.0);
		else if (code == 2) System.out.println("Total: R$"+quantity*4.5);
		else if (code == 3) System.out.println("Total: R$"+quantity*5.0);
		else if (code == 4) System.out.println("Total: R$"+quantity*2.0);
		else if (code == 5) System.out.println("Total: R$"+quantity*1.5);
		else System.out.println("Invalid Code");
		sc.close();
	}
}