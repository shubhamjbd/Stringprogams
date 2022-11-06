package calenderpick;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerRedbus {

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
	     
String month = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//tr//td[@class='monthTitle'])[2]")).getText();

 
 
 WebElement monthtitle = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//tr//td[@class='monthTitle'])[2]"));
	     
	     //(//table[@class='rb-monthTable first last']//tbody//tr//td[@class='monthTitle'])[2]
String monthttl=monthtitle.getText();
System.out.println("by defualt month title is "+monthttl);
String requiredmonth="Nov 2022";

	  
	   

// 
//	     	if(monthttl.equals(requiredmonth))
//	     		{
//	     		driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]//tbody//tr//td[contains(text(),'17')]")).click(); 
//	     		}
//	                  else
//	                       {
//	                	   driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//td[@class='next'])[2]")).click();
//	     	                 Thread.sleep(3000);
//	                       }
//	     	
	     
	for(int i=1;i<=6;i++)
	{
		 driver.findElement(By.xpath("(//table[@class='rb-monthTable first last']//tbody//td[@class='next'])[2]")).click();
		 
	}
	driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])[2]//tbody//tr//td[contains(text(),'17')]")).click();
	     	
	     	
	     	
	     	
	     	
	     	
//	     	List<WebElement> list2 = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody//tr//td"));
//
//	     	for(int i=1;i<=list2.size()-1;i++)
//	     	{
//	     		String text = list2.get(i).getText();
//	     		System.out.println(text+ " ");
//	     		
//	     		if(list2.get(i).getText().equals("5")) {
//	     			list2.get(i).click();
//	     			break;
//	     		}
	     
	     
	     
	    //                  for month selection 
	     
	     
	    
	  
/*List<WebElement> list = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody/tr/td[2]"));

for(int i=1;i<=list.size()-1;i++)
{
	String text = list.get(i).getText();
	System.out.println(text+ " ");
	
}

System.out.println("====================================");
List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody/tr[1]/td"));

for(int i=1;i<=list1.size()-1;i++)
{
	String text = list1.get(i).getText();
	System.out.println(text+ " ");
	
}
System.out.println("====================================");




/*
	
}*/

//System.out.println("================MONTH====================");
//
//List<WebElement> list3 = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody//tr//td[2]"));
//
//for(int i=0;i<=list3.size()-1;i++)
//{
//	String text = list3.get(i).getText();
//	System.out.println(text+ " ");
//	
//
//
//}
	
	}
}
