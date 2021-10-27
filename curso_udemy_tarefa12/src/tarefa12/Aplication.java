package tarefa12;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc;
		File file = new File("C:\\Users\\ianco\\eclipse-workspace\\curso_programacao\\src\\tarefa12\\data.txt");
		try {	sc = new Scanner(file);} catch (FileNotFoundException e) {	sc = null;}
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			char type = (char) sc.next().charAt(0);
			String name = sc.next();
			double price = sc.nextDouble();
			switch (type) {
			case 'i':
				products.add(new ImportedProduct(name, price, sc.nextDouble()));
				break;
			case 'u':
				try {
					products.add(new UsedProduct(name, price, sdf.parse(sc.next())));
				} catch (ParseException e) {
					products.add(new UsedProduct(name, price, new Date()));
				}
				break;
			case 'c':
				products.add(new Product(name, price));
				break;
			default:
				break;
			}
		}
		
		System.out.println("Price tags:");
		for(Product p: products) System.out.println(p.priceTag());
		sc.close();
	}
}