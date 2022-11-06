package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v97.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get(("https://www.facebook.com/"));
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		 Thread.sleep(5000);
		//
		 Actions act=new Actions(driver);
		 act.click(element1). build().perform();
		 
		//WebElement elementName=driver.findElement(By.xpath("//input[@name='firstname']"));
		act.keyDown(Keys.SHIFT).sendKeys("shubham").build().perform(); 
 
	}

}
