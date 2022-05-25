package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Group_Test {
	WebDriver driver;

	@Test(groups={"smoke"})
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	
	@Test(groups={"Regression"})
	public void google() {
		driver.get("https://www.google.com");
		}
	
	@Test(groups={"sanity"})
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test(groups={"Regression"})
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(groups={"sanity"})
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@BeforeTest(groups={"Regression"})
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}



}
