package listHomeAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,10,6,8};
		List<Integer> arr = new ArrayList<Integer>();
		int length = array.length;
		for(int i = 0; i<length; i++) {
			arr.add(array[i]);
		}
		Collections.sort(arr);
		System.out.println("The list: "+arr);
		System.out.println("The missing Elements: ");
		int size = arr.size();
		for(int i=0; i<size; ++i) {
			if(i+1!=arr.get(i)) {
				System.out.println(i+1);
			}
			i++;
		}
	}

}
