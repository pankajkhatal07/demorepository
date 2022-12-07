package Screenshot1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeStamp2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//The class Date represents a specific instantin time, with millisecond precision.
		Date d =new Date();       // create object of date class
		//System.out.println(d);
		String filename=d.toString().replace(":", "_").replace(" ", "_");
		
		String s = "flipkart";
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//scrennshot captured
		File dest = new File("./Sceenshot1/"+s+filename+".png"); // destination path
		FileHandler.copy(source, dest);// screenshot stored at particular location
		
		
	}

}
