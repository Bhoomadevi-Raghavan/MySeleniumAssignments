package extraexercises;

import java.util.Scanner;

public class ReverseAString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String str = sc.nextLine();
		//char[] arr = str.toCharArray();
		String reverse = "";
		for (int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
System.out.println("The reversed string is: "+reverse);
		
	}

}
