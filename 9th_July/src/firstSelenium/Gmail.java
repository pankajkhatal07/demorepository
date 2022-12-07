package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      

            

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();

           

            driver.manage().window().maximize();

            driver.get("https://www.google.co.in/");

           Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Gmail account create");

            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()=\"gmail account create\"]")).click();

            //driver.findElement(By.xpath("//input[@name=\"btnK\"]")).click();

            driver.findElement(By.xpath("((//input[contains(@name,\"btnK\")])[2]")).click();
            Thread.sleep(2000);
           

            driver.findElement(By.xpath("(//h3[contains(@class,\"LC20lb MBeuO DKV0Md\")])[1]")).click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@class=\"action-button\"]")).click();

            Thread.sleep(3000);

            driver.findElement(By.xpath("(//input[contains(@class,\"whsOnd zHQkBf\")])[1]")).click();

            Thread.sleep(3000);

            driver.findElement(By.xpath("//div[text()=\"First name\"]")).sendKeys("Abhishek");

            Thread.sleep(3000);

             driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Mudholkar");

           

            driver.findElement(By.xpath("//div[@class=\"rFrNMe N3Hzgf jjwyfe ACpCs pXgSje q0K82e zKHdkd sdJrJc Tyc9J CDELXb\"]")).sendKeys("oyeabhya");

}



	

}
