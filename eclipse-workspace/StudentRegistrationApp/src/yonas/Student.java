package yonas;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionbalance = 0;
	private static int costPerCourse = 600;
	private static int id = 1000;

	// Constructor prompts users to enter name and year of a student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name : ");
		this.lastName = in.nextLine();

		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade year : ");
		this.gradeYear = in.nextInt();

		setStudentId();

		

	}

	// Generate ID
	private void setStudentId() {
		// Grade year + id
		id++;
		this.studentId = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		//Going trough loop
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionbalance = tuitionbalance + costPerCourse;
			} else {
				break;
			}
		} while (1 != 0);
		

	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is : $"+tuitionbalance);
	}
	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Please Enter your payment : $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	// show status
	public String showInfo() {
		return "Name : "+firstName+" "+lastName+
				"\nGrade Year : " + gradeYear+
				"\nStudent ID : " + studentId+
				"\nCourses Enrolled : "+courses+
				"\nTuition Balance : $"+tuitionbalance;
	}
}
