package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement element =driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		int row = driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr")).size();
		System.out.println(row);
		int col= driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr[1]/td")).size();
		 
		for(int i=1;i<=row;i++) 
	       {
	    	for(int j=1;j<=col;j++)
	    	{
	    		String cellvalue =  driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	    		System.out.print(cellvalue+"  ");
	    		if(j<col)
	    			System.out.print(" || ");
	    	}
	    	System.out.println();
	       }
		
	}

}
