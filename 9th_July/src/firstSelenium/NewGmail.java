package firstSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("gmail sign up",Keys.ENTER);
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//span[text()=\"gmail sign up\"]")).click();
        //Thread.sleep(000);
//        driver.findElement(By.xpath("//h3[text()=\"Create a Gmail account - Google Help\"]")).click();
//        Thread.sleep(4000);
     
        driver.findElement(By.xpath(" //a[@href=\"https://support.google.com/mail/answer/56256?hl=en\"]")).click();
           Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()=\"Create an account \"]")).click();
       
//        driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Pankaj");
//        Thread.sleep(2000);
      
//        driver.findElement(By.xpath("//div[@class=\"i9lrp mIZh1c\"]")).click();
//        Thread.sleep(2000);
      //  Thread.sleep(3000);
        Set<String>windowid=driver.getWindowHandles();
        Iterator <String>it=windowid.iterator();
        String parentwindow=it.next();
        String childwindow=it.next();
        driver.switchTo().window(childwindow) ;  
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("PANKAJ");
     //   Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("KHATAL");
     //   Thread.sleep(6000);
        driver.findElement(By.xpath("//button[@jsname=\"xqKM5b\"]")).click();
       // Thread.sleep(3000);
//        driver.findElement(By.xpath("//div[contains(text(),\"Username\")]")).sendKeys("pankajkhatal777");
//        Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[4]")).sendKeys("PK@MH10DL1172");
       //Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[5]")).sendKeys("PK@MH10DL1172");
//        
//        driver.findElement(By.xpath("//div[contains(text(),\"Confirm\")]")).sendKeys("123456789");
    //   Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@jsname=\"YPqjbf\"])[6]")).click();
	}

}
