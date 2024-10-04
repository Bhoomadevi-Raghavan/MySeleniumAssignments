package homeassignmentwebtable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement table = driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody"));
        WebElement fromStation = table.findElement(By.id("txtStationFrom"));
        fromStation.click();
        fromStation.sendKeys("MAS");
        fromStation.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
        WebElement toStation = table.findElement(By.id("txtStationTo"));
        toStation.click();
        toStation.sendKeys("MDU");
        toStation.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
        table.findElement(By.id("chkSelectDateOnly")).click();
         WebElement trainTable = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody"));
        List<WebElement> row = trainTable.findElements(By.tagName("tr"));
        int sizeOfRow = row.size();
        System.out.println(sizeOfRow);
        List<WebElement> trainNames = trainTable.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
        int trainNamesSize = trainNames.size();
        List<String> listOfTrains = new ArrayList<String>();
        for(int i=0;i<trainNamesSize;i++) {
        	String namesOfTrains = trainNames.get(i).getText();
        	listOfTrains.add(namesOfTrains);
        	   	} 
        
        int listSize = listOfTrains.size();
        Collections.sort(listOfTrains);
        System.out.println("The Sorted Train Name list");
        System.out.println(listOfTrains);
        Set<String> removedupTrainnames = new HashSet<String>();
        //List<String> duplicates = new ArrayList<String>();
        for(int i=0;i<listSize;i++) {
        	for(int j=i+1;j<listSize;j++) {
        		if(listOfTrains.get(i).equals(listOfTrains.get(j))) {
        			removedupTrainnames.add(listOfTrains.get(i));
        		}
        	}
           	
       }
        System.out.println("The Duplicate train names:");
        System.out.println(removedupTrainnames);
        
        
    

	}

}
