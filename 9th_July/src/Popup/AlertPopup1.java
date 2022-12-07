package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"JavaScript Alerts\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		String Response = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Thread.sleep(2000);
		String ExpectedResponse="You successfully clicked an alert";
		if(Response.equals(ExpectedResponse))
           System.out.println("Valid Response");
		else
			System.out.println("Invalid Response");
		
		driver.quit();
	}

}
