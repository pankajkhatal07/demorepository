package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Text_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Installer\\drivers\\chromedriver.exe\\");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.flipkart.com/");
			Thread.sleep(3000);
			
		//	driver.findElement(By.xpath("//button[contains(text(),\"✕\")]")).click();
			
			driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();// by text method
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();//by text method
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("1234567890");//by attribute
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("abcdefgh");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//span[text()=\"Forgot?\"]")).click();// by text method
			
			

	}

}
