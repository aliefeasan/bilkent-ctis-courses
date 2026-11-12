package lab08;

import java.util.Scanner;

public class RestaurantBill {
	private int tableNo;
	private String menuItem;
	private double size;
	private double price;
	private static int countOfBills=0;
	private static final double CHICKEN=200;
	private static final double BEEF=310;
	public RestaurantBill() {
		countOfBills++;
	}
	
	
	public static int getCountOfBills() {
		return countOfBills;
	}


	public double getPrice() {
		return price;
	}



	public void getInput(Scanner input) {
		System.out.println("Enter the table number:");
		tableNo = input.nextInt();
		input.nextLine();
		System.out.println("Enter the menu items's name:");
		menuItem = input.nextLine();
		System.out.println("Enter the size in grams:");
		size = input.nextDouble();
	}
	
	public void calculateBill() {
		if(menuItem.equalsIgnoreCase("Chicken Wrap")) {
			price=CHICKEN;
			if(size==180)
				price+=price*0.7;
		}
		else {
			price=BEEF;
			if(size==180)
				price+=price*0.8;

		}
		if(size==120)
			price+=price*0.4;
	}
	
	
	
	
}
