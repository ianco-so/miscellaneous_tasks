package Tarefa01;
import java.util.Locale;
public class Tarefa01Exercicio01 {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Dask";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.5;
		double measure = 53.234567;
		System.out.print("Products:\n");
		System.out.printf("%s, witch price is $ %.2f\n", product1, price1);
		System.out.printf("%s, witch price is $ %.2f\n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (tree decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal points: %.3f", measure);
	}
}