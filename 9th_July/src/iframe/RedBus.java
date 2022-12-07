package iframe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.redbus.in/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href=\"/info/redcare\"]")).click();
        Thread.sleep(2000);
        Set<String>redbus1=driver.getWindowHandles();
        Iterator<String> it=redbus1.iterator();
        String pw=it.next();
        String cw=it.next();
        
        driver.switchTo().window(cw);
        Thread.sleep(2000);
        WebElement element =driver.findElement(By.cssSelector("iframe[class=\"modalIframe\"]"));//pop-up frame path
        Thread.sleep(2000);
        driver.switchTo().frame(element);   //move to pop-up frame
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#mobileNoInp")).sendKeys("1234567890");
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("div.recaptcha-checkbox-border")).click();
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        driver.findElement(By.cssSelector("i[class=\"icon-close\"]")).click();  //close the pop-up
    // 2nd window
        WebElement frame1=driver.findElement(By.cssSelector("iframe[src=\"//www.redbus.in/help?hideLayout=true\"]"));
	     driver.switchTo().frame(frame1);
	     driver.findElement(By.xpath("(//img[@src=\"https://st.redbus.in/Images/Selfhelp/group_3.svg\"])[1]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[contains(text(),\"Availability of buses\")]")).click();
	     
	     driver.switchTo().defaultContent();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector("#rYde")).click();
	     Thread.sleep(3000);
	     driver.close();
	     Thread.sleep(3000);
	     driver.switchTo().window(pw);
	     driver.findElement(By.cssSelector("#redRail")).click();
	     Thread.sleep(5000);
	     driver.close();
	}

}
