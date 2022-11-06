package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		

	     // ChromeOptions opt=new  ChromeOptions();
	    //  opt.addArguments("headless");
	      
			WebDriver driver=new ChromeDriver();//upcasting into   
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("honda");
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("((//ul[@role='listbox'])[1]//li/descendant::div[@class='eIPGRd'])[5]")).click();
			
			////ul[@role='listbox']//li
			//second method
			//((//ul[@role='listbox'])[1]//ul/li/div)[5]
					
				//	driver.findElement(By.xpath("((//ul[@role='listbox'])[1]//ul/li/div)[5]")).click();
			
			driver.findElement(By.xpath("//ul[@role='listbox']//li[6]")).click();
			
	}

}
