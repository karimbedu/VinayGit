package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception  {		

		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("http://hyderabadreport.com/user");
		
		
		
		driver.findElement(By.partialLinkText("News")).click();
		
		
		/*
		 * driver.findElement(By.linkText("Photos")).click();
		 * 
		 * driver.findElement(By.linkText("Vishleshana")).click(); //linkText locator
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.id("edit-name")).sendKeys("vinay"); // id locator
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.name("pass")).sendKeys("Password@2022"); // name
		 * locator
		 * 
		 * Thread.sleep(2000);
		 * 
		 * // driver.findElement(By.className("form-submit")).click(); // className
		 * 
		 * driver.findElement(By.cssSelector("input.form-submit")).click();
		 * //cssSelector locator
		 */		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.get("https://www.google.com");
		 * 
		 * driver.findElement(By.name("q")).sendKeys("Hello Selenium");
		 * 
		 * driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 */
		
		
		
		
		
		
		
		
		
		
	/*	driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	*/
		
	}

}
