package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		
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
         
//        ListBox(day,"22");
//        ListBox(month,"8");
//        ListBox(year,"2018");
        
        String DOB ="16/7/2023";
        String[] date=DOB.split("/");
        
        ListBox(day,date[0]);
        ListBox(month,date[1]);
        ListBox(year,date[2]);
        
        
        
	}
	
	public static void ListBox(WebElement element ,String value) {
		
		Select select1 = new Select(element);
		select1.selectByValue(value);
	}

}
