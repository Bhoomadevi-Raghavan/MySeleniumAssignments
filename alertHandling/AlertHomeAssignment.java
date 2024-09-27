package alertHandling;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHomeAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		promptAlert.sendKeys("Bhooma");
		promptAlert.dismiss();
		if(promptText.equalsIgnoreCase("Type your name and click OK")) {
			System.out.println("Equal");
		}
		else{
			
		System.out.println("Not equal");
		}

	}

}
