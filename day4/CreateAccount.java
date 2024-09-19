package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select sc1 = new Select(industry);
		sc1.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sc2  = new Select(ownership);
		sc2.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sc3 = new Select(source);
		sc3.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select sc4 = new Select(marketingCampaign);
		sc4.selectByIndex(6);
		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sc5 = new Select(province);
		sc5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(accountName);
		if(accountName.contains("Automation Testing")) {			
			System.out.println("The Account Name displayed correctly");
		}else {
		System.out.println("The Account name is not correct");
		}	
		
	}
	

}
