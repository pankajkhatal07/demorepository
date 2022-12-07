package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        Thread.sleep(3000);
        // move from parent frame to iframe
        //1-by id value 
       // driver.switchTo().frame("iframeResult");
       // 2-by index
      //  driver.switchTo().frame(1);
        //3-by WebElement             4-by class name 
//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(size);
        WebElement element = driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]"));
        Thread.sleep(2000);
        driver.switchTo().frame(element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),\"Click me to display Date and Time.\")]")).click();
		
		// move from iframe to parent
        //1.default content
        
//        driver.switchTo().defaultContent();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a#tryhome")).click();
//        Thread.sleep(4000);
       
        //2.parent method
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.quit();
        

	}

}
