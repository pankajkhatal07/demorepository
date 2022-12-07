package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(3000);
	    
	   
	     driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    	    
	    Thread.sleep(3000);
	     WebElement day = driver.findElement(By.id("day"));
	     
	     WebElement Month = driver.findElement(By.id("month"));
	     
	     WebElement Year = driver.findElement(By.id("year"));

	     Select select = new Select(day);
	     
	     //Q- How will u get total no size
	     
	    List<WebElement> Listday = select.getOptions(); 
	    
	    // it will print all the option
	    
	    System.out.println("Total days :"+Listday.size());
	    
	    //Q2 - How will u print all the values
	    
	    for(int i=0 ;i<Listday.size();i++) {
	    	
	    	 String DayValues = Listday.get(i).getText();
	    	 
	    	// System.out.println(DayValues);
	    	
	   //Q - How will u select specific values from drop down.
	    	 if(DayValues.equals("16")) {
	    		 
	    		 Listday.get(i).click();
	   // break;
	    	 }
	    }
	    
	    System.out.println("===========================================================");
	    
	  Select select1 =new Select(Month);
	  
	 List<WebElement>Listmonth = select1.getOptions();
	
	 System.out.println("Total Month : "+Listmonth.size());
	 
	 System.out.println();
	 
	 for(int i=0;i<Listmonth.size();i++) {
		 
		  String Monthvalues = Listmonth.get(i).getText();
		  
   //  System.out.println(Monthvalues)
		  
		  if(Monthvalues.equals("July")) {
			  
			  Listmonth.get(i).click();
		  }
	 }
	 
	 
	 
	 
	 System.out.println("================================================================");
	    
	 Select select2 = new Select(Year);
	 List<WebElement>ListYear=select2.getOptions();
	 System.out.println("Total No. of year: "+ListYear.size());
	 for(int i =0;i<ListYear.size();i++) {
		 
              String YearValue=ListYear.get(i).getText();
             // System.out.println(YearValue);
              
              if(YearValue.equalsIgnoreCase("1995")) {
            	  ListYear.get(i).click();
              }
	 }
	 
	 
}
}


