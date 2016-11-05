package AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_CountOfLinksEbay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.amazon.com");
		// Count of links in the page
		System.out.println("Links in the page:");
		System.out.println(Driver.findElements(By.tagName("a")).size());
		WebElement Footer = Driver.findElement(By.xpath(".//*[@id='navFooter']"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
	}

}
