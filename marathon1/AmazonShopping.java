package marathon1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonShopping {

	public static void main(String[] args) {
		//Launch chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Search for "Bags for Boys"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
        driver.findElement(By.id("nav-search-submit-button")).click();
        
              
        //Print Total number of results
        String searchResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        System.out.println("Result: " + searchResult);
                  
        //Select the first 2 brands displayed in the left menu
        
        WebElement checkbox1 = driver.findElement(By.xpath("//li[@aria-label = 'Safari']//input"));
        driver.executeScript("arguments[0].click()", checkbox1);
        
        WebElement checkbox2 = driver.findElement(By.xpath("//li[@aria-label = 'Skybags']//input"));
        driver.executeScript("arguments[0].click()", checkbox2);
        
     //   Actions actions1 = new Actions(driver);
    //    WebElement checkbox1 = driver.findElement(By.xpath("//li[@aria-label = 'Safari']//input"));
      //  actions1.moveToElement(checkbox1).click();
        
      //  Actions actions2 = new Actions(driver);
      //  WebElement checkbox2 = driver.findElement(By.xpath("//li[@aria-label = 'Skybags']//input"));
      //  actions2.moveToElement(checkbox2).click();
        
        //choose in the Sort dropdown Newest Arrivals
        driver.findElement(By.className("a-dropdown-label")).click();
        driver.findElement(By.linkText("Newest Arrivals")).click();
        
        //Display of the first resulting bag
        String firstResultDisplay = driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini s-line-clamp-1')]//span)[1]")).getText();
        System.out.println("The first dispalyed bag details: "+firstResultDisplay);
        
        String firstResultDisplay2 = driver.findElement(By.xpath("(//h2[contains(@class,'a-spacing-none')]//span)[1]")).getText();
        System.out.println(firstResultDisplay2);
        
        String mrp = driver.findElement(By.xpath("")).getText();
        System.out.println("MRP: "+ mrp);
        
        
       String title = driver.getTitle();
       System.out.println("Title odf Current page: " + title);
       
           
	}
}
