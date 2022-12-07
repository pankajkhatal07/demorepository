package actionClass;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://text-compare.com/");
		
	    WebElement src=driver.findElement(By.id("inputText1"));
		WebElement dest=driver.findElement(By.id("inputText2"));
		
		src.sendKeys("Good morning, this is Pankaj Khatal.");
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		
		//selecting all the element we can use ctrl+A
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("A");
		ac.keyUp(Keys.CONTROL);
		ac.build().perform();
		Thread.sleep(3000);
		
		//copying all the element
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("c");
		ac.keyUp(Keys.CONTROL);
		ac.build().perform();
		Thread.sleep(3000);
		//press Tab 
		ac.keyDown(Keys.TAB);
		ac.build().perform();
		Thread.sleep(3000);
		//paste the text
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("v");
		ac.keyUp(Keys.CONTROL);
		ac.build().perform();
		
		
		
		
	}

}
