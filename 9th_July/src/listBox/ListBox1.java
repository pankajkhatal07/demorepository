package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]")).click();
        Thread.sleep(2000);
        
        WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
        WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
         // select by visible text
//               Select visible1 = new Select(day);
//               visible1.selectByVisibleText("15");
//               Thread.sleep(2000);
//               Select visible2 = new Select(month);
//               visible2.selectByVisibleText("Jan");
//               Thread.sleep(2000);
//               Select visible3 = new Select(year);
//               visible3.selectByVisibleText("2018");
               
               
         //Select by   index
               
//               Select ind1 = new Select(day);
//               ind1.selectByIndex(15);
//               Thread.sleep(4000);
//               Select ind2 = new Select(month);
//               ind2.selectByIndex(2);
//               Thread.sleep(4000);
//               Select ind3 = new Select(year);
//               ind3.selectByIndex(20);
//               
               
           //Select by value
               
               Select value1 = new Select(day);
               value1.selectByValue("15");
               Thread.sleep(4000);
               Select value2 = new Select(month);
               value2.selectByValue("3");
               Thread.sleep(4000);
               Select value3 = new Select(year);
               value3.selectByValue("2014");
        
        
        
        
        
        

	}

}
