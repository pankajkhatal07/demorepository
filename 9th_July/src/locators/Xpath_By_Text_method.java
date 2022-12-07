package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Installer\\drivers\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[text()=\"Join virtual talks and more to celebrate diversity & allyship\"]")).click();
//	    Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("What are the different type of method for finding xpath");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		driver.quit();
		
		
	
		
		
		

	}

}
