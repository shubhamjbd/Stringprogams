package calenderpick;

import java.util.ArrayList;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DynamicSPICEjetPicker {
	
	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
	    ChromeOptions opt = new ChromeOptions();
	             opt.addArguments("--version");
				 WebDriver driver=new ChromeDriver(opt);
				 
				 driver.get("https://www.spicejet.com/");
				 
				 driver.manage().window().maximize();
				
				 
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]")).click();
				
				

 
 
String Expectedcityname="Coimbatore";
ArrayList <WebElement> list=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));

System.out.println("total stringnumber are"+list.size());
try{for(int i=1;i<=list.size()-1;i++)
{
	System.out.println(list.get(i).getText());

 
	
	if(list.get(i).getText().equals(Expectedcityname))
	{
		list.get(i).click();
		break;
		
	}
	
	
 

}

}
catch(Exception e)
{
	e.printStackTrace();
}

String actualtext = driver.findElement(By.xpath("(//input[@spellcheck='false'])[1]")).getText();
System.out.println("text afer selection of the city is "+actualtext);
Assert.assertEquals(Expectedcityname, actualtext,"text is not matchihng selected city is not same as expected");



}
	}


