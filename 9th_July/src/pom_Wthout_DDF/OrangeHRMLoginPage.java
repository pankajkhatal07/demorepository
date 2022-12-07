package pom_Wthout_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	
	/* declaration -find out the elements present on the page.
	 *              data member are private and globally declared.
	 *              
	 *  @findBy- An annotation used in page factory to locate and declare webelements using 
            different locators 
	
	*/
	
	//1. Data member/variables should be declared globally with access level private by using @findby annotations.
	
	//@FindBy(xpath = "//input[@name=\"username\"]")private WebElement username;
	@FindBy(css ="[name=\"username\"]") private WebElement username;
	@FindBy(css = "[type=\"password\"]")private WebElement password;
	@FindBy(css="[type=\"submit\"]")private WebElement loginbutton;
	
	
	
	 // 2. Initialize within a constructor with access level public using pagefactory 
	
	public OrangeHRMLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
    //3. Utilize within a method with access level public
        public void UserName(){
        	username.sendKeys("Admin");
        }
        
        public void Password() {
        	password.sendKeys("admin123");
        }
        
        public void LoginButton() {
        	loginbutton.click();
        }
	
	
	
	
	
	
	
	
	
	

}
