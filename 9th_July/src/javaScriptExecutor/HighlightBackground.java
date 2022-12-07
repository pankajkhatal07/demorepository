package javaScriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HighlightBackground {

		static RemoteWebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
	         driver = new ChromeDriver();
	    //     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        //Thread.sleep(4000);
	        WebElement logo = driver.findElement(By.cssSelector("img.fb_logo._8ilh.img"));
	      //  Thread.sleep(2000);
	        WebElement logotext = driver.findElement(By.className("_8eso"));
	      //  Thread.sleep(2000);
	        WebElement loginbutton=driver.findElement(By.cssSelector("button[id^=\"u_0_\"]"));
	                                
	        highlightBorder(logo);
	        highlightBorder(logotext);
	        highlightBorder(loginbutton);
			

		}
		
		public static void highlightBorder(WebElement element) 
		      {
			     driver.executeScript("arguments[0].style.border='4px solid red'", element); //highlight border
			     driver.executeScript("arguments[0].style.background='yellow'", element);   // highlight background color
		      }

	}


