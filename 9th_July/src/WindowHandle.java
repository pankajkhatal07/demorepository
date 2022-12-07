import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
	    Thread.sleep(4000);
	    Set<String>windowlist=driver.getWindowHandles();
	    ArrayList Al = new ArrayList(windowlist);
	    
	   // driver.switchTo().window();
		driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("pankajkhatal826@gmail.com");
		
	}

}
