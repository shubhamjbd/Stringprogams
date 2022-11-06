package calenderpick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpick2ndmehod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.phptravels.net/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 
		 driver.findElement(By.id("checkin")).click();
		 
		String month= "November 2022";
		String date="21";
		
WebElement defaultMonth=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[1]/table/thead/tr[1]/th[3]"));
 
		
 
		
		
		//imp xpath= //div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),'21')]
		
		//for month absolutexpath=   //div[@class='datepicker dropdown-menu']/div/table/thead/tr/th[contains(text(),'November 2023')]
		
		//imp path to analyse for arrow button to change month== //div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]
while(true)
{	
	if(defaultMonth.getText().equals(month))
		{
			break;
		}
             else
                  {
	                 driver.findElement(By.xpath("  //div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
	                 Thread.sleep(3000);
                  }
	driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),'21')]")).click();
}



	}

}
