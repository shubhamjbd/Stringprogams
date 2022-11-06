package crikbuzzz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzzz {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get(("https://www.cricbuzz.com/"));
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 
//		 String text = driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[1]/a/div/div/div[1]/div[1]")).getText();
//		 System.out.println("print "+text);
		 
		List<WebElement> multipleELements = driver.findElements(By.xpath(" //div[@id='hm-scag-mtch-blk']/ul/li"));
		int Size=multipleELements.size()-1;
		System.out.println("print total element "+Size);
		
		for(int i=0;i<=Size;i++)
		{
			String Totaltext = multipleELements.get(i).getText();
			System.out.print(Totaltext+" ");
		}
		
		//img[(@itemprop='image' and @title='Sangwan picks Patidar, breaks 99-run stand')]
	WebElement image=driver.findElement(By.xpath("( //img[(@itemprop='image' )])[2]"));
	String title = image.getAttribute("title");
	System.out.println("the title of the image is "+title);
	
	String width=image.getAttribute("width");
	String hieght=image.getAttribute("height");
	
	System.out.println("the height of the image is "+hieght);
	System.out.println("the width of imge is "+width);
	
	driver.findElement(By.xpath("(//div[@class='cb-ovr-flo'])[1]")).click();
	 Thread.sleep(1000);
		
	
	String cktBox = driver.findElement(By.xpath("(//div[starts-with(@class,'cb-col-')])[5]")).getText();
	System.out.println(cktBox+" ");
	
	driver.quit();
	
	
	}

}
