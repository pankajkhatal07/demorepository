package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.cssSelector("a._1_3w1N"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(source).build().perform();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[contains(text(),\"My Profile\")]")).click();
		
	}

}
