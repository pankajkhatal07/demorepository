package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.navigate().to("https://www.google.com/");
		        
		        Thread.sleep(5000);
		      
		        driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Indian National flag");
		        Thread.sleep(5000);
		        
		       // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		        
		        driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();
		        
		    

	}

}
