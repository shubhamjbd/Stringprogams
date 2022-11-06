package practice;

import java.util.Iterator;
import java.util.Set;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MultipleTabWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");  //getting main page
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("newTabsWindowsBtn")).click();
			Thread.sleep(2000);
			
			String title=driver.getTitle();
			System.out.println("print title "+title);
			
			
		 
			Set<String> allWindowId=driver.getWindowHandles();
			Iterator<String> it=allWindowId.iterator();
			String mainpageID=it.next();
			String tab1=it.next();
			String tab2=it.next();
			
			driver.switchTo().window(tab2);
			String title2=driver.getTitle();
			System.out.println("print title "+title2);
			
	}

}
