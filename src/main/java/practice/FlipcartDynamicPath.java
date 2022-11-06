package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.utility.RandomString;

; 

public class FlipcartDynamicPath {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.flipkart.com/");
		
		//taking screenshot
	//	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	System.out.println("source");
		//String str=RandomString.make(2);
	//	File dest=new File("C:\\selenium screenshot\\hidden division"+str+".png");
		//FileHandler.copy(source, dest);
		
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	 	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// for hidden division popup
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("i phone 13 pro max");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13");
	 
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 Thread.sleep(4000);
		
		//button[@type='submit']
		
		//String rating = driver.findElement(By.xpath("(//div[@class='col col-7-12']//span//span  //span)[4]")).getText();
		//System.out.println("rating is"+rating);
		
		//div[@class='col col-7-12']//span//span  //span)[4]
		
		//div[@Class='col col-7-12']//div//span//div[1]
		
		// String rating = driver.findElement(By.xpath("//div[@Class='col col-7-12']//div//span//div[1]")).getText();
		// System.out.println("print "+rating);// yes working
		 
		 //now test 2 selecting the x path at just before line ie using immediate child path by using single forward salsh
		//div[@Class='col col-7-12']//div/span[1]
		// String rating = driver.findElement(By.xpath("//div[@Class='col col-7-12']//div/span[1]")).getText();
		// System.out.println("print rating "+rating);
		 
		 String rating = driver.findElement(By.xpath("//div[@Class='col col-7-12'][1]")).getText();
		 System.out.println("print rating "+rating);
		 //yeeeeee its working whole box tex is obtained 
		 

			//file path is given and stored file in reference  variable
		 System.out.println("=============================================================");
			
			FileInputStream MyFile= new FileInputStream("D:\\excelData\\flipcartData.xlsx");
			
			String value=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
			System.out.println("data from excelsheet is "+value);
			
	
		 
	}

}
