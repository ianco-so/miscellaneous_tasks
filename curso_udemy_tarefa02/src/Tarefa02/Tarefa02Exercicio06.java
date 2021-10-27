package Tarefa02;
import java.util.Scanner;
public class Tarefa02Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat(), B = sc.nextFloat(), C = sc.nextFloat();
		System.out.print("TRIANGULO: "+(A*C)/2+"\n"
				+ "CIRCULO: "+Math.PI*Math.pow(C, 2)+"\n"
						+ "TRAPEZIO: "+((A+B)/2)*C+"\n"
								+ "QUADRADO: "+Math.pow(B, 2)+"\n"
										+ "RETANGULO: "+A*B);
		sc.close();
	}
}