package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Selenium_LoginAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Makarand\\Desktop\\Eclipese\\FirefoxDriver\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.amazon.com");
      WebElement Login = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
            System.out.println(driver.getTitle());
      //System.out.println(driver.getPageSource());
     // .//a[@id="Nav-link-youraccount"]
      Actions Login1 = new Actions(driver);
      Login1.moveToElement( Login);
      driver.findElement(By.xpath(".//*[@id='nav-signin-tooltip']/a/span")).click();
      driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("pmakarand@gmail.com");
      driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("sagittarian");
      driver.findElement(By.xpath(".//*[@id='signInSubmit-input']")).click();
      
      		
	}

}
