package AutomationFramework;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverCommands {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Makarand\\Desktop\\Eclipese\\FirefoxDriver\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);
		
		 WebDriver driver = new FirefoxDriver(capabilities);
		String url = "https://www.google.com";
		 driver.get(url);
		 System.out.println(driver.getTitle());
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		driver.findElement(By.id("gs_htif0")).sendKeys("Test");;
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.className("hdtb-mitem hdtb-imb"));
		System.out.println(links.size());
		for(WebElement link : links)
		{
			link.click();
			System.out.println(link.getText());
		}
		
		/* driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[1]")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[3]/a")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);*/
		 
		
		 
		 //driver.close();
		 
	}

}
