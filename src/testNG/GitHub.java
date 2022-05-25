package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GitHub {
	WebDriver driver;
	
  @Test
  public void gitHub() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","G:\\Lib\\geckodriver.exe");
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();

}
}