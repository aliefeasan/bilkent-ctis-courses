package lg8_q1;

import java.util.Scanner;

public class RestaurantBillMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to check the bill (Yes/No): ");
		String check = input.nextLine();
		
		int tableNo;
		while(check.equalsIgnoreCase("yes")) {
			RestaurantBill bill = new RestaurantBill();
			bill.getInput(input);
			bill.calculateBill();
			System.out.println("Do you want to check the bill (Yes/No): ");
			input.nextLine();
			check = input.nextLine();

		}
		System.out.println("There are "+RestaurantBill.getCountOfBills()+" bills.\n");
	}

}
