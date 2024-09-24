package week3.day1;

public class LoginPage extends BasePage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}
	
	@Override
	public void performCommonTasks() {
		System.out.println("Perfom Tasks from login page");
		super.performCommonTasks();
		
	}	
	
	}
	
	
