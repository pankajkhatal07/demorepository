package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwitterLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://twitter.com/i/flow/login?lang=en");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[text()=\"Sign up\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()=\"Sign up with phone or email\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@autocomplete=\"name\"]")).sendKeys("Pankaj");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"phone_number\"]")).sendKeys("9834753808");
        Thread.sleep(6000);
        WebElement month = driver.findElement(By.xpath("//select[@id=\"SELECTOR_1\"]"));
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.xpath("//select[@id=\"SELECTOR_2\"]"));
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.xpath("//select[@id=\"SELECTOR_3\"]"));
        Thread.sleep(3000);
        ListBox(month, "7");
        Thread.sleep(3000);
        ListBox(day,"16");
        Thread.sleep(3000);
        ListBox(year,"1995");
        Thread.sleep(3000);
        
        
	}
	public static void ListBox(WebElement element,String value) {
		
		Select select1 = new Select(element);
		       select1.selectByValue(value);
		
	}

}
