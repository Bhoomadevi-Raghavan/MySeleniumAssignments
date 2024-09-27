package StringHomeAssignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String str = "changeme";
		char[] arr = str.toCharArray();
		int length = arr.length;
		for(int i=length-1; i>=0; i--) {
			if((i%2)!=0) {
			char upperCase = Character.toUpperCase(arr[i]);
				arr[i]=upperCase;
			}
						
			}
		System.out.println("The given string: " +str);
		System.out.println("Odd index Uppercase: ");
		System.out.print(arr);
			}
		}

	


