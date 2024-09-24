package week3.day1;

public class BasePage {

	public static void main(String[] args) {
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();

	}
public void findElement() {
	System.out.println("Find the element by locators");
}
public void clickElement() {
	System.out.println("Click the element found");
}
public void enterText() {
	System.out.println("Eneter the text");

}
public void performCommonTasks() {
	System.out.println("Perform common tasks in Base page");

}
}
