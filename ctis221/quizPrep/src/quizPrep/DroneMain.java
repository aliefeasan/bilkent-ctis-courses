package quizPrep;

import java.util.Scanner;

public class DroneMain {

	public static void main(String[] args) {
		int id;
		Scanner input = new Scanner(System.in);
		DroneManagementSystem.addDrone();
		DroneManagementSystem.display();
		System.out.println("Avg of all Drone Flight Times: "+DroneManagementSystem.calculateAverageFlightTime());
		System.out.println("Which drone would you like to search? Enter its id: ");
		id = input.nextInt();
		if(DroneManagementSystem.searchDrone(id)==null)
			System.out.println("There is no such drone");
		else {
			System.out.println("Here is the drone you were looking for... ");
			System.out.println(DroneManagementSystem.searchDrone(id).toString());
		}
			
	}

}
