package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String studentId;
	private String firstName;
	private String lastName;
	private int year;
	private String yearDef;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		//Insert Student's First Name
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student's first name: ");
		this.firstName = in.nextLine();
		// Insert Student's Last name
		System.out.print("Enter Student's last name: ");
		this.lastName = in.nextLine();
		// Insert Student's year
		System.out.print("1: Freshmen\n2: Sophmore\n3: Junior\n4: Senior\nEnter Student's class level: ");
		this.year = in.nextInt();
		// Verify year - attribute definition
		switch(year) {
		case 1:
			yearDef = "Freshmen year";
			break;
		case 2:
			yearDef = "Sophmore year";
			break;
		case 3:
			yearDef = "Junior year";
			break;
		case 4:
			yearDef = "Senior year";
			break;
		}
		setStudentId();
		
	}
	
	// Generate a StudentID
	private void setStudentId() {
		// Grade Level + ID
		id++;
		this.studentId = (year + "" + id);
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits Q
		do {
			System.out.print("Enter a course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				if (courses == null) {
					courses = "\n - " + course;
				} else {
					courses += "\n - " + course;
				}
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
			
		} while (true);
		
	}
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance + "€");
	}
	
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		if (payment == 0) {
			System.out.println("Skipped payment step sucessfully");
		} else {
			tuitionBalance -= payment;
			System.out.println("Thank you for your payment of: " + payment + "€");
		}
		
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "Student ID: " + studentId +
				"\nName: " + firstName + " " + lastName +
				"\nGrade Level: " + yearDef +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: " + tuitionBalance + "€";
	}
}
