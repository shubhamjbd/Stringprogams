package javascriptExwcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTExtByJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			 
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement textbox = driver.findElement(By.id("autocomplete"));
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2 px solid red');", textbox);
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].value='shubham'",textbox);
			
			js.executeScript("arguments[0].setAttribute('style','background:white;border:2 px solid red');", textbox);
			
	}

}
