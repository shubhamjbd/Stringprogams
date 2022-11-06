package propertiyFileReading;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();//upcasting into   

	     // ChromeOptions opt=new  ChromeOptions();
	    //  opt.addArguments("headless");
	      String projectpath=System.getProperty("user.dir");
	      System.out.println("print"+projectpath );
	      
			Properties prop=new Properties();
			FileInputStream input=new FileInputStream(projectpath+"\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("URL")); 
			
//			driver.get(prop.getProperty("URL"));    //note: in propretyfile we should not write in double quote
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			driver.findElement(By.name("q")).sendKeys("java");
//			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//			driver.findElement(By.xpath(" (//div[@jscontroller='Dvn7fe']//ul//li)[10]")).click();
			                            
			 			 
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("emailID"));
			System.out.println(prop.getProperty("URL"));
			System.out.println(prop.getProperty("ID"));
			System.out.println(prop.getProperty("grade"));

	}

}
