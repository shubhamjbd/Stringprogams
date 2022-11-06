package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		

	     // ChromeOptions opt=new  ChromeOptions();
	    //  opt.addArguments("headless");
	      
			WebDriver driver=new ChromeDriver();//upcasting into   
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
			Thread.sleep(2000);
			driver.findElement(By.xpath(" //ul[@role='listbox']//li[4]")).click();
			
		 //ul[@role='listbox']//li[4]
 
	}

}
