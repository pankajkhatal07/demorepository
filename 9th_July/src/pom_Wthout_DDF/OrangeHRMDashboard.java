package pom_Wthout_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMDashboard {

	
	@FindBy(css="[class=\"oxd-userdropdown-name\"]") private WebElement name;
	@FindBy(css="p.oxd-text.oxd-text--p.orangehrm-attendance-card-details")private WebElement punchtime;
	
	
	public OrangeHRMDashboard(WebDriver driver) 
		{
	   	PageFactory.initElements(driver, this);
	     }
	
	
	public void text() 
	   {
		 String Name= name.getText(); 
	     
		  if (Name.equals("ajay Chaudary")) 
		 {
			 System.out.println("Correct Name ");
		 }
		 
		 else 
		 {
			 System.out.println("Incorrect Name");
		 }
	   }
	
	public void time() {
		
		if(punchtime.isDisplayed())
			System.out.println("Punch time is diplayed. ");
		
		else
			System.out.println("Punch time is not diplayed.");
	}
	
}
