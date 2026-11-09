package quzi1;

import java.util.Scanner;

public class StudentManagementSystem {
	private static final int MAX_CAPACITY = 5;
	private static Student  []students = new Student[MAX_CAPACITY];
	private static int count=0;
	
	private static boolean searchStudentById(int id) {
		for(int i=0;i<count;i++) {
			if(id==students[i].getId())
				return true;
		}
		return false;
	}
	
	
	private static Scanner input = new Scanner(System.in);
	public static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		while (count < MAX_CAPACITY) {
			Student s = new Student();
			System.out.print("Enter Student Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			if (searchStudentById(id)) {
				System.out.println("Student ID already exists. Please enter a different ID.");
				continue;
			}
			s.setId(id);
			s.getInput(input);

			students[count++] = s;
			System.out.println("Student added successfully!");


			System.out.print("Do you want to add another student? (Y/N): ");
			String response = scanner.nextLine();

			if (response.equalsIgnoreCase("N")) {
				break;
			}


			if (count == MAX_CAPACITY) {
				System.out.println("Maximum capacity of students reached.");
				break;
			}
		}
	}

	public static Student searchStudent(int id) {
		for(int i=0;i<count;i++) {
			if(id==students[i].getId())
				return students[i];
		}
		return null;
	
	}
	
	public static void display() {
		System.out.println("Here is a list of the Students:");
		for(int i=0;i<count;i++) {
			System.out.println(students[i].toString());
		}
	}
	
	public static double calculateAverageGPA() {
		double sumGpa=0;

		if(count==0)
			return 0;
		for(int i=0;i<count;i++) {
			sumGpa+=students[i].getGpa();
		}
		return sumGpa/count;
	}
	
	
}
