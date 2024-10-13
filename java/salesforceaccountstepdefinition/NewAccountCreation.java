package salesforceaccountstepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountCreation {
	public ChromeDriver driver;

	@Given("Launch the Chrome browser")
	public void launch_the_chrome_browser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		
	   
	}

	@Given("Load the Salesforce URL")
	public void load_the_salesforce_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Enter a valid Username")
	public void enter_a_valid_username() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	}

	@When("Enter a Password")
	public void enter_a_password() {
		driver.findElement(By.id("password")).sendKeys("August@2024");
	}

	@When("Click on the Log In button")
	public void click_on_the_log_in_button() {
		driver.findElement(By.id("Login")).click();
	}

	
	@When("Click on the ToggleMenu on the left corner")
	public void click_on_the_toggle_menu_on_the_left_corner() throws InterruptedException {
		Thread.sleep(2000);
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		driver.executeScript("arguments[0].click()",toggle);
	}

	@When("Click on the View All link")
	public void click_on_the_view_all_link() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	}

	@When("Click on the Sales link on App launcher")
	public void click_on_the_sales_link_on_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() {
		WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()",accountsTab);
	}

	@When("Click on the New button")
	public void click_on_the_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter a valid Account Name")
	public void enter_a_valid_account_name() {
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("CucumberTest");
	}

	@When("Select public under Ownership dropdown")
	public void select_public_under_ownership_dropdown() {
		WebElement ownership = driver.findElement(By.xpath("//label[text()='Ownership']"));
		Actions act = new Actions(driver);
		act.moveToElement(ownership).build().perform();
		act.click(ownership).perform();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click on Save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Verify Account Name")
	public void verify_account_name() {
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
	    if(text.equalsIgnoreCase("CucumberTest")) {
	    	System.out.println("Account created successfully: "+text);	
	    }else {
	    	System.out.println("Account not created");
	    }

}
}