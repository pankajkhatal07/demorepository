package actionClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		WebElement src=driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		Actions act=new Actions(driver);
		act.contextClick(src).build().perform();
		
		List<WebElement>RightClickList = driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li"));
//          Iterator it=RightClickList.iterator();
//          while(it.hasNext())
//          {
//        	System.out.println(it.next());  
//          }
		int listsize=RightClickList.size();
		for(int i=0;i<listsize;i++) 
		{
			String text=RightClickList.get(i).getText();
			System.out.println(text);
			
			if(text.equals("Delete")) 
			{
				RightClickList.get(i).click();
			 break;
			 }
		
		
	}

	}
}
