package week1.day4;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number till which even numbers to be printed");
		int s = scanner.nextInt();
		EvenNumber even = new EvenNumber();
		even.evenNumber(s);
	}
public void evenNumber(int n) {
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
		
	}
}

