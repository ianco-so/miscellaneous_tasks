package Tarefa04;
import java.util.Scanner;
public class Tarefa04Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c_alcool = 0, c_gasolina = 0, c_disel = 0; boolean t = true;
		while (t) {
			switch (sc.nextInt()) {
			case 1: c_alcool++; break;
			case 2: c_gasolina++; break;
			case 3: c_disel++; break;
			case 4: t = false; break;
			default: break;
			}
		}
		System.out.print("Muito Obrigado\nAlcool: "+c_alcool+"\nGasolina: "+c_gasolina+"\nDisel: "+c_disel);
		sc.close();
	}
}