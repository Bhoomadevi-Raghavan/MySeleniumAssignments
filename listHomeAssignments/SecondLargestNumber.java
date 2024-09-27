package listHomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
	List<Integer> array1 = new ArrayList<Integer>();
	array1.add(3);
	array1.add(2);
	array1.add(11);
	array1.add(4);
	array1.add(6);
	array1.add(7);
	System.out.println("The array list: "+array1);
	
	Collections.sort(array1);
	
	System.out.println("The sorted array: "+array1);
	int size = array1.size();
	System.out.println("The second larget number: "+array1.get(size-2));

	}

}
