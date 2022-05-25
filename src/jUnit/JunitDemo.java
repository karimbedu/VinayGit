package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

	static WebDriver driver;

	@Test
	void google() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Junit");
	}

	@Ignore // Junit 3 or Junit 4
	@Disabled // Junit 5
	@Test
	void search() {

		driver.get("https://www.zomato.com");

	}

	@Test
	void menus() {

		driver.get("https://www.zomato.com");

	}

	@Disabled
	@Test
	void facebook() throws InterruptedException {
		driver.get("https://www.facebook.com");

	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

}
