package extraexercises;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check for palindrome");
		String inputString = sc.nextLine();
		String reverse = "";
		for (int i=inputString.length()-1;i>=0;i--) {
			reverse = reverse + inputString.charAt(i);
		}
if(inputString.equalsIgnoreCase(reverse))
{
System.out.println("The string is a Palindrome");
}
else {
System.out.println("The string is not a palindrome");	
}
	}
}

