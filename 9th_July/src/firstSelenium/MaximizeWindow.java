package firstSelenium;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
       
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        
        
       // driver.close();
        
		

	}

}
