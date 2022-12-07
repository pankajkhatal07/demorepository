package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachiPoi {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://poi.apache.org/apidocs/dev/index.html?org/apache/poi/ss/usermodel/CellType.html");
        Thread.sleep(3000);
        
        WebElement Fframe= driver.findElement(By.xpath("//frame[@src=\"overview-frame.html\"]"));
		driver.switchTo().frame(Fframe);
		List<WebElement> packagelist=driver.findElements(By.xpath("//ul[@title=\"Packages\"]//li"));
		System.out.println("Total No. of package : "+packagelist.size());
		for(int i=0;i<packagelist.size();i++) 
		{
			System.out.println(packagelist.get(i).getText()); 
			if(packagelist.get(i).getText().equals("org.apache.poi.xssf.usermodel"))
			{
				packagelist.get(i).click();
			}
		}
		Thread.sleep(2000);
		System.out.println("2nd frame");
		driver.switchTo().defaultContent();
		WebElement Cframe= driver.findElement(By.xpath("//frame[@name=\"packageFrame\"]"));
		driver.switchTo().frame(Cframe);
		List<WebElement>classlist=driver.findElements(By.cssSelector("a[target=\"classFrame\"]"));
	    System.out.println("Total no. of interfaces,Classe,enum : "+ classlist.size());
	    for (int i=0;i<classlist.size();i++) 
	    {
	    	System.out.println(classlist.get(i).getText());
	    } 
		
		
		// third frame 
     
		//  WebElement F3=driver.findElement(By.cssSelector("frame[src=\"overview-summary.html\"]")); // by webElemeny by cssSelector
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame"); //By name
//		WebElement F3=driver.findElement(By.cssSelector("frame[name=\"classFrame\"]"));
//		driver.switchTo().frame(F3);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[contains(text(),\"Use\")])[1]")).click();
		
		
		
	}

}
