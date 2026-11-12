package quizPrep;

import java.util.Scanner;

public class Drone {
	private String model;
	private int id;
	private double flightTime;
	private boolean hasCamera;
	
	public Drone() {
	}
	
	public String getModel() {
		return model;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}

	public boolean CameraStatus() {
		return hasCamera;
	}

	public void getInput(Scanner input) {
		String check;
		System.out.println("Enter Drone Model:");
		input.nextLine();
		model = input.nextLine();
		System.out.println("Drone Flight Time: ");
		flightTime = input.nextDouble();
		System.out.println(" Does drone have a camera? (Y/N):");
		check = input.next();
		if(check.equalsIgnoreCase("y"))
			hasCamera = true;
		else
			hasCamera = false;
		
	}

	public String toString() {
		String camera;
		if(CameraStatus())
			camera = "Camera Status=Drone has camera. ";
		else
			camera = "Camera Status=Drone has not a camera. ";
		return "Drone [model=" + model + ", id=" + id + ", flightTime=" + flightTime + ", hasCamera=" + camera + "]";
	}

	
}
