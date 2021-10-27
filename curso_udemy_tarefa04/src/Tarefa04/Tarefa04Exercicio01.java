package Tarefa04;
import java.util.Scanner;
public class Tarefa04Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.nextInt() != 2002) System.out.println("Senha Invalida");
		System.out.println("Senha valida");
		sc.close();
	}
}