package tarefa11;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Operation {
	
	public static void main(String[] args) {
		final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc;
		File file = new File("C:\\Users\\ianco\\eclipse-workspace\\"
				+ "curso_programacao\\src\\tarefa11\\data.txt");
		try { sc = new Scanner(file);} catch (FileNotFoundException e) { sc = null;}
		
		String name = sc.nextLine();
		String email = sc.next();
		Date birthDate;
		try {	birthDate = sdf.parse(sc.next());} catch (ParseException e) { birthDate = new Date();}
		Client client = new Client(name, email, birthDate);
		
		String orderStatus = sc.next();
		int items = sc.nextInt();
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
		@SuppressWarnings("unused")
		OrderItem item;
		@SuppressWarnings("unused")
		Product product;
		for (int i = 0; i < items; i++) {
			String productName = sc.next();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();
			order.addItem(item = new OrderItem(quantity,
					product = new Product(productName, price)));
		}
		System.out.println("Order Summary:");
		System.out.println(order);
		System.out.print("Total price: "+order.total());
		sc.close();
	}
}