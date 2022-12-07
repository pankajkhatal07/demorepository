package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"JavaScript Alerts\"]")).click();
		Thread.sleep(2000);
		WebElement ClickforJSConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
		// for accepting alert
		ClickforJSConfirm.click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		//Thread.sleep(2000);
		String response =driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		String expectedResult = "You clicked: Ok";
		if(response.equals(expectedResult))
			System.out.println("Response : "+response);
		else
			System.out.println("Invalid Response");
		
		//for dismiss the alert
		Thread.sleep(2000);
		ClickforJSConfirm.click();
		Thread.sleep(2000);
		alt.dismiss();
		String response1 =driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		String result="You clicked: Cancel";
		if(response1.equals(result))
			System.out.println("Response :"+response1);
		else
			System.out.println("Invalid Response");
		
		driver.quit();
	}

}
