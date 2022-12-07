package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Thread.sleep(3000);	
	//    driver.switchTo().alert().
	    
	    Actions action =new Actions(driver);
	    WebElement source=driver.findElement(By.cssSelector("#box3")) ;
	    WebElement dest=driver.findElement(By.cssSelector("#box103"));
	    Thread.sleep(6000);
	    action.dragAndDrop(source, dest).build().perform();
	
	
	
	      
	}

}
