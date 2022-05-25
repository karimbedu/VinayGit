package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DependancyTestMethod {
	WebDriver driver;

	@Test(dependsOnMethods = { "method2" })
	public void method1() {
		driver.findElement(By.name("q")).sendKeys("seleniumlearn.com");
		System.out.println("This is method 1");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test
	public void method2() throws Exception {
		driver.get("http://www.google.com");
		System.out.println("This is method 2");
		Thread.sleep(3000);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
