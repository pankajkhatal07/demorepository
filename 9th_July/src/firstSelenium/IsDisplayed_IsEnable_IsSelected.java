package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_IsEnable_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        // isDisplayed 
        // for SearchBox
//        WebElement search=driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
//          System.out.println("Search Display Status : "+search.isDisplayed());
//          System.out.println("Search Enable Status : "+search.isEnabled());
//          
//        WebElement logo = driver.findElement(By.xpath("//div[@class=\"header-logo\"]"));
//          System.out.println("Logo Display Status : "+logo.isDisplayed());
//          System.out.println("Logo is Enable : "+logo.isEnabled());
//          
        // IsSelected for Male Radio Button
          driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
          Thread.sleep(2000);
//          WebElement MaleRadio= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
//          System.out.println("MaleRadio button select status : "+MaleRadio.isSelected());
//          Thread.sleep(4000);
//          MaleRadio.click();
//          System.out.println("MaleRadio button select status : "+MaleRadio.isSelected());
//          Thread.sleep(4000);
          
      //IsSelected method for newsletter  - This is used for the radio button,dropdown,check boxes
          WebElement Newsletter=driver.findElement(By.xpath("//input[@id=\"Newsletter\"]"));
          System.out.println("NewsLetter checkbox select status : "+Newsletter.isSelected());
          Thread.sleep(4000);
          Newsletter.click();
          System.out.println("NewsLetter checkbox select status : "+Newsletter.isSelected());
          Thread.sleep(2000);
          
          
          
          
          
          
          Thread.sleep(5000);
          driver.close();
        
        
	}

}
