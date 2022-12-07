package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();	
	            driver.manage().window().maximize();
	            
	            driver.get("https://www.redbus.in/");
	            Thread.sleep(2000);
	            
	            driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Sangli");
		        //  driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys("Sangli");    
	            //  driver.findElement(By.xpath("//li[contains(text(),\"Sangli\")][1]")).click();
		     
	            driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Pune");
	            //input[@data-message="Please enter a destination city"]
		        //  driver.findElement(By.xpath("//li[contains(text(),\"Sangli\")][1]")).click();
		         
		       driver.findElement(By.xpath("//span[@class=\"fl icon-calendar_icon-new icon-onward-calendar icon\"]")).click();
		       driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		       Thread.sleep(2000);
		    
		      
		      //driver.findElement(By.xpath("//button[contains(text(),\"Search Buses\")]")).click();   

		       driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//li[@data-id=\"571\"]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//li[@data-id=\"130\"]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		      
		       
		       Thread.sleep(4000);
		       //driver.findElement(By.xpath("//div[@class=\"button\"]")).click();
		       driver.findElement(By.xpath("//div[@class=\"button view-seats fr\"]")).click();
	}

}
