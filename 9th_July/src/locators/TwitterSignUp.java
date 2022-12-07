package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwitterSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Sign up with phone or email\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Pankaj Khatal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"phone_number\"]")).sendKeys("9834753808");
		Thread.sleep(3000);
		
		WebElement Month =driver.findElement(By.id("SELECTOR_1"));
		WebElement Day =driver.findElement(By.id("SELECTOR_2"));
		WebElement Year =driver.findElement(By.id("SELECTOR_3"));
		Thread.sleep(3000);
		DropDown(Month,"July");
		Thread.sleep(3000);
		DropDown(Day,"16");
		Thread.sleep(3000);
		DropDown(Year,"1995");
		
	
		

	}
	
	   public static void DropDown(WebElement element,String value) throws InterruptedException {
		   Select select1 =new Select(element);
		   List<WebElement>List1=select1.getOptions();
		   System.out.println("Total no of element : "+List1.size());
		  // System.out.print("Element [ "+List1+" ]");
		   for(int i=0;i<List1.size();i++) {
			   String value1 = List1.get(i).getText();
			   if(value1.equalsIgnoreCase(value)) {
				  List1.get(i).click(); 
				   break;
			   } 
		   }
		   
	   }

}
