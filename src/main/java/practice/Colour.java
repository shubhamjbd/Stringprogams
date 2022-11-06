package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;
 

public class Colour {

	
  
	   public static void main(String[] args) 
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
	     
			 driver.navigate().to("https://www.jenkins.io/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     
	            
	            
	           
	            // identify text
	            WebElement t = driver.findElement(By.xpath("(//a[contains(text(),'Download')])[2]"));
	            //obtain color in rgba
	            String s = t.getCssValue("background");
	            // convert rgba to hex
	            String c = Color.fromString(s).asHex();
	            System.out.println("Color is :" + s);
	            System.out.println("Hex code for color:" + c);
	            driver.quit();
	         }
	      }
	 
