package ListBoxPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo1 {
	/*
	 Assignment 1:

Automate the following scenarios:

Invoke Google Chrome Browser
Open URL: https://demo.automationtesting.in/Register.html
1. Print all the values form "Skills" drop-down and select APIs values from it
Close the browser.
2. Print all the values which are present in day, month and year drop down & Select Date Of Birth (8/06/1923) 
	  
	  
	 
	 * */
	
	

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		WebElement skill=driver.findElement(By.id("Skills"));
//		
//		   Select select1 = new Select(skill);
//		   
//		List<WebElement>skillList= select1.getOptions();
//		System.out.println(skillList.size());
//		
//		for(int i=0;i<skillList.size();i++) {
//			
//		System.out.println(skillList.get(i).getText());
//		
//		if (skillList.get(i).getText().equals("Java")) {
//			
//			skillList.get(i).click();
//			break;
//		}
//	}
		Dropdown(skill,"Java");
//	    WebElement year = driver.findElement(By.id("yearbox"));
//	    Dropdown(year,"1995");
//	    WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
//	    Dropdown(month,"July");
//	    WebElement day= driver.findElement(By.id("daybox"));
//	    Dropdown(day,"16");
// for optimize the above code or pass the soft coded value
	     String DOB ="16/July/1995";
	     String dobarr []=DOB.split("/");
	     WebElement year = driver.findElement(By.id("yearbox"));
	     Dropdown(year,dobarr[2]);
	     WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	     Dropdown(month,dobarr[1]);
	     WebElement day= driver.findElement(By.id("daybox"));
	     Dropdown(day,dobarr[0]);
	     
// for county there is no select class is available...
	     driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
	     List<WebElement>country=driver.findElements(By.xpath("//ul[@role=\"tree\"]//li"));
	     
               for(int i=0;i<country.size();i++) {
            	   System.out.print(country.get(i).getText()+" "); 
            	 
            	   if(country.get(i).getText().equals("India")) {
            		   country.get(i).click();
            	   }
            	   
               }	     
	    
	     
	    
	}
	public static void Dropdown(WebElement element,String value) {
		Select obj =new Select(element);
		List<WebElement>elementList=obj.getOptions();
		System.out.println(elementList.size());
		
		for(int i=0;i<elementList.size();i++) {
			if(elementList.get(i).getText().equals(value)) {
				elementList.get(i).click();
				break;
			}
		}
		
	}
	

}
