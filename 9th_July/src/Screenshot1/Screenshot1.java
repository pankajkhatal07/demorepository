package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");//https://kite.zerodha.com/
		//https://www.facebook.com/
		Thread.sleep(4000);
		
		//Convert web driver object to Take Screenshot & Call getScreenshotsAs method to create image file.
		/* type casting required because TakesScreenshot and Webdriver interface are two different interface.
		 * in above we create instanace of webdriver class so we cannot use this before typecasting.
		 * 
		 *   
		 *Explanatation 2-selenium, WebDriver interface does not extend TakesScreenshot interface.
		 * So if the type of driver variable is WebDriver interface you have to cast it. 
		 * WebDriver driver = new ChromeDriver() - there is only reference of type WebDriver for compiler. 
		 * Despite the fact that real class is ChromeDriver compiler doesn't know it. 
		 * So in this case in order to call getScreenshotAs method you have to cast driver to TakesScreenshot 
		 * (and it's safe as driver is instance of ChromeDriver which implements both WebDriver and 
		 * TakesScreenshot interfaces). 
		 *Only after that you can call getScreenshotAs method from TakesScreenshot interface.  
		 *
		 *Link-https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/TakesScreenshot.html
		 */
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screen shot capture
        
		//Move image file to new destination 
		File Dest = new File("C:\\Users\\panka\\OneDrive\\Desktop\\ScreenShot\\Facebook\\sample.jpg");
         
		// Copy file at destination
		 FileHandler.copy(Source,Dest);
		 
	
	}

}
