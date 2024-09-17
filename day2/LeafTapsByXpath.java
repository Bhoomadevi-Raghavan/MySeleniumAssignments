package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsByXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesmanager");
		driver.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhooma");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Balaji");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("architect");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.findElement(By.xpath("//span[@id='viewLead_generalProfTitle_sp']")).getText();
		if(title.equalsIgnoreCase("Software Engineer")) {
			System.out.println("The Title displayed is correct");
		}
		else {
			System.out.println("The Title displayed is not correct");
		}
	}

}
