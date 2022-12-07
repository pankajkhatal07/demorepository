package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable-media-stream");
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://whatmylocation.com/");
		driver.get("https://mictests.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"mic-launcher\"]")).click();

	}

}
