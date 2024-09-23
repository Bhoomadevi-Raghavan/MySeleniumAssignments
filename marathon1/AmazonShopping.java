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
        
        WebElement checkbox1 = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::i"));
        driver.executeScript("arguments[0].click()", checkbox1);
        
        WebElement checkbox2 = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//following::i)[2]"));
        driver.executeScript("arguments[0].click()", checkbox2);
        
     //   Actions actions1 = new Actions(driver);
    //    WebElement checkbox1 = driver.findElement(By.xpath("//li[@aria-label = 'Safari']//input"));
      //  actions1.moveToElement(checkbox1).click();
        
       // Actions actions2 = new Actions(driver);
       //WebElement checkbox = driver.findElement(By.xpath("//li[@aria-label = 'Skybags']//input"));
       //actions2.moveToElement(checkbox).click();
        
        //choose in the Sort dropdown Newest Arrivals
        driver.findElement(By.className("a-dropdown-label")).click();
        driver.findElement(By.linkText("Newest Arrivals")).click();
        
        //Click the first result
        driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']//img")).click();
        
        //Display of the first resulting bag
        
        String productTitle = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
        System.out.println("Product Name: "+productTitle);
        
        String price = driver.findElement(By.xpath("//span[@class='aok-offscreen']")).getText();
        System.out.println("Price: "+price);
        
       String title = driver.getTitle();
       System.out.println("Title odf Current page: " + title);
       
           
	}
}
