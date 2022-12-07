package multipleLink;

import java.io.IOException; 
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println(linkcount);
		int brokenlinks = 0;
		
		for(WebElement element :links) 
		{
//			System.out.println(element.getText());
//			System.out.println(element.getAttribute("href"));
			
			String url = element.getAttribute("href");
			if(url==null  || url.isEmpty())
			{
				System.out.println("Url is null or empty ");
				continue;
			}
			
			
			URL link = new URL(url); //creating object of URL class. or intiate the constructor of URL which accept as a string as a input. 
			HttpsURLConnection httpcode =(HttpsURLConnection) link.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) 
			   {
				System.out.println(httpcode.getResponseCode()+"----->"+url+" is----->Broken links");
				brokenlinks++;
			    continue;
			   }
			else
			{
				System.out.println(httpcode.getResponseCode()+"----->"+url+" is----->Valid links");
				continue;
			}
			
		}
		System.out.println("Number of broken links are"+brokenlinks);
		
		driver.quit();
		

	}

}
