package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();  
			
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");  //getting main page
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("newWindowsBtn")).click();
			Thread.sleep(2000);
			
			
			
			Set<String> AllwindowsID=driver.getWindowHandles();    //====>getting IDs of child windows
			
			System.out.println("All windows IDs are "+AllwindowsID); //output in the form string array
			 
			//but there are number of IDs so to fetch individual IDS we uses ITERATION concept
			
			Iterator<String> IT=AllwindowsID.iterator();  //=====>pointing to -1 index memory//here Iterator is interface and iterator 
			                                                                                //is abstract method
			String MainPgeID=IT.next();
			String ChilPageID1=IT.next();
			String childPAgeID2=IT.next();
			
			TargetLocator abc = driver.switchTo();
			
			//System.out.println("child id pagege1 "+ChilPageID1);
			//System.out.println("child id pagege1 "+childPAgeID2);
			
			// driver.switchTo().window(ChilPageID1);
			// Thread.sleep(2000);
			//String textfromwindow = driver.findElement(By.xpath(ChilPageID1)).getText();
			//System.out.println("text is "+textfromwindow);
			 
			// String textis = driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
			// System.out.println("text is "+textis);
			// Thread.sleep(2000);

			// driver.switchTo().window(childPAgeID2);
			// driver.findElement(By.xpath("//input[@id='email']")).sendKeys(textis);
			
			abc.window(childPAgeID2);
			System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText());
			
			abc.window(ChilPageID1);
			System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText());
			
			abc.window(MainPgeID);
			System.out.println(driver.findElement(By.xpath("//h1[@itemprop='name']")).getText());
			
	         driver.quit();
	
			
			
			

	}

}
