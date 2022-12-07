package ListBoxPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.trivago.in/");
	      
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("#input-auto-complete")).sendKeys("Shirdi");
	    Thread.sleep(3000);
//	    List<WebElement> element = driver.findElements(By.xpath("//ul[@role="listbox"]//li");
	  // List<WebElement> element= driver.findElements(By.cssSelector("#suggestion-list"));
	    
	    List<WebElement> element= driver.findElements(By.xpath("//div[@data-testid=\"search-suggestions\"]//div//ul//li"));
	    System.out.println(element.size());
	    Thread.sleep(2000);
	    for(int i=0;i<element.size();i++) 
	    {
	    	String place = element.get(i).getText();
	    	
	    	System.out.println(place);
	    	//element.get(i).click();
	    	
	    	if(element.get(i).getText().equals("Shirdi Sai Temple")) 
	    	{
	    		element.get(i).click();
	    		break;
	    	}
	    }
	    
	}

}
