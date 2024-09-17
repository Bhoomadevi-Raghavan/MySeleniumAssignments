package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsByDirectLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.partialLinkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhooma");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaji");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Engineer");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
        if(title.equalsIgnoreCase("Software Engineer")) {
        	System.out.println("The Title displayed is correct" );
        }
        else {
        	System.out.println("The Title displayed is not correct");
        }
        
	}

}
