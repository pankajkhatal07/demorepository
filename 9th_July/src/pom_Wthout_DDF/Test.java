package pom_Wthout_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c:\\Installer\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		OrangeHRMLoginPage loginpage =new OrangeHRMLoginPage(driver);
			loginpage.UserName();
			loginpage.Password();
			loginpage.LoginButton();
			
			
			OrangeHRMDashboard dashboard = new OrangeHRMDashboard(driver);
			
			dashboard.text();
			dashboard.time();
			

	}

}
