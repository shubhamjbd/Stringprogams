package calenderpick;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.phptravels.net/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		 driver.findElement(By.name("checkin")).click();
		 
		 String desireMonth = "November 2022";
		 String desireDATE="24";
		 
	for(int i=1;i<=22;i++)
	{
		String months = driver.findElement(By.xpath("(//table[@class=' table-condensed']//th[@class='switch'])[1]")).getText();
		System.out.println(months);
		 
		 if(months.equals(desireMonth))
		 {
			  break;
		 }
		 driver.findElement(By.xpath(" (//i[@class='icon mdi mdi-long-arrow-right'])[1]")).click();

	}
	
	//driver.findElement(By.xpath(""))
	
ArrayList<WebElement> see=(ArrayList<WebElement>) driver.findElements(By.xpath(" //div[@class='datepicker dropdown-menu']//table//tbody//tr//td"));
 
	for(int i=1;i<=see.size()-1;i++)
	{
		System.out.println(see.get(i).getText());
		
		
		if(see.get(i).getText().equals(desireDATE))
		{
			see.get(i).click();
			break;
		}
		
		}
	//ArrayList <String> allid=(ArrayList<String>)driver.getWindowHandles();
}
 

 


 
	
		
	
	}


