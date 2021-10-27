package tarefa06;
import java.util.Locale;
import java.util.Scanner;
public class Tarefa06Exercicio03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Studant studant = new Studant();
		studant.name = sc.nextLine();
		for (int i = 0; i<=2; i++) studant.g[i] = sc.nextDouble();
		System.out.printf("Final Grade = %.1f\n",studant.finalGrade());
		System.out.println(studant.status());
		sc.close();
	}
}
