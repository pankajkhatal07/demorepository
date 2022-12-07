package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
	    //driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("flipkart");
         Thread.sleep(2000);
         
         Actions ac = new Actions(driver);
         ac.sendKeys(Keys.ENTER).build().perform();
         Thread.sleep(2000);
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(2000,3000)",""); //both horizantal and veritical move parallely.
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		 Thread.sleep(3000);
	     js.executeScript("document.documentElement.scrollTop=0", "");
	
	
	}

}
