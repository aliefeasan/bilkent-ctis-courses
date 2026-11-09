package quzi1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int id;
		
		StudentManagementSystem.addStudent();
		StudentManagementSystem.display();
		System.out.printf("**********************\nAvg of all Student GPA's:");
		System.out.println(StudentManagementSystem.calculateAverageGPA()+"\n******************");
		System.out.println("Which student would you like to search? Enter his/her id: ");
		Scanner input = new Scanner(System.in);
			
		id = input.nextInt();
		Student s1 = new Student();
		System.out.println("Here is the student you were looking for...\n"+StudentManagementSystem.searchStudent(id).toString());
		
		
	}

}
