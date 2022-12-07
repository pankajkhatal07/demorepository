import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();		
		   driver.get("http://www.amazon.in/");   
		   Thread.sleep(9000);
		  
		  // driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
		   driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
		   
		   Thread.sleep(6000);
		   driver.close();
		   driver.quit();
		   }
	
	

}
