package lab08;

import java.util.Scanner;

public class RestaurantBillMain {

	public static void main(String[] args) {
		RestaurantBill bill;
		Scanner input = new Scanner(System.in);
		String check;
		System.out.println("Do you want to check the bill (Yes/No): ");
		check=input.nextLine();
		while(check.equalsIgnoreCase("yes")) {
			bill = new RestaurantBill(); 
			bill.getInput(input);
			bill.calculateBill();
			System.out.println("The bill is "+bill.getPrice()+" TL");
			System.out.println("Do you want to check the bill (Yes/No): ");
			check=input.nextLine();
			check=input.nextLine();
		}
			System.out.println("There are "+RestaurantBill.getCountOfBills()+" bills");
	}

}
