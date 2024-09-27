package listHomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioPrintBags {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Get URL
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Search for bags
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		
		//Select Gender, category
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		WebElement fashion = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		driver.executeScript("arguments[0].click()", fashion);
		
		//Print total items
		String totalItems = driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
		System.out.println("Total items found: "+totalItems);
		
		//List the brands
		
		WebElement brandClick = driver.findElement(By.xpath("(//div[contains(@class,'facet-head')])[4]"));
		driver.executeScript("arguments[0].click()",brandClick); 
		List<String> brands = new ArrayList<String>();
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		int size = brandList.size();
		
		//Print the Brand list
		
		for(int i = 0; i<size ; i++) {
			String text = brandList.get(i).getText();
			brands.add(text);
		}
		System.out.println("List of brands in the page: "+brands);
		
		// Bag names
		
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		int size2 = bagNames.size();
		List<String> nameOfBags = new ArrayList<String>();
		for(int i=0;i<size2;i++) {
			String str = bagNames.get(i).getText();
			nameOfBags.add(str);
		}
		System.out.println("Name of Bags: "+nameOfBags);
			

	}

}
