package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get(("https://www.facebook.com/"));
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		 Thread.sleep(1000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
		 js.executeScript("arguments[0].value='abcd'", element);
		
		 
		 WebElement element2 = driver.findElement(By.name("websubmit"));
		 js.executeScript("arguments[0].click()", element2);
		
	}

}
