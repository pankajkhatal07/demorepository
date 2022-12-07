package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[@value=\"15\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()=\"Jan\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//option[text()=\"2018\"]")).click();
	}

}
