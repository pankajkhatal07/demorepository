package firstSelenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
		
        Point p1 =new Point(400, 500);
        
        driver.manage().window().setPosition(p1);
        
        Thread.sleep(1000);
        
        p1=driver.manage().window().getPosition();
        System.out.println(p1);
        

	}

}
