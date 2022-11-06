package calenderpick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clenderpick {

	public static void main(String[] args) {

		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 
			 driver.get("https://www.phptravels.net/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			 
			 driver.findElement(By.id("checkin")).click();
			 
			String month= "November 2023";
			String date="21";
			
			String defaultMonth=driver.findElement(By.xpath("(//div//tr)[1]")).getText();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			System.out.println("default month is "+defaultMonth);
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			for(int i=1;i<=6;i++)
			{
				driver.findElement(By.xpath("(//i[@class='icon mdi mdi-long-arrow-right'])[1]")).click();
			}
			
			driver.findElement(By.xpath("     (//div[@class='datepicker dropdown-menu'] //td)[27]")).click();                               
		    driver.findElement(By.id("checkin")).click();
			String desiremonth=driver.findElement(By.xpath("(//div//tr)[1]")).getText();
			System.out.println("desire month is "+desiremonth);
			 
	}

}
