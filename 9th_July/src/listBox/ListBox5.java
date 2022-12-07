package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {

	
		
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
	        driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		    driver.get("https://www.facebook.com/");
		      
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		    
		    Thread.sleep(3000);
		    
		    String day ="//select[@id=\"day\"]//option";
		    String Month = "//select[@id=\"month\"]//option";
		    String Year = "//select[@id=\"year\"]//option";
		    
		    String DOB ="13/May/1990";
		    String date[]=DOB.split("/");
		    
		    SlectDropdown(day, date[0]);
		    SlectDropdown(Month, date[1]);
		    SlectDropdown(Year, date[2]);

		
	}
		public static void SlectDropdown(String element, String Values) {
			
			List<WebElement>S1=driver.findElements(By.xpath(element));
			
			System.out.println(S1.size());
			
			for(int i=0;i<S1.size();i++) {
				
				System.out.println(S1.get(i).getText());
				
				if(S1.get(i).getText().equals(Values)) {
					S1.get(i).click();
				}
			}
		}
		

	

	}


