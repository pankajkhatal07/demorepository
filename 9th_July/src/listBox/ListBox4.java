package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
		
		driver.findElement(By.id("src")).sendKeys("Sangli");  // identify the listbox
		Thread.sleep(4000);
		List<WebElement>SrcCity= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li")); // store the element present in the listbox
		System.out.println("Total no. of source city : "+SrcCity.size());
		for(int i=0;i<SrcCity.size();i++) {
//			SrcCity.get(i).getText();
//			System.out.println(SrcCity.get(i).getText());
			if (SrcCity.get(i).getText().equals("Tasgaon (Sangli)")) {
				System.out.println(SrcCity.get(i).getText());
				SrcCity.get(i).click();
				break;
			
			}
			
		}
		
		driver.findElement(By.id("dest")).sendKeys("Pune");
		Thread.sleep(5000);
		List<WebElement>DestCity = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	//	Thread.sleep(3000);
		System.out.println("Total no. of Destination City : "+DestCity.size());
		
		for(int i=0;i<DestCity.size();i++) {
			
			if (DestCity.get(i).getText().equals("Shivaji Nagar, Pune")) {
				System.out.println(DestCity.get(i).getText());
				DestCity.get(i).click();
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();  //Date Selection
		driver.findElement(By.xpath("//button[text()=\"Search Buses\"]")).click();
	
	}
	

}
