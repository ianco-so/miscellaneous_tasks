package Tarefa03;
import java.util.Scanner;
public class Tarefa03Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), j = sc.nextInt();
		if ((0 <= i && 23 >= i) && (0<=j && 23 >= j)) {
			if (i < j) System.out.printf("The game lasted %d hours\n",j-i);
			else if (i > j) System.out.printf("The game lasted %d hours\n",24-i+j);
			else System.out.printf("The game lasted %d hours\n",24);
		}
		else System.out.println("Incompatible value");
		sc.close();
	}
}