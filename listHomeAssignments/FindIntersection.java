package listHomeAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		System.out.println("The first array list: "+array1);
		
		List<Integer> array2 = new ArrayList<>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		System.out.println("The second array list: "+array2);
		
		array2.retainAll(array1);
		System.out.println("The values present in both list: "+array2);
					
		}
		}


