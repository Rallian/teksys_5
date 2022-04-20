import java.util.*;
public class main {

	public static void main(String[] args) {
		
		//1
		Integer x = 7;
		x = 15;
		if(x < 10) {
			System.out.println("less than 10");
		}
		
		//2
		Integer x1 = 7;
		x1 = 15;
		
		if(x1 < 10) {
			System.out.println("Less than 10");
		} else if(x > 10) {
			System.out.println("Greater than 10");
		}
		
		//3
		Integer x2 = 15;
		if(x2 < 10) {
			System.out.println("Less than 10");
		}else if(x2 > 10 && x2 < 20) {
			System.out.println("Between 10 and 20");
		} else if(x2 >= 20) {
			System.out.println("Greater than or equal to 20");
		}
		
		//4
		Integer x3 = 15;
		if(x3 < 10 || x3 > 20) {
			System.out.println("Out of range");
		} else System.out.println("In range");
		
		//5
		Scanner number = new Scanner(System.in);
		int grade = number.nextInt();
		if(grade < 60) {
			System.out.println("F");
		} else if(grade >=60 && grade < 70) {
			System.out.println("D");
		} else if(grade >= 70 && grade < 80) {
			System.out.println("C");
		}
		 else if(grade >= 80 && grade < 90) {
		System.out.println("B");
		} else System.out.println("A");
		
		//6
		Scanner number1 = new Scanner(System.in);
		int day = number1.nextInt();
		switch(day) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Monday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("Out of range");
		break;
		
		}
		
		
	}

}
