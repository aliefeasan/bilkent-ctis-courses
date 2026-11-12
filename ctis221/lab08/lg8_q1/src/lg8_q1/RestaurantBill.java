package lg8_q1;

import java.util.Scanner;

public class RestaurantBill {
	private int tableNo;
	private String menuItem;
	private double size;
	private double price;
	private static  int  countOfBills=0;
	private static final double CHICKEN=200;
	private static final double BEEF = 310;
	public RestaurantBill() {
		countOfBills++;
	}
	public static int getCountOfBills() {
		return countOfBills;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "RestaurantBill [tableNo=" + tableNo + ", menuItem=" + menuItem + ", size=" + size + ", price=" + price
				+ "]";
	}
	
	public void getInput(Scanner input) {
		System.out.println("\nEnter the table number: ");
		tableNo = input.nextInt();
		System.out.println("Enter the menu items's name:");
		input.nextLine(); 
		menuItem = input.nextLine();
		System.out.println("Enter the size in grams:");
		size = input.nextDouble();
		
		
	}
	
	public void calculateBill() {
		price=0;
		if(menuItem.equalsIgnoreCase("chicken wrap")) {
			price=200;
			if(size==180)
				price+=price+price*0.7;
		}
		else {
			price=310;
			if(size==180)
				price+=price+price*0.7;
		}
		if(size==120)
			price+=price+price*0.4;
		System.out.println("\nThe bill is "+price+" TL\n");
	}
	
	
	
	
}
