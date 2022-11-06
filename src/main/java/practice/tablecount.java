package practice;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablecount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		
		//scrolling by scrol intoview
		WebElement scrollAtLocator = driver.findElement(By.xpath("//table[@id='product']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollAtLocator);
		//js.executeScript("arguments[0].scrollIntoView();",scrollAtLocator );
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
		List<WebElement> coloumnCount=driver.findElements(By.xpath("//table[@id='product']//th")); 
		
		
		System.out.println("total noumbr of columns are "+coloumnCount);
		  int TotalNumberOfColumn=coloumnCount.size();
		   System.out.println("total nuber of coloumn are "+TotalNumberOfColumn);
		
		//String allTable = driver.findElement(By.xpath("//table[@id='product']")).getText();
		//System.out.println("print all table "+allTable);
		   
		   
		   //total no.args of rows
		   List<WebElement> RowCount=driver.findElements(By.xpath(" //table[@id='product']//tbody//tr")); 
		   int rowcounts=RowCount.size();
		   System.out.println("total noumber of rows are"+rowcounts);
		   
		 //outer loop for rows
		   
		   String text; 
		   int j;
		    
		   for(int i=1;i<=rowcounts;i++)
		   {
			  
		
		  
		   for( j=1;j<=TotalNumberOfColumn;j++) //inner j loop for column
		   {
			   if(i==1)
			   {
		        text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//th["+j+"]")).getText();
		        
		       //                                "//table[@id='product']//tr["+i+"]//th["+j+"]"
		                                           //table[@id='product']//tr[1]//th[1] from webpage
		                                           //try this for column==((//table[@id='product'])//tbody//tr//th)[1]-->
		//                                                 fetches diffrent data
		        System.out.print(text+ " " );
		        
			   }
			   else
			   {
				   text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]//td["+j+"] ")).getText();
				  System.out.print(text+" "); 
				  
	//			                                    "//table[@id='product']//tr["+i+"]//td["+j+"]"
				  
				  //try this for row==(//table[@id='product']//tbody//tr)[1]-->fetches diffrent data
			   }
			 
		  
		   } 
		   System.out.println(); 
		   System.out.println("================================================================");
		   
			
		   }
		

	}

 
	}


