package firstSelenium;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(1000);
        
        driver.navigate().to("https://www.flipkart.com/");
        
        Thread.sleep(1000);
        
        driver.navigate().back();//Amazon
        
        driver.navigate().forward();// flipkart
        Thread.sleep(1000);
        
        driver.navigate().refresh();// flipkart
        Thread.sleep(1000);
        
        driver.quit();

	}

}
