package extraexercises;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		System.out.println("The reversed string is:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}

	}

}
