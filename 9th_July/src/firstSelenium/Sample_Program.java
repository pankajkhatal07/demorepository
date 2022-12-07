package firstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Program {

	
		public static void main(String [] args) throws InterruptedException{
//			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
//	        WebDriver driver = new ChromeDriver();
	        
			   System.setProperty("webdriver.chrome.driver","C:\\Installer\\drivers\\chromedriver.exe\\");
			               WebDriver driver=new ChromeDriver();
						   
						   driver.get("https://www.amazon.in/");
						   
						   Thread.sleep(5000);
						   
						  String url= driver.getCurrentUrl();
						  
						  driver.manage().window().maximize();
						  
						  Thread.sleep(6000);
						  
						  driver.manage().window().minimize();
						  
						  Thread.sleep(2000);
						  
						  driver.manage().window().maximize();
						  
						  Thread.sleep(3000);
						  
						  driver.navigate().to("https://www.flipkart.com/");
						  Thread.sleep(5000);
						  
						  driver.navigate().back();
						  Thread.sleep(4000);
						  
						  driver.navigate().forward();
						  Thread.sleep(6000);
						  
						  driver.navigate().refresh();
						  Thread.sleep(5000);
						  
						  driver.quit();
						  
						  
			}

	}


