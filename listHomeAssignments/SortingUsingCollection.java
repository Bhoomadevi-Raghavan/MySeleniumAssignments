package listHomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	private static int length;

	public static void main(String[] args) {
		String array[] = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> arr = new ArrayList<String>();
		List<String> rev = new ArrayList<String>();
		int length = array.length;
		for(int i=0; i<length; i++) {
			arr.add(array[i]);
		}
		System.out.println("The String List: "+arr);
		Collections.sort(arr);
		System.out.println("The list after sort: "+arr);
		int size = arr.size();
		for(int i=size-1; i>=0; i--) {
		  String string = arr.get(i);
		  rev.add(string);
			
		}
		System.out.println(rev);

	}

}
