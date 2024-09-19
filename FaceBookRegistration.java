package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookRegistration {

	private static WebElement webElement;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("registration");
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.xpath("(//input[contains(@name,'email')])[2]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("newpassword");
		WebElement day = driver.findElement(By.id("day"));
		Select sc1=new Select(day);
		sc1.selectByValue("4");
		WebElement month = driver.findElement(By.id("month"));
		Select sc2 = new Select(month);
		sc2.selectByValue("8");
		WebElement year = driver.findElement(By.id("year"));
		Select sc3 = new Select(year);
		sc3.selectByVisibleText("2009");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}

}
