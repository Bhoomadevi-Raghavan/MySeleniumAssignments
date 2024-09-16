package extraexercises;

import java.util.Scanner;

public class LearnClass {

	public static void main(String[] args) {
		//Addition
		System.out.println("Addition of two numbers \nEnter the first number:");
		Scanner scanner = new Scanner(System.in);
		int add1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int add2 = scanner.nextInt();
		int sum= add1+add2;
	    System.out.println("Sum= "+ sum);
    
	    //Subtraction
	    System.out.println("\nDifference");
	    System.out.println("Enter the first number:");
	    int diff1 = scanner.nextInt();
	    System.out.println("Enter the second number:");
	    int diff2 = scanner.nextInt();
	    int difference = diff1-diff2;
	    System.out.println("Difference: "+ difference);
	}

}
