package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Description {
	WebDriver driver;

	@Test(priority=1,enabled=false,description="Zomato")
	public void testCase_001() {
		driver.get("https://www.zomato.com");
	}
	
	@Test(priority=2)
	public void google() {
		driver.get("https://www.google.com");
		}
	
	@Test(description="Twitter",enabled=false,priority=0)
	public void testCase_002() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(priority=3,enabled=true)
	public void testCase_003() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(enabled=false)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}



}
