package calenderpick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderAttempt {

	public static void main(String[] args) throws InterruptedException {
 
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.redbus.com/");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 //button[text() ='Accept All']
boolean status = driver.findElement(By.xpath("//button[text() ='Accept All']")).isEnabled();
if(status==true)
{
	 driver.findElement(By.xpath("//button[text() ='Accept All']")).click();
}
else 
{
	 System.out.println("pop up is not visible");
}

driver.findElement(By.xpath(" //label[text()='Onward Date']")).click();


WebElement defaultmonthtitle = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//tr//td[@class='monthTitle'])[2]"));
System.out.println("default month is "+defaultmonthtitle.getText());

driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//td[@class='next'])[2]")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//td[@class='next'])[2]")).click();

WebElement requiredmonthtitle = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//tr//td[@class='monthTitle'])[2]"));

System.out.println("required month is after clicking next button "+requiredmonthtitle.getText());

String requiredMonthIs=" Jul 2022";

//for(int)


	}

}
