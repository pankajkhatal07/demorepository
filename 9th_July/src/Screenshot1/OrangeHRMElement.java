package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OrangeHRMElement {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement page = driver.findElement(By.xpath("//div[@id=\"app\"]"));
        Orange(page,"Complete_page");
        Thread.sleep(2000);
        WebElement Ologo=driver.findElement(By.xpath("(//img[@alt=\"orangehrm-logo\"])[2]"));
		Orange(Ologo,"logo");
		Thread.sleep(2000);
		WebElement login =driver.findElement(By.xpath("//div[@class=\"orangehrm-login-form\"]"));
		Orange(login,"Loginform");
		Thread.sleep(2000);
		WebElement loginbrand =driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]"));
		Orange(loginbrand,"Brand");
		Thread.sleep(2000);
		WebElement logindata=driver.findElement(By.xpath("//div[@class=\"orangehrm-login-error\"]"));
		Orange(logindata,"login_Credential");
		Thread.sleep(2000);
		WebElement footer=driver.findElement(By.xpath("//div[@class=\"orangehrm-login-footer-sm\"]"));
		 Orange(footer,"FooterText");
          
	}
	
	public static void Orange(WebElement element,String name) throws IOException 
	{
		
		File source=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot\\OrangeHRM\\"+name+""+".png");
		FileHandler.copy(source, dest);
	
		
	}

}
