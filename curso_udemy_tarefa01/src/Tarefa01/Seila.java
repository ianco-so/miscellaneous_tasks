package Tarefa01;

public class Seila {
	public static void main(String[] args) {
		int a1 = 7, r=3, an, f=40, sum = 0;
		an =a1;
		for (int i = 1; i <= f; i++) {
			System.out.print("n = "+i+"|   ");
			sum = 0;
			for (int j = 1; j <= i; j++) {
				System.out.print(an+" ");
				sum =sum + an;
				an =an + r;
			}
			System.out.print("|SUM = "+sum);
			System.out.println();
		}
	}
}
