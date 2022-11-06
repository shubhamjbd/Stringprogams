package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		
		int totalColumns=columns.size();
		System.out.println("total no of coloumns are "+totalColumns);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		int TotalnoOfRows=rows.size();
		System.out.println("total no of rows are "+TotalnoOfRows);
		
		
		String text;
		for (int i=1;i<=TotalnoOfRows;i++)
		{
			for(int j=1;j<=totalColumns;j++)
			{
				if(i==1)
				{
					 text=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+"||" );
				}
				
				else {
					 text=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+"||" );
					
				}
				
			}
			System.out.println();
			System.out.println("======================================");
		}
		
		 
	}

}
