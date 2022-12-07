package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(4000);
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(5);//
		/*creating random string by RandomString is class and make is method present in RandomString class.
		 1. Random String Class declaration
				  public class RandomString
		           extends Object
		           A provider of randomized String values.
           Fields 
				Modifier and Type	Field and Description
				static int	         DEFAULT_LENGTH
				                  The default length of a randomized String.
		 2. Make method declaration
				public static String make(int length)
				Creates a random String of the given length.
				Parameters:
				length - The length of the random String.
				Returns:
				A random String 
*/
		String File ="Kite";
		File Dest = new File("C:\\Users\\panka\\OneDrive\\Desktop\\ScreenShot\\Kite\\"+File+""+Random+".jpg");
            FileHandler.copy(Source, Dest);		
            driver.quit();
            
	}

}
