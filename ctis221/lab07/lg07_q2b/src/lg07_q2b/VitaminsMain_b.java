package lg07_q2b;

import java.util.Scanner;

public class VitaminsMain_b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = input.next();
		System.out.println("Enter Brand Name: ");
		String brandName = input.next();
		System.out.println("Enter the number of capsule: ");
		int numOfCapsule = input.nextInt();
		System.out.println("Enter the Code number: ");
		int codeNumber = input.nextInt();
		
		Vitamins vitamin1 = new Vitamins(name,numOfCapsule,brandName,codeNumber);
		System.out.println(vitamin1.toString());
	}

}
