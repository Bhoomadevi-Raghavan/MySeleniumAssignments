package week1.day4;

import java.util.Scanner;

public class CheckPalindroneOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome:");
		int number = sc.nextInt();
		checkPalindrome(number);
			
	}
				
	public static void checkPalindrome(int number) {
	int temp = number,reverse =0;
	while(temp!=0) {
		reverse=(reverse*10)+(temp%10);
		temp=temp/10;
	}
		if(reverse==number) 
			{
				System.out.println("The number is a Palindrome");
			}
				else {System.out.println("The number is not a Palindrome");
		}
	
	
	
	
}
}
