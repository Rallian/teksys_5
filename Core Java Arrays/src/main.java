import java.util.*;
public class main {

	public static void main(String[] args) {
		//1 
		int[] arr = {1, 2, 3};
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}

		//2
		int[] arr2 = {13, 5, 7, 68, 2};
		Integer middle = arr2.length / 2;
		System.out.println(arr2[middle]);
		
		//3
		String[] arr3 = {"red", "green", "blue", "yellow"};
		System.out.println(arr3.length);
		String[] newArr3 = arr3.clone();
		System.out.println(Arrays.toString(newArr3));
		
		//4
		int[] arr4 = {1, 2, 3, 4, 5};
		System.out.println(arr4[arr4.length - 5]);
		System.out.println(arr4[arr4.length - 1]);
//		System.out.println(arr4[arr4.length]);
//		arr4[5] = 6;
		
		//5
		int[] arr5 = new int[5];
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = i;
		}
//		//6
		int[] arr6 = new int[5];
		for(int i = 0; i < arr6.length; i++) {
			arr6[i] = i * 2;
	}
		
		//7
		int[] arr7 = {1, 2, 3, 4, 5};
		for(int i = 0; i < arr7.length; i++) {
			if(i != arr7.length / 2) {
				System.out.println(arr7[i]);
			}
		}
		
		//8
		String[] arr8 = {"red", "green", "blue", "yellow", "orange"};
		System.out.println(arr8[0]);
		String temp = arr8[0];
		arr8[0] = arr8[2];
		arr8[2] = temp;
		
		//9
		int[] arr9 = {4, 2, 9, 13, 1, 0};
		Arrays.sort(arr9);
		System.out.println(Arrays.toString(arr9));

		//10
		Object[] mixedArray = {"first String", "second String", "third String", 1.01, 1};
		System.out.println(Arrays.toString(mixedArray));
		
}
}