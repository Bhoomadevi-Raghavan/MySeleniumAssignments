package extraexercises;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to reverse");
		String inputString = sc.nextLine();
		String outputString = reverse(inputString); 
		System.out.println("Input string: "+inputString);
		System.out.println("Output string: "+outputString);
	}
	
public static String reverse(String inputString) {
	String[] words = inputString.split("\\s");
	String outputString = "";
	for(int i=words.length-1;i>=0;i--) {
		outputString = outputString + words[i]+" ";
	}
	return outputString;
}
}
