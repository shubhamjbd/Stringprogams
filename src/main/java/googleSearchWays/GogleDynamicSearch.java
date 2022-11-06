package googleSearchWays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GogleDynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 
			 driver.get("https://www.google.com/");
			 String title=driver.getTitle();
			 System.out.println("title is "+title);
			 
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[(@name='q')]")).sendKeys("car");
			 Thread.sleep(1000);
 //driver.findElement(By.xpath(" //ul[@role='listbox']//li/descendant::div[@class='pcTkSc']//div//span[contains(text(),'Carryminati')]")).click();
			 
	 List<WebElement> MultipleWebELment = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
			 
			// int totalElelemnts = MultipleWebELment.size();
			 
			// System.out.println("total serach optios are "+totalElelemnts);  
			 
			 for(int i=0;i<= MultipleWebELment.size();i++)
			 {
				 System.out.println(MultipleWebELment.get(i).getText());
			  
			     if(MultipleWebELment.get(i).getText().contains("career"))
			         {
			    	             
			    	 MultipleWebELment.get(i).click();
			    	 break;
			         }
			 }
			 System.out.println("total elements is "+MultipleWebELment.size());
	}

}
