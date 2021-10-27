package tarefa08;

import java.util.Scanner;

public class hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent [] rent;
		int n = 0;
		
		System.out.println("How many rooms will be rented?");
		n = sc.nextInt();
		rent = new Rent [n];
		
		for (int i = 0; i < rent.length; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:\n",(i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[i] = new Rent(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		int count = 0;
		for (int i = 0; i < Rent.room.length; i++) {
			if (Rent.room[i]) {
				count ++;
				System.out.println(count+": "+rent[count]);
			}
		}
		
		sc.close();
	}
}
