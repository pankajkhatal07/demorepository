package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_index {
	
	/*syntax- 
	driver.findElement(By.xpath("(//tagname[@attributeName="attributrvalue"])[indexValue]")).click();
*/
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("(//div[@id=\"nav-xshop-container\"])[4]")).click();
	     
	
	}
	
}
