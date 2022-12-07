package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotByMethod {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		Screenshot("facebook");	
		Screenshot("gmail");
		driver.quit();
	}
	
	public static void Screenshot(String Filename ) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String Filename = "Facebook";
		String  Random =RandomString.make(3);
		File Dest = new File("./Sceenshot1\\"+Filename+""+Random+".png"); 
		FileHandler.copy(source, Dest);
}
}