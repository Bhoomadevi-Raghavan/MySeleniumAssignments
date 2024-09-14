package week1.day4;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMissingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n-1;i++) {
			arr[i] = sc.nextInt();
			}
		Arrays.sort(arr); 
		int sum = (n*(n+1))/2;
		for(int i=0;i<n;i++) {
			sum=sum-arr[i];
		}
		System.out.println("The missing element is "+sum);
	}

}
