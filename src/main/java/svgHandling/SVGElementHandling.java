package svgHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://www.w3schools.com/html/html5_svg.asp");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		String color= driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
		 System.out.println("color of the svg element is "+color);
		 
		 String width= driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("stroke-width");
		 System.out.println("width of the svg element is "+width);
		 
		 String stroke= driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("stroke");
		 System.out.println("stroke of the svg element is "+stroke);
		 
		 String r= driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("r");
		 System.out.println("width of the svg element is "+r);
		 
		 
		 //getting svg test,for that make changes in local-name() vaue as===local-name()='text'
		 String txtofSVgELEment= driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text']")).getText();
		 System.out.println("Text oof the svg element is "+txtofSVgELEment);
	}

}
