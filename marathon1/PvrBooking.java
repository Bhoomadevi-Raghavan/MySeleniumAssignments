package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrBooking {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(130));
		
		//Actions selecting cinema under quick book
		
		driver.findElement(By.xpath("//span[@class = 'cinemas-inactive']")).click();
		
	//Actions selecting movie,date,showtime
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall, OMR, Chennai')]")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//span[text()='THE GREATEST OF ALL TIME']")).click();
		driver.findElement(By.xpath("//span[text()='06:30 PM']")).click();
		driver.findElement(By.xpath("//button[@aria-label = 'Submit']//span")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//span[@id='CL.CLUB|M:14']")).click();
        
        //Print seat no, grand total in Book summary
        String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
        System.out.println("Seat No: "+seatNo);
        String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
        System.out.println("Grand Total: "+total);
        
        //Proceed
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        driver.findElement(By.xpath("//div[@class='cross-icon mx-2']//following::i")).click();
        
        //print page title
        String title = driver.getTitle();
        System.out.println("The page title: "+title);
        
	
	}

}
