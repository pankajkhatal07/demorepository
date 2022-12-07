package ListBoxPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trivagonew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.trivago.in/");
		
		// For Enter Destination
		
		driver.findElement(By.xpath("//input[@id=\"input-auto-complete\"]")).sendKeys("Shirdi");
		
		
		
	//	List<WebElement> fromlist = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		List<WebElement>fromlist = driver.findElements(By.xpath("//span[@data-testid=\"suggestion-title\"]"));
		
		System.out.println("From List Total Count :- "+fromlist.size());
		System.out.println("===========================================================");
		for(int i=0; i<fromlist.size(); i++) {
			
			fromlist.get(i).getText();
			System.out.println(fromlist.get(i).getText());		
			
			if(fromlist.get(i).getText().equals("Shirdi Sai Temple, Shirdi")) {
				//System.out.println(FromList.get(i).getText());
				fromlist.get(i).click();
				break;
			}
		}
		System.out.println();
		System.out.println("================================================================");
		
		// Quick date selection
		
		driver.findElement(By.xpath("(//input[contains(@type,\"radio\")])[4]")).click();
		
		driver.findElement(By.xpath("(//button[contains(@type,\"button\")])[40]")).click();
	
		driver.findElement(By.xpath("(//button[contains(@type,\"button\")])[62]")).click();
		
		driver.findElement(By.xpath("(//button[contains(@type,\"button\")])[15]")).click();
		
		// For Select Child Age
		
		WebElement ChildAge = driver.findElement(By.xpath("//select[@id=\"select-0\"]"));
		
		Select d = new Select(ChildAge);
		
		List<WebElement> CA = d.getOptions();
		
		System.out.println("Total Skills :- " +CA.size());
	
		System.out.println("================================================================");
		
		for(int i=0; i<CA.size(); i++) {
			
			String Agevalues = CA.get(i).getText();
			System.out.println(Agevalues);
			
			if(Agevalues.equals("7")) {
				CA.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("(//button[contains(@type,\"button\")])[17]")).click();
		
		driver.findElement(By.xpath("(//button[contains(@type,\"button\")])[19]")).click();
	}
}


