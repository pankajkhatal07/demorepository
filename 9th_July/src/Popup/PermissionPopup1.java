package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         // permission popup is the browser popup / Web Push Notifications / 
		/*
		 step 1:  Create a instance of ChromeOptions class - ChromeOptions options = new ChromeOptions();
		 step 2: Add chrome switch to disable notification – “–disable-notifications”
		 Step 3 : Set path for the chrome driver
		 Step 4:Pass ChromeOptions instance to ChromeDriver Constructor
		 Stepb5:Give the navigation of the page in which we want to handle the notifications.
		 */
		
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(Option);
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		driver.get("https://www.hdfcbank.com/");
		
		
	}

}
