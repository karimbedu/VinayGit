package log4J;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	WebDriver driver;
	
  @Test
  public void log4jmethod() throws InterruptedException {
	  Logger log= Logger.getLogger("Google Web");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Browser Launched");
		
		driver.manage().window().maximize();
		log.info("Browser Maximized");
		
		driver.get("https://www.google.com");
		log.info("Google URL entered and launched");
		
		driver.findElement(By.name("q")).sendKeys("Log4j Tutorial");
		log.info("Log4j Tutorial entered in google search field");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed in keyboard");
		
		Thread.sleep(3000);
		log.info("Wait for 3 seconds");
		
		driver.close();
		log.info("Browser closed");
  }
  

}
