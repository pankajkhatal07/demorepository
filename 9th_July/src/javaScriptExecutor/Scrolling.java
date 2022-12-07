package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        driver = new ChromeDriver();
		//driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,5000)", ""); // down by 5000 pixel
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-3000)", ""); // up by -3000 pixel
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");  // end of page
		Thread.sleep(4000);
		js.executeScript("document.documentElement.scrollTop=0",""); // start of page
		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(3000,5000)", ""); // down by 5000 pixel
//		Thread.sleep(4000);
		
	}

}
