package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProvider {
	WebDriver driver;
	String str;

	@org.testng.annotations.DataProvider(name = "datainput")
	public String[][] login() {
		return new String[][] { 
			{ "Validuser", "InValidPassword" }, 
			{ "vinay", "Selenium@2022" },	
			{ "ValidUsername@gmail.com", "ValidPassword" },		
			{ "InvalidUser", "InvalidPassword" } 
			};
	}

@Test (dataProvider="datainput")
  public void login(String uid, String upass) throws Exception {
      driver.get("http://hyderabadreport.com/user");
      driver.findElement(By.id("edit-name")).sendKeys(uid);
      driver.findElement(By.id("edit-pass")).sendKeys(upass);
      driver.findElement(By.id("edit-submit")).click();
      try{
          driver.findElement(By.linkText("Log out")).click(); 
          str="Pass";
         }
      catch(Exception e){
          str="Fail";
         }
}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
