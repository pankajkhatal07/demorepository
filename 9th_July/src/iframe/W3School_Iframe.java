package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School_Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        Thread.sleep(3000);
        //move to next frame
        driver.switchTo().frame("iframeResult");
       String text = driver.findElement(By.xpath("//h2[contains(text(),\"HTML Iframes\")]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame(); //parent frame for the outer frame is main page
		driver.findElement(By.cssSelector("button#runbtn")).click(); // click on run button on main page
		
		
		// move to inner frame
		driver.switchTo().frame("iframeResult");  // for going to inner frame we must switch window from main frame to the outer frame
		WebElement InnerFrame=driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]"));
		
		driver.switchTo().frame(InnerFrame);
		String InnerText = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Inner_Frame_Text : "+InnerText);
	
		//move to the parent frame
		//driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();  //for move directly from inner frame to main page we have to use the defaultContent
//		driver.findElement(By.cssSelector("button#runbtn")).click();
		
		driver.switchTo().parentFrame();// innerframe to outerframe
		String OuterText=driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width attributes to specify the size of the iframe:\")]")).getText();
		System.out.println("Outer_Frame_Text : "+OuterText);

	}

}
