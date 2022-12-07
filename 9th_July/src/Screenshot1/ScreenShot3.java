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
/*
 WAP to take a screenshot of the particular element on webpage*/
public class ScreenShot3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
//Step 1 - Find the element on the webpage and store the element in one variable.
		
		WebElement Screen =driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
//Step 2 - use method of taking screenshot and store in source variable		
		File Source=((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);//we take screen as a variable because we want to take screenshot of element on webpage. when we want to take complete browser screenshot then we use the driver variable.  
//Step 3- Create a string to give name to file
		String Filename= "Facebook";
//Step 4- Create a Random string by using Ran		
		String Random =RandomString.make(7);
		
		
		//File Dest = new File("C:\\Users\\panka\\eclipse-workspace\\9th_July\\Screenshot\\"+Filename+""+Random+".jpg");
		File Dest = new File("./Sceenshot1\\"+Filename+""+Random+""+".jpg");
		FileHandler.copy(Source, Dest);
		driver.quit();
	}
	/*
	 To create new folder & to store your screenshot inside the folder and also change screenshot file name.

1. Right click on project
2. New
3. Select folder
4. Write name of folder
5. Finish
6. Check folder generate in project structure
7. Right click on created folder
8. Click on properties
9. See location give path and copy that path
10.To set the path of that created folder so we have to create object of File 11.Then to check file is then to right click on project
12.Select properties
13.See location arrow
14.Click on that arrow
15.Create screenshot folder click on that we have seen your screenshot file 16.Another way to create folder on desktop and copy path in the object create of file argument.
	 
	 */
}
