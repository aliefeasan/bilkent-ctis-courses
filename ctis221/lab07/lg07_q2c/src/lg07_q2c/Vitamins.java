package lg07_q2c;

import java.util.Scanner;

public class Vitamins {
	private String name;
	private int numberOfCapsul;
	private String brand;
	private int codeNumber;
	public Vitamins() {
		super();
	}
	public Vitamins(String name, int numberOfCapsul, String brand, int codeNumber) {
		super();
		this.name = name;
		this.numberOfCapsul = numberOfCapsul;
		this.brand = brand;
		this.codeNumber = codeNumber;
	}
	@Override
	public String toString() {
		return "Vitamins [name=" + name + ", numberOfCapsul=" + numberOfCapsul + ", brand=" + brand + ", codeNumber="
				+ codeNumber + "]";
	}
	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = input.next();
		System.out.println("Enter Brand Name: ");
		this.brand= input.next();
		System.out.println("Enter the number of capsule: ");
		this.numberOfCapsul = input.nextInt();
		System.out.println("Enter the Code number: ");
		this.codeNumber = input.nextInt();
		
	}
	
}
