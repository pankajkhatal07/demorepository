package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://demo.automationtesting.in/Frames.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")]")).click();
        Thread.sleep(2000);
        //driver.switchTo().frame(0);
       WebElement OuterFrame= driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
        driver.switchTo().frame(OuterFrame);
        
        WebElement InnerFrame =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(InnerFrame);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
        
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[contains(text(),\"SwitchTo\")]")).click();
        
       
        
	}

}
