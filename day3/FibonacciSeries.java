package week1.day3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Fibonacci range:");
		int n = scanner.nextInt();
		FibonacciSeries range = new FibonacciSeries();
		range.fibonacci(n);
			
	}
public void fibonacci(int n) {
int i,a = 0,s=1,t;
System.out.println(a+"\n"+s);
for(i=2;i<n;i++)
{
	t=a+s;
	System.out.println(t);
	a=s;
	s=t;
		
	}

}
}
