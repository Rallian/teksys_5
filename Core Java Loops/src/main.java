
public class main {

	public static void main(String[] args) {
		//1
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		//2
		int count = 0;
		while(count <= 100) {
			System.out.println(count);
			count += 10;
		}
		
		//3
		int count1 = 1;
		do {
			System.out.println(count1);
			count1++;
			}
		while(count1 <= 10);
		
		//4
		for(int i = 0; i<= 100; i++) {
			if(i % 5 == 0) {
				if(i >= 25 && i <= 75) {
					continue;
				} else { System.out.println(i);
			}
		}
	}
		
		//5
		for(int i = 0; i<= 100; i++) {
			if(i % 5 ==0) {
				if(i > 50) {
					break;
			}
				System.out.println(i);
			}
			
		}

		//6
		for(int i = 1; i <= 2; i++) {
			System.out.println("Week " + i +":");
			for(int j = 1; j<= 5; j++) {
				System.out.println("Day " + j);
			}
			
		}
		
		//7		
		int min = 10;
		int max = 200;
		int num1 = 0;
		int num2 = 0;
		
		for(int i = min; i <= max; i++) {
			num1 = i;
			num2 = 0;
			while(num1 != 0) {
				int rem = num1 % 10;
				num1 /= 10;
				num2 = num2 * 10 + rem;
			}
			if(i == num2) {
				System.out.println(i + " ");
			}
		}
		
		//8
		int c1 = 0;
		int c2 = 1;
		int c3;
		System.out.print(c1 + " " + c2);
		for(int i = 0; i < 50; i++) {
			c3 = c1 + c2;
			if(c3 > 50)break;
			System.out.print(" "+c3);
			c1=c2;
			c2=c3;
	}
		
		//9
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("Inner loop: i: "+i+",j: "+j);
			}
		}
		
		
	
			
		
		
}
}
