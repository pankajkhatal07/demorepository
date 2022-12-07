package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       
		    driver.navigate().to("https://app.hubspot.com/");   
		    Thread.sleep(4000);
		    driver.findElement(By.cssSelector("#username")).sendKeys("abcdef@gmail.com");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#loginBtn")).click();
		
		

	}

}
