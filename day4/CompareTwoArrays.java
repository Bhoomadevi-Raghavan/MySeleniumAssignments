package week1.day4;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int[] firstArray= {3,2,11,4,6,7};
		int[] secondArray= {1,2,8,4,9,7};
		compareTwoIntegerArrays(firstArray,secondArray);
			
	}
public static void compareTwoIntegerArrays(int firstArray[],int secondArray[]) {
	for(int i = 0; i<secondArray.length;i++) {
		for(int j=0;j<firstArray.length;j++) {
			if(secondArray[j]==firstArray[i]) {
				System.out.println(firstArray[i]);	
			}
		}
	}
	
}

}

