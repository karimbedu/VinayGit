package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "G:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.google.com");
		
		List<WebElement> googlelinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number Of Links on Google : "+googlelinks.size());
		
		
		
		
	/*		
		driver.get("http://hyderabadreport.com/user");		
		// Xpath

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("sravani");

		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Password");

		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		
		*/

	}

}
