package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    Thread.sleep(4000);
	   
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    WebElement element =driver.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]"));
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    element.click();
	    Thread.sleep(4000);
	 //   Set<String>windowlist=driver.getWindowHandles();
	  //  ArrayList Al = new ArrayList(windowlist);
	    
	    Set<String> windowid =driver.getWindowHandles();
	    
	    Iterator<String>it= windowid.iterator();
	     String parentWindow=it.next();
	     String childWindow=it.next();
	     String nestedchild=it.next();
	     Thread.sleep(3000);
	    driver.switchTo().window(nestedchild);
	    Thread.sleep(3000);
		WebElement fname =driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		 js.executeScript("arguments[0].scrollIntoView(true);", fname);
		fname.sendKeys("pankajkhatal");
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"newTabsBtn\"]")).click();
		
	}

}
