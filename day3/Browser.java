package week1.day3;

public class Browser {

	public static void main(String[] args) {
		Browser browser = new Browser();
		System.out.println(browser.launchBrowser("ie"));
		browser.loadUrl();
		}
	
	public String launchBrowser(String browserName) {
		
	System.out.println("Browser launched successfully");
	return browserName;
	};
	
		
	
	public void loadUrl() {
		System.out.println("Aapplication url loaded sucessfully");
		
	};
	
}
