package jpa.mainrunner;


import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {
	private Scanner reader;
	private StudentService ss;
	private CourseService cs;
	private Student student;
	
	public SMSRunner() {
		reader = new Scanner(System.in);
		ss = new StudentService();
		cs = new CourseService();
		student = new Student();
		//checks if the DB has already been established, if not, will create tables and seed data.
		if(ss.getAllStudents().size() == 0) {
			seedData data = new seedData();
		}
	}
	

	public static void main(String[] args) {
		//Gets each necessary instance of the classes running.
		SMSRunner sms = new SMSRunner();
		//calls on the main program to run.
		sms.run();
	}
		private void run() {
		Integer choice = 0;
		while(choice != 2) {
			//calls the main menu
			menu1();
			choice = reader.nextInt();
			//switch case to either log in or quit program.
			switch(choice) {
			case 1: 
				System.out.println("Please enter your email: ");
				String email = reader.next();
				//checks if the email is in the database
				if(ss.getStudentByEmail(email) != null) {
					student = ss.getStudentByEmail(email);
					System.out.println("Please enter your password: ");
					String password = reader.next();
					//validates email and password.
					if(ss.validateStudent(email, password).equals(true)) {
						//used this counter so that I can create proper table display around hibernate debug messages.
						int counter = 0;
						for(Course c : ss.getStudentCourses(email)) {
							//if counter is 0 print the top of table display
							if(counter == 0) {
								System.out.println("Currently Registered Courses:");
								System.out.printf("%-10s %-30s %-30s %n", "ID", "Course", "Instructor");
								counter++;
							}
							//prints all courses the student is currently taking.
							System.out.printf("%-10d %-30s %-30s %n", c.getcId(), c.getcName(), c.getcInstructor());	
						}
						//call on the next registry menu.
						registerMenu();
						Integer newChoice = reader.nextInt();
						//switch statement for second menu.
						switch(newChoice) {
						case 1: 
							
							counter = 0;
							for(Course c : cs.getAllCourses()) {
								if(counter == 0) {
									System.out.println("Available courses:");
									System.out.printf("%-10s %-30s %-30s %n", "ID", "Course", "Instructor");
									counter++;
								}
								//prints all courses available.
								System.out.printf("%-10d %-30s %-30s %n", c.getcId(), c.getcName(), c.getcInstructor());
							}
							System.out.println("Please enter a course Id to register a course.");
							Integer courseSelection = reader.nextInt();
							//loops through courses the student is taking
							Integer check = 0;
							for(Course c : ss.getStudentCourses(email)) {
								//tests to see if the course selected is already being taken.
								if(c.getcId() == courseSelection) {
									check++;
										System.out.println("You are already registered for that course!");
									}
							} 
							if(check == 0) {
								ss.registerStudentToCourse(email, courseSelection);
							
								counter = 0;
								for(Course c : ss.getStudentCourses(email)) {
									if(counter == 0) {
										System.out.println("Your updated course list");
										System.out.printf("%-10s %-30s %-30s %n", "ID", "Course", "Instructor");
										counter++;
									}
									System.out.printf("%-10d %-30s %-30s %n", c.getcId(), c.getcName(), c.getcInstructor());
								}
								System.out.println("Course registration successful, you have been signed out.");
							}
							
							break;
						case 2: 
							System.out.println("Going back to student login.");
							break;
						}
						
					} else {
						//if the email is not within the table will inform the user that email is incorrect.
						System.out.println("Sorry the password you have entered is incorrect, please try again.");
					}
				}else {
					//if the password does not match the email will inform the user.
					System.out.println("I'm sorry the email you entered is incorrect, please try again.");
				}
				
				break;
			case 2: 
				System.out.println("Goodbye!");
				break;
			}
		}
		
	}
		//main menu
	private static void menu1() {
		System.out.println("Please choose an option: ");
		System.out.println("1. Student Login");
		System.out.println("2. Quit Application");
	}
	//registry menu
	private static void registerMenu() {
		System.out.println("Please choose an option: ");
		System.out.println("1. Register a course");
		System.out.println("2. Logout");
	}
	
}