package lg8_q2;

import java.util.Scanner;

public class FoodOrderMain {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String check;
		String couponCheck;
		
		System.out.println("Do you want to place an order? (Yes/No): ");
		check = input.nextLine();
		
	
		while(check.equalsIgnoreCase("yes")) {
			FoodOrder order = new FoodOrder();
			
			order.getInput(input);
			if(FoodOrder.checkForCoupons()) {
				System.out.println("Congratulations! You won a coupon!");
				System.out.println("Do you want to use a coupon? (Yes/No): ");
				couponCheck = input.nextLine();
				
				if(couponCheck.equalsIgnoreCase("yes")) {
					order.applyCount();
					System.out.println("New price after applying coupon is"+order.toString()+"TL");
				}
			}
			System.out.println("Do you want to place an order? (Yes/No): ");
			check = input.nextLine();
		}
		
		System.out.println("You have made "+FoodOrder.getOrderCount()+" orders.");
		System.out.println("You have "+FoodOrder.getCoupunCount()+" coupons left.");
	}

}
