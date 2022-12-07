package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://demo.automationtesting.in/Frames.html");
        Thread.sleep(2000);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        //Switch to frame 
        // by id
        //driver.switchTo().frame("singleframe");
        
        //by index
       // driver.switchTo().frame(0);
        
        //by webelement
        
        WebElement element = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
        driver.switchTo().frame(element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("pankaj");
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).click();
        Thread.sleep(2000);
//        driver.quit();
		
		

	}

}
