package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroungButton {

	public static void main(String[] args) {
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://leafground.com/button.xhtml");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.findElement(By.xpath("//span[text()='Click']")).click();
	       String title = driver.getTitle();
	       System.out.println("The page title is: "+title);
	       if(title.contains("Dashboard")) {
	    	   System.out.println("The page title is verified to be Dashboard");
	       }
	       else {
	    	   System.out.println("The title do not match");
	    	    }
	       
	       driver.navigate().back();
	       boolean disabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	       System.out.println("Disable: "+ disabled);
	       Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	       System.out.println("The location of the Submit button:"+location);
	       WebElement save = driver.findElement(By.xpath("(//div[@class='card']//following::button)[4]"));
	       String cssValue = save.getCssValue("background");
	       System.out.println("Background colour of the Save button: "+cssValue);
	       int height = driver.findElement(By.xpath("(//button[contains(@name,'idt88')])[5]")).getSize().getHeight();
	       System.out.println("The height of the Submit button: "+height);
	       int width = driver.findElement(By.xpath("(//div[@class='card']//button)[5]")).getSize().getWidth();
	       System.out.println("The width of the Submit button: "+width);
	       driver.close();
	       
	       
	       
	       
	       

	}

}
