package quizPrep;

import java.util.Scanner;

public class DroneManagementSystem {
	private static final int MAX_CAPACITY = 5;
	private static Drone[] drones = new Drone[MAX_CAPACITY];
	private static int count = 0;
	

	
	public static void addDrone() {
		Scanner input = new Scanner(System.in);
		String check = "y";
		int id;
		while(check.equalsIgnoreCase("y") && count<MAX_CAPACITY) {
			Drone d = new Drone();
			System.out.println("Enter Drone Id:");
			id = input.nextInt();
			if(searchDroneById(id)) {
				System.out.println("Drone ID already exists. Please enter a different ID. ");
				do {
					System.out.println("Enter Drone Id:");
					id = input.nextInt();
				}while(searchDroneById(id));
			}
			d.setId(id);
			d.getInput(input);
			drones[count] = d;
			System.out.println("Drone added successfully!");
			count++;
			if(count == MAX_CAPACITY)
				System.out.println("Maximum capacity of students reached.");
			else {
				System.out.println("Do you want to add another drone? (Y/N):");
				check = input.next();
			}
		}
	}
	
	public static boolean searchDroneById(int id) {
		for(int i=0;i<count;i++) {
			if(id==drones[i].getId())
				return true;
		}
		return false;
	}
	

	public static Drone searchDrone(int id) {
		for(int i=0;i<count;i++) {
			if(id==drones[i].getId())
				return drones[i];
		}
		return null;
	}
	
	public static double calculateAverageFlightTime() {
		double sum = 0.,avrg;
		for(int i=0;i<count;i++) 
			sum+=drones[i].getFlightTime();
		avrg = sum/count;
		return avrg;
	}
	
	public static void display() {
		System.out.println("Here is a list of the Drones:");
		for(int i=0;i<count;i++) 
			 System.out.println(drones[i].toString());
	}
	
}
