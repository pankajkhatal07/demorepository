package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		  Assignment 5

Navigate to the website https://the-internet.herokuapp.com/windows website.
1. Click on the "Click Here" button and print the New Window text and go back 
to the main page and print the "Opening a new window" text
		
		 * */
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/windows");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
	    Thread.sleep(2000);
	    Set <String>id=driver.getWindowHandles();
	                    Iterator<String> it=id.iterator();  
	                    String pw=it.next();
	                    String cw=it.next();
	                    
	    driver.switchTo().window(cw); 
	    Thread.sleep(2000);
	    String cwtext=driver.findElement(By.xpath("//h3[contains(text(),\"New Window\")]")).getText();
	                    
	    System.out.println(cwtext);
	    Thread.sleep(2000);
	    driver.switchTo().window(pw);
	    
	    String pwtext=driver.findElement(By.tagName("h3")).getText();
	    System.out.println(pwtext);

	}

}
