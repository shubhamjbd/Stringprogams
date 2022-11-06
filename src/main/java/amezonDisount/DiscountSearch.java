package amezonDisount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiscountSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get(("https://www.amazon.in/s?k=trimmer&crid=1Q50BRBQ12BEQ&sprefix=trimmer%2Caps%2C380&ref=nb_sb_noss_1"));
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
//		 List<WebElement> list=driver.findElements(By.xpath("//span[@class='a-size-base s-color-discount']"));
//		int discounts = list.size();
//		System.out.println("size of the dicounts are"+discounts);
		
//		
//		for(int i=1;i<=list.size();i++)
//		{
//			System.out.print(list.get(i).getText());
//			//if(list.get(i).getText().equals(list))
//		}
		 
		 List<WebElement> list=driver.findElements(By.tagName("a"));
		 System.out.println("tottal links are"+list.size());
		  String str="-50%";
		 for(int i=1;i<=list.size()-1;i++)
		 {
			 System.out.print(list.get(i).getText());
			 
			 if(list.get(i).getText().contains(str))
			 {
				 list.get(i).click();
			 }
		 }
	}

}
