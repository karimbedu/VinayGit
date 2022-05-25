package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_TimeOut {
	WebDriver driver;

	@Test
	public void google() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("techlearn.in");

	}
	
	@Test(timeOut=1000)
	public void googleSearch() {
		driver.get("http://www.seleniumlearn.com/java");
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("TestNG");
		


	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}



}
