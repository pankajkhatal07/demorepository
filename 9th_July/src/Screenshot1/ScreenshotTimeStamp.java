package Screenshot1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTimeStamp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// how to apply Time-Stamp 
		Calendar cal = Calendar.getInstance();

		Date time =cal.getTime();

		String timestamp = time.toString().replace(":","").replace(" ", "");
		


		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(4000);
        
        //How to take screenshot
        
     File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String s = "Kite";
     File Dest =new File("./Sceenshot1\\"+s+timestamp+".png");
		FileHandler.copy(Source, Dest);
	driver.quit();
  //Time-Stamp
		
		
	}

}
