package main;
import java.text.DecimalFormat;
public class main {
	public static void main(String[] args) {
		
		//Exorcize 1
		Integer number1 = 1;
		Integer number2 = 2;
		
		int answer = number1 + number2;
		
		System.out.println(answer);
		
		//Exorcize 2
		double radius = 1;
		double area = 2;
		
		double answer2 = radius + area;
		System.out.println(answer2);
		
		//Exorcize 3
		Integer number3 = 1;
		double number4 = 2;
		double answer3 = number3 + number4;
		System.out.println(answer3);
		//variable of the sum must be double.
		
		//Exorcize 4
		Integer number5;
		Integer number6;
		number5 = 1;
		number6 = 2;
		number6 = (int) 2.1;
		Integer answer4 = number6 / number5;
		System.out.println(answer4);
		//larger number has to be cast to int.
		
		//Exorcize 4
		double number7 = 1;
		double number8 = 2;
		int answer5 = (int) (number8 / number7);
		System.out.println(answer5);
		
		//Exorcize 5
		int x;
		int y;
		x = 5;
		y = 6;
		int q = y/x;
		System.out.println(q);
		double myDouble = y;
		myDouble = q;
		System.out.println(q);
		//q still prints as normal
		
		//Exorcize 6
		final double Pie = 3.14;
		double answer6 = Pie + Pie;
		System.out.println(answer6);
		
		//Exorcize 7
		final DecimalFormat df = new DecimalFormat("0.00");
		double coffee;
		double tea;
		double sandwitch;
		coffee = 2.00;
		tea = 1.50;
		sandwitch = 3.50;
		double subtotal;
		final double SALES_TAX = 1.10;
		
		double order1 = (coffee * 3) + (tea * 4) + (sandwitch * 2);
		subtotal=order1;
		double totalSale = subtotal * SALES_TAX;
		System.out.println("$" + df.format(totalSale));
		
}
}