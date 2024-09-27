package StringHomeAssignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "We learn Java basics as part of java sessions in java week1";
		//String lowerCaseStr = str.toLowerCase();
		String[] splitStr = str.split(" ");
		String temp = " ";
		int length = splitStr.length;
		int count = 0;
		for(int i=0; i<length; i++ ) {
			for(int j=i+1; j<length; j++) {
				if(splitStr[i].equalsIgnoreCase(splitStr[j])) {
					count = count+1;
					splitStr[j] = " ";
												
				}
				
				}
			}
		if(count>1) {
			for(int i = 0; i<length ;i++) {
				temp = temp + splitStr[i]+" ";	
				
			}
			System.out.println("The sentence after replacing duplicates with space: " +temp);
		}
			
		}
		

	}


