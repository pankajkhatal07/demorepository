package firstSelenium;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_URL {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	String UR = "https://www.amazon.in/";
	
	Thread.sleep(9000);
	
	String URl=driver.getCurrentUrl();
	if(UR.equals(URl)) {
		System.out.println("URl is correct");
	}
	else {
		System.out.println("URL is not correct");
	}
	

	}

}
