package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String path="C:\\Users\\panka\\OneDrive\\Desktop\\Excel\\Book1.xlsx";
        
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook =new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        
        String username=sheet.getRow(1).getCell(0).getStringCellValue();
        String password=sheet.getRow(1).getCell(1).getStringCellValue();
        
       // driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys(username);
        driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys(username);
       // driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys(password);
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);
       // driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        
        String expectedname=sheet.getRow(1).getCell(2).getStringCellValue();
        String actualname=driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).getText();
        
        if(expectedname.equals(actualname))
        	System.out.println("Name is correct");
        else
        	System.out.println("Name is incorrect");
        
	}

}
