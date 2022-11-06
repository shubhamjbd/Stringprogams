package authenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Authenticationppup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 String expectedtext = "Congratulations! You must have the proper credentials";
		 	 
		 driver.get(" http://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		 driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//div[@id='content']//p[contains(text(),'Congratulations!')]")).getText();
	  
		/* if(text.contains(expectedtext))
		{
			System.out.println("authentication POP up handled successfully");
		}
		else
		{
			System.out.println("authentication pop up handling is failed");
		
		}  */
		
		Assert.assertEquals(text, expectedtext, "authentication pop up is failed");
	    Reporter.log("tc is passsed",true);
		 
	}

}
