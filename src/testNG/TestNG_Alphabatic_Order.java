package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Alphabatic_Order {
	WebDriver driver;

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com");
		}
	
	@Test
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	
	@Test
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test
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
