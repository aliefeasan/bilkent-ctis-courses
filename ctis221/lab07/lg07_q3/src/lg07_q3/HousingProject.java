package lg07_q3;

import java.util.Scanner;

public class HousingProject {
	private String brand;
	private String city;
	private double price;
	private int numberOfPayment;
	private String housePlan;
	public HousingProject(String brand, String city, double price, int numberOfPayment, String housePlan) {
		super();
		this.brand = brand;
		this.city = city;
		this.price = price;
		this.numberOfPayment = numberOfPayment;
		this.housePlan = housePlan;
	}
	public HousingProject() {
		super();
	}
	@Override
	public String toString() {
		return "HousingProject [brand=" + brand + ", city=" + city + ", price=" + price + ", numberOfPayment="
				+ numberOfPayment + ", housePlan=" + housePlan + "]";
	}
	
	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to add Housing Project (Yes/No): ");
		String check = input.next();
		if(check.equalsIgnoreCase("yes")) {
			
			
		}
		
	}
	
}
