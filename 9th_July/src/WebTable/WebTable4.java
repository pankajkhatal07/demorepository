package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement username =driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password =driver.findElement(By.xpath("//input[@name=\"password\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("document.getElementsByClassName(\"oxd-input oxd-input--active\").value='Admin'");
       
		js.executeScript("arguments[0].value='Admin'", username);
		js.executeScript("arguments[0].value='admin123'",password);
		
	}

}
