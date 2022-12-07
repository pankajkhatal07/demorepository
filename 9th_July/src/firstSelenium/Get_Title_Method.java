package firstSelenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Method {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in/");
        String expected_result = " Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String title = driver.getTitle();
        System.out.println(title);
        
        
        Thread.sleep(9000);
        
        if(expected_result.equals(title)){
        	System.out.println("Title is correct.");
        }
        	else
        		{System.out.println("Title is incorrect ");
        		}
        		
        
        
        driver.close();
}
        


}

