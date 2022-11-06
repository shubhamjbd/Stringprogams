package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptionalXpath {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String tableText = driver.findElement(By.xpath("//*[@id=\"product\"]")).getText();
			System.out.println(tableText);
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
