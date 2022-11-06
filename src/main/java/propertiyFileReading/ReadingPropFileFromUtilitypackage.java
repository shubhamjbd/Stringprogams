package propertiyFileReading;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utiityPackage.UtilityClass;

////pending with ReadingPropFileFromUtilitypackag

public class ReadingPropFileFromUtilitypackage extends utiityPackage.UtilityClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting into  
		
		
		 propdata();
		driver.get( System.getProperty("URL"));    //note: in propretyfile we should not write in double quote
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

}
