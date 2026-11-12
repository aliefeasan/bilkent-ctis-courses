package lg9_q1;

import java.util.Scanner;

public class StudentManagementSystem {
	private static final int MAX_CAPACITY=5;
	private static Student []students = new Student[MAX_CAPACITY];
	private static int count;
	
	

	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		int i=0;
		String Scheck;
		do {
			students[i]=new Student();
			students[i].getInput(input);
			System.out.println("Student added succesfully!");
			i++;
			System.out.println("Do you want to add another student? (Y/N): ");
			Scheck = input.nextLine();
		}while(Scheck.equalsIgnoreCase("y")&&i<MAX_CAPACITY);
		System.out.println("Maximum capacity of students reached.");
	}
	
	public static boolean searchStudentById(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i].getId() == id) 
				return true;
		}
		return false;
	}
	
	public static Student searchStudent(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i].getId() == id) 
				return students[i];
		}
		return null;
	}
	


	public static void display(){
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	
	private static double calculateAvarageGPA() {
		double sumgpa=0;
		for(int i=0;i<students.length;i++) {
			sumgpa += students[i].getGpa();
		}
		return sumgpa;
	}
	
}

