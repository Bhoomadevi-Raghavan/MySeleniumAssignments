package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookFindYourAccountLink {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ttestuser@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tuna@321");
		driver.findElement(By.partialLinkText("Forgotten")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		
	}

}

