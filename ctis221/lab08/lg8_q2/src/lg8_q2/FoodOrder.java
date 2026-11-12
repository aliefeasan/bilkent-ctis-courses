package lg8_q2;

import java.util.Scanner;

public class FoodOrder {
	private String restaurant;
	private String item;
	private double price;
	private static int orderCount=0;
	private static int couponCount=0;
	private static final double COUPON=30;
	
	public FoodOrder() {
		orderCount++;
	}
	
	
	public void getInput(Scanner input) {
		System.out.println("Enter restaurant: ");
		restaurant = input.nextLine();
		System.out.println("Enter the ordered item: ");
		item = input.nextLine();
		System.out.println("Enter the price of the item: ");
		price = input.nextInt();
		input.nextLine();
	}
	
	public void applyCount() {
		if(price>COUPON) {
			price = price-COUPON;
			couponCount++;
		}
	}
	
	public static boolean checkForCoupons() {
		if(orderCount%2==0) {
			couponCount++;
			return true;
		}
		return false;
	}
	public static int getOrderCount() {
		return orderCount;
	}
	public static int getCoupunCount() {
		return couponCount;
	}


	@Override
	public String toString() {
		return " "+price+" ";
	}
	
}
