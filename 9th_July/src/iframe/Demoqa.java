package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
        driver.switchTo().frame("frame1");
       String FrameText =driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
        System.out.println(FrameText);
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
       // driver.findElement(By.xpath("//div[@class=\"element-group\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\"element-group\"][3]")).click();
        
        Thread.sleep(2000);
        driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
        driver.findElement(By.xpath("//img[@alt=\"adplus-dvertising\"]")).click();
       // driver.findElement(By.xpath("//span[contains(text(),\"Alerts\")]")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id=\"item-1\"]//span[contains(text(),\"Alerts\")]"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
//        List<WebElement>alertlist=driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li"));
//	    for(int i=0;i<alertlist.size();i++)
//	    {
//	    	System.out.println(alertlist.get(i).getText());
//	    } 
	   // driver.findElement(By.xpath(""))  
        
        
	}

}
