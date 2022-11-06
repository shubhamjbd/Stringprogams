package tryingCaptcha;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaHanding {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 SearchContext driver=new ChromeDriver();
		 
		 ((WebDriver) driver).get("https://udiseplus.gov.in/udiseplus-206/home");
		 
		 ((WebDriver) driver).manage().window().maximize();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("userId")).sendKeys("27190812301");
		 Thread.sleep(1000);
		 driver.findElement(By.id("password")).sendKeys("27190812301");
		 
		 String captchaText = driver.findElement(By.id("captchaImage")).getText();
		 System.out.println("captcha ext is "+captchaText);
	}

}
