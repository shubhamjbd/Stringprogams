package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleTabHAndling {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");  //getting main page
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("newTabsBtn")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		   Set<String> AllTabId=driver.getWindowHandles();
		   System.out.println("tab ids "+AllTabId);
		   
		  // 
		   
		   Iterator<String> It= AllTabId.iterator();
		   
		  String tab1Id = It.next();
		  String tabid2=It.next();
		  String TabID3=It.next();
		  
		  driver.switchTo().window(tabid2);
		  driver.findElement(By.id("confirmBox"));
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
		  driver.switchTo().window(TabID3);
		  driver.findElement(By.id("firstName")).sendKeys("i m here");
		   
		   
		
		
	}

}
