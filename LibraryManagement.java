package week1.day4;

public class LibraryManagement {

	public static void main(String[] args) {
		Library management = new Library();
		String bookAdded = management.addBook();
		System.out.println(bookAdded);
	    management.issueBook(bookAdded);
	}

}
