package yonas;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
	
		//Ask how many students to added 
		System.out.print("Enter number of new students to enroll : ");
		Scanner in = new Scanner(System.in);
		int numberOfStudents = in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		//create N number of students
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());			
		}
		

	}

}
