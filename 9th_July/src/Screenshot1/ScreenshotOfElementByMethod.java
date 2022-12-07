package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotOfElementByMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement Screen1 =driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
		Thread.sleep(3000);
		ScreenshotOfElement(Screen1, "Header2");
		WebElement Screen2 = driver.findElement(By.xpath("//div[@class=\"_6luv _52jv\"]"));
		Thread.sleep(3000);
		ScreenshotOfElement(Screen2, "Login_Form");
		
		WebElement Screen3=driver.findElement(By.xpath("//div[@id=\"reg_pages_msg\"]"));
		Thread.sleep(3000);
		ScreenshotOfElement(Screen3,"Register");
		
		WebElement Screen4=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		Thread.sleep(3000);
		ScreenshotOfElement(Screen4,"Login_Tab");
		
	}
	
	
	public static void ScreenshotOfElement(WebElement a,String s) throws IOException {
		
		File Source=((TakesScreenshot)a).getScreenshotAs(OutputType.FILE);
		//String Random=RandomString.make(5);
		
		File Dest =new File("./Sceenshot1\\"+s+""+".png");

		
		FileHandler.copy(Source, Dest);
		
	}

}
