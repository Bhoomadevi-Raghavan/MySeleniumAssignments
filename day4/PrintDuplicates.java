package week1.day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] givenNumbers = {2,5,7,7,5,9,2,3};
	   Arrays.sort(givenNumbers);
	   int l = givenNumbers.length;
	   findDups(givenNumbers,l);
	}
	   
	   static void findDups(int[] givenNumbers,int l) {
	   
		   
	   	   for(int i=0;i<l-1;i++) {
		   for(int j=i+1;j<l;j++) {
	   		   if(givenNumbers[i]==givenNumbers[j]) {
			   System.out.println(givenNumbers[i]);
		   }
			   
		   }
		   
	   }
	   
	   	   }	   			   
}

