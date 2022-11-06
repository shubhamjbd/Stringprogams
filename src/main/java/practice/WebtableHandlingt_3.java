package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandlingt_3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.unionbankofindia.co.in/english/interestrates-loansadvances.aspx");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@Class='inner-page-table']//tbody//tr"));
		int TotalRows=rows.size();
		System.out.println("total rows are "+TotalRows);
		
	 for(int i=1;i<=TotalRows; i++)
		{
			String text = driver.findElement(By.xpath("(//table[@Class='inner-page-table']//tbody//tr)["+i+"]" )).getText();  
			
			System.out.println(text+ " ");
		}
	 
	 String str = null;
	 for(int j=1;j<=13;j++)
	 {
		  str=driver.findElement(By.xpath("(//div[@class='right-first top-margin-none']//ul//ul//li)["+j+"]")).getText();   
	 }
	 
	 int[] info=new int[str.length()];
	 
	 //target making anma rray of acrualand expexcted and compare both for testing perpose
	}

}
