package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			//WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 WebElement dropdown = driver.findElement(By.xpath("//button[@id='menu1']/span")) ;
		 dropdown.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.findElement(By.xpath("(//ul[@role='menu']/li/a[contains(text(),'HTML')])[1]")).click();
		 
	}

}
