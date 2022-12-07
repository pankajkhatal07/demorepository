package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Difference_Between_Navigate_Get {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 
	         driver.get("https://www.amazon.in/");
	         Thread.sleep(2000);
	         driver.get("https://www.flipkart.com/");
	         Thread.sleep(2000);
	         driver.navigate().back();
	         Thread.sleep(2000);
	         
		
		  
		
	}

}
