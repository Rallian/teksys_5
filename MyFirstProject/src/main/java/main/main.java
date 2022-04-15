package main;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
//		String name = "Travis";
//		int number = 120;
//		Integer num = 203;
//		System.out.print(num);
//		num = 205;
//		double radius;
//		double area;
//		radius = 20;
//		area = radius * radius * 3.14159;
//		System.out.println("The area is " + area);
		
		//takes user Input
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		//turns user Input into a variable
		String firstName = userInput.nextLine();
		//use the variable.
		System.out.println("My name is " + firstName);
		
		//close the scanner
		userInput.close();
	}

}
