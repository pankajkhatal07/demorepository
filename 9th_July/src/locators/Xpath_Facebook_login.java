package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Installer\\drivers\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("pankajkhatal826@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("qwert");// enter the password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();// click on the eye button
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();//
		Thread.sleep(2000);
	
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]"));
		
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		
	    Thread.sleep(5000);
	    
	    driver.navigate().back();
	    Thread.sleep(8000);
	    
	    driver.quit();
	    
	    
		
		

	}

}
