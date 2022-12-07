package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table1 = driver.findElement(By.xpath("//div[@class=\"w3-example\"][1]"));
		
        // WebElement table1 = driver.findElement(By.xpath("//div[@class=\"w3-example\"][1]//tr"));
		
		//find the table so we used javascriptExecutor 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",table1);
		
		//find the no of rows and column 
		//1 st way
//		 int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		 int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
//         System.out.println("The no. of rows "+row+"and the no. of column is "+col);
		 
         //2nd way
         List<WebElement> row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		 List<WebElement> col1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		 System.out.println("The no. of rows are "+row1.size()+" and the no. of column is "+col1.size());     
		   
	    /*retrive the specific value from the table
	     *for we have to mention row no. and column no. while finding the xpath.  
	     * */
		 driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]"));
		 
		 //print all the values from the table
		 
		 for(int i=2;i<=row1.size();i++) 
		 {
			for(int j=1;j<=col1.size();j++) 
			{
			   String cellvalue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			   System.out.print(cellvalue);
			   if(j<col1.size())
					System.out.print(" || ");
				
			} 
			System.out.println();
 		 }
		       
		       
		       
	}

}
