package gettingclour;

 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Colourfetching {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
			
			//WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.jenkins.i/o");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 WebElement downloadbutton = driver.findElement(By.xpath("(//a[contains(text(),'Download')])[2]"));
	System.out.println( downloadbutton.getTagName());
	
	System.out.println( downloadbutton.getText());
		
		 String rbgvalue = downloadbutton.getCssValue("background");
         System.out.println("RBG value is "+rbgvalue);
         String hexcode=Color.fromString(rbgvalue).asHex();
              
         System.out.println("hex valu for color is "+hexcode);
         
        // final Color HEX_COLOUR = Color.fromString("#2F7ED8");
        // System.out.println( HEX_COLOUR );
       
	}

}
