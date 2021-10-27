package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		String ParantPath = "C:\\Users\\ianco\\eclipse-workspace\\curso_udemy_tarefa15";
		String path = ParantPath+"\\in.csv";
		File file = new File(path);
		List<Product> products = new ArrayList<>();
		Scanner sc = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String information[];
			sc = new Scanner(file);
			do {
				information = br.readLine().split(",");
				products.add(new Product(information[0], Double.parseDouble(information[1]), Integer.parseInt(information[2])));
				sc.nextLine();
			} while (sc.hasNextLine());
		} catch (IOException e) {	e.printStackTrace();}
		
		new File(ParantPath + "\\out").mkdir();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ParantPath + "\\out\\summary.csv"))) {
			for (Product p: products) {
			bw.write(p.toString());
			bw.newLine();
			}
		} catch (IOException e) {	e.printStackTrace();}
		
		sc.close();
		//for(Product p: products) System.out.println(p.toString());
	}
}