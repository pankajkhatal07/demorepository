package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
		driver.findElement(By.xpath("//input[@type=\"text\"]")).click();

	}

}
