package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Indian cricket team ");
       // Thread.sleep(5000);
      // driver.findElement(By.xpath("(//input[contains(@class,\"gNO89b\")])[1]")).click();
        
       //driver.findElement(By.xpath("//input[contains(@name,\"btnK\")]")).click();
        driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();
	}

}
