package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

			/*
			  WAP- open chrome browser.
			       go to linkdinlogin page.
			       enter user name & password.
			       stay for 5 sec.
			       navigate to instagram.
			       go to longin
			       enter username and password.

			*/

			System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
			        WebDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
			        driver.get("https://www.linkedin.com/login "); 
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("pankaj");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
			        Thread.sleep(5000);   // Stay for 5 sec
			        driver.navigate().to("https://www.instagram.com/accounts/login/");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@aria-label=\"Phone number, username, or email\"]")).sendKeys("Pankaj");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("789456");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
			        Thread.sleep(2000);
	}

}
