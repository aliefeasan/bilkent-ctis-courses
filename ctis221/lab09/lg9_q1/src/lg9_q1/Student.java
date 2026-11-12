package lg9_q1;

import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private double gpa;

	private boolean hasScholarship;
	public Student() {
	}
	
	public void getInput(Scanner input) {
		System.out.println("Enter Student Id:");
		id = input.nextInt();
		while(StudentManagementSystem.searchStudentById(id)) {
			System.out.println("Student ID already exists. Please enter a different ID. ");
			System.out.println("Enter Student Id:");
			id = input.nextInt();
		}
		input.nextLine();
		System.out.println("Enter Student Name: ");
		name = input.nextLine();
		System.out.println("Enter Student Gpa:");
		gpa=input.nextDouble();
		input.nextLine();
		System.out.println("Does student has scholarship? (Y/N):");
		if(input.nextLine().equalsIgnoreCase("y"))
			hasScholarship=true;
		else
			hasScholarship=false;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student Name=" + name + ", Id=" + id + ", Gpa=" + gpa + ", Scholarship Status=" + hasScholarship + "]";
	}


	
}
