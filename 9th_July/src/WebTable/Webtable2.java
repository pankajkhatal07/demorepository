package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		int row =driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr[1]/td")).size();
	    
	    for(int i=1;i<=row;i++) 
	       {
	    	for(int j=1;j<=col;j++)
	    	{
	    		String cellvalue =  driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	    		System.out.print(cellvalue+" ");
	    		if(j<col)
	    			System.out.print(" || ");
	    	}
	    	System.out.println();
	       }
	
	}

}
