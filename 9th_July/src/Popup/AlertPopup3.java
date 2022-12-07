package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"JavaScript Alerts\"]")).click();
		Thread.sleep(2000);
		WebElement JSprompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
		JSprompt.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		// for Accept
		alt.sendKeys("Pankaj Khatal");
	    Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		String response= driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Thread.sleep(2000);
		String Result ="You entered: Pankaj Khatal";
		if(Result.equals(response))
			System.out.println("Valid Response "+response);
		else
			System.out.println("Invalid Response");
		
		//for Dismiss
		
		JSprompt.click();
		alt.dismiss();
		Thread.sleep(2000);
		String response1= driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Thread.sleep(1000);
		String Result1 ="You entered: null";
		if(Result1.equals(response1))
			System.out.println("Valid Response "+response1);
		else
			System.out.println("Invalid Response");
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
