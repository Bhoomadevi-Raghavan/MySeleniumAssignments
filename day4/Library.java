package week1.day4;

public class Library {

	public static void main(String[] args) {
		String result = addBook();
		System.out.println(result);

issueBook("Harry Potter and the Sorcerer's Stone");
	}
public static String addBook(){
	System.out.println("Book Added Successfully");
	return("Harry Potter and the Sorcerer's Stone");
}
public static void issueBook(String issueBook){
	System.out.println("Book Issued Successfully");
	
}
}
