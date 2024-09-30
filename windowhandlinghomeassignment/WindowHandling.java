package windowhandlinghomeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Merge Contacts")).click();
	driver.findElement(By.xpath("//table[@class='twoColumnForm']//following::a")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windowHandleFrom = new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandleFrom.get(1));
	driver.findElement(By.xpath("//a[@class='linktext']")).click();
	driver.switchTo().window(windowHandleFrom.get(0));
	driver.findElement(By.xpath("//table[@class='twoColumnForm']//following::a[2]")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> windowHandleTo = new ArrayList<String>(windowHandles2);
	driver.switchTo().window(windowHandleTo.get(1));
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	driver.switchTo().window(windowHandleFrom.get(0));
	driver.findElement(By.className("buttonDangerous")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	String title = driver.getTitle();
	System.out.println("The title of the page is: "+title);
	if(title.contains("View Contact")) {
		System.out.println("Page title verified");
	}
	
		
}
}
