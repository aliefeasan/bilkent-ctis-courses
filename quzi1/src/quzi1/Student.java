package quzi1;

import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private double gpa;
	private boolean hasScholarship;
	
	public Student() {
	}
	

	public void getInput(Scanner input) {
		String check;
		System.out.println("Enter Student Name:");
		name = input.nextLine();
		System.out.println("Enter student gpa: ");
		gpa = input.nextDouble();
		input.nextLine();
		System.out.println("Does student has scholarship? (Y/N): Y");
		check  = input.nextLine();
		if(check.equalsIgnoreCase("y")) {
			hasScholarship=true;
		}
		else
			hasScholarship=false;
		
		}

	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isHasScholarship() {
		return hasScholarship;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ",\nid=" + id + ",\ngpa=" + gpa + ",\nhasScholarship=" + hasScholarship+ "]";
	}

	
	

}
