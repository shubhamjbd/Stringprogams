package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wishup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://app-dev.wishup.co");  //getting main page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("wishup_testuser2@gmail.com ");
		driver.findElement(By.name("password")).sendKeys("testpw3");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String errorText = driver.findElement(By.xpath(" //p[contains(text(),'email entered is not a valid email')]")).getText();
		System.out.println(errorText);
		
	//String passworderrormsg = driver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[1]/form/div[1]/p")).getText();
		//System.out.println("password error msg is "+passworderrormsg);
		
		 
		
		
//		
//		String expTExt="Please correct error in form email entered is not a valid email";
//		
//		if(errorText.equals(expTExt))
//		{
//			System.out.println("both te4xts are equal ");
//		}
//		else {
//			System.out.println("Text are not equal");
//		}
		
		
				 
	}

}
