package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		WebElement dbc=driver.findElement(By.cssSelector("button[ondblclick=\"myFunction()\"]"));
		Actions dbclick= new Actions(driver);
		dbclick.doubleClick(dbc).build().perform();
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		String AlText=alt.getText();
		System.out.println(AlText);
		String expectedText="You double clicked me.. Thank You..";
		
		if(expectedText.equals(AlText)) 
		{
			driver.switchTo().alert().accept();
		}
		Thread.sleep(5000);
		driver.close();
	}

}
