package practice;

import org.testng.annotations.Test;
import java.time.Duration;

import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class crossbrowseTest {
@Parameters("browsername")
public void crossbrowser(String browsername)
{
	WebDriver driver = null;
	if (browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sir\\Desktop\\chromewebdriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	else if (browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sir\\Desktop\\geckodriver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
	}
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	driver.quit();
  
}
}
