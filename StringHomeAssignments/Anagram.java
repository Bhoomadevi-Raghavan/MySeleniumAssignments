package StringHomeAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		int length1= str1.length();
		int length2 = str2.length();
		if(length1!=length2) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("The given strings are anagram");
		}
		else {
			System.out.println("The given strings are not Anagram");
		}
				
		}
		

	}

}
