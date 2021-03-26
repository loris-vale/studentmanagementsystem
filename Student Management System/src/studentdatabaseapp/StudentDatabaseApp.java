package studentdatabaseapp;

import java.util.Scanner;

import javax.swing.JFrame;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("School Management");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		}
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());	
		}
		
	}

}
