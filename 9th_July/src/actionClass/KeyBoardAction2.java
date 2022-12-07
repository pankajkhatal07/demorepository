package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");
		WebElement fname=driver.findElement(By.cssSelector("#userName"));
		WebElement email=driver.findElement(By.cssSelector("#userEmail"));
		WebElement caddress=driver.findElement(By.cssSelector("#currentAddress"));
		WebElement paddress=driver.findElement(By.cssSelector("#permanentAddress"));
		//WebElement submit=driver.findElement(By.cssSelector("#submit"));
		WebElement submit =driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
		Thread.sleep(3000);
		
		
		fname.sendKeys("PANKAJ KHATAL");
		email.sendKeys("asdfgh@gmail.com");
		caddress.sendKeys("Om apartment ,Kunjirwadi,pune");
		
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		ac.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
//		if(caddress.getText().equals(paddress.getText()))
//				System.out.println("Current Address and Permanent Address are the same");
//		else
//			System.out.println("Current Address and Permanent Address are different");
//		
//		 System.out.println("Submit button is displayed : "+submit.isDisplayed());
//		 Thread.sleep(2000);
//		 System.out.println("Submit button is enable : "+submit.isEnabled());
		 
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,4000)","");          //imp =  element no found by xpath and css so we have to scroll down
		// ac.moveToElement(submit).click().build().perform();
		// submit.click();
		 js.executeScript("arguments[0].click()",submit);    // imp =does not need to scroll down we drectly move to that element by javascriptExecutor
		 Thread.sleep(5000);
		 // compare the result
		 String ename="Name:PANKAJ KHATAL";
		 String eemail="Email:asdfgh@gmail.com";
		 String eaddress="Current Address :Om apartment ,Kunjirwadi,pune";
		 WebElement aname =driver.findElement(By.cssSelector("#name"));
//		 String oname=aname.getText();
//		 System.out.println(oname);
		 Thread.sleep(2000);
		 WebElement aemail=driver.findElement(By.cssSelector("#email"));
		 WebElement aaddress=driver.findElement(By.cssSelector("p#currentAddress"));
		 //name
		 Thread.sleep(2000);
		 if(ename.equals(aname.getText()))
			 System.out.println("Entered and Save name are the same.");
		 else
		
			 System.out.println("Entered and Save name are not same.");
		 //email
		 Thread.sleep(2000);
		 if(eemail.equals(aemail.getText()))
			 System.out.println("Entered and Save email are the same.");
		 else
			 System.out.println("Entered and Save email are not same.");
		 //address
		 Thread.sleep(2000);
		 if(eaddress.equals(aaddress))
			 System.out.println("Entered and Save address are the same.");
		 else
			 System.out.println("Entered and Save address are not same.");
		 System.out.println("=========================================================================");
		 String submitvalue=driver.findElement(By.cssSelector("div.border.col-md-12.col-sm-12")).getText();
		 Thread.sleep(4000);
		 System.out.println(submitvalue);
	}

}
