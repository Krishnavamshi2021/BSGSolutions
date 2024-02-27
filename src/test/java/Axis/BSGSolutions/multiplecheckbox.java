package Axis.BSGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplecheckbox {
	public static WebDriver driver;
	
			public static void main(String[] args) {		

						System.setProperty("webdriver.chrome.driver",
								"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

						driver = new ChromeDriver();
//						driver.get("https://the-internet.herokuapp.com/checkboxes");
//						driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
						driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
					driver.manage().window().maximize();
				
					List<WebElement> allcheckbox =  driver.findElements(By.xpath("(//input[@class = 'cb1-element'])"));
			
					for (WebElement wb : allcheckbox) {
						
						wb.click();
						
						
				
					}

	}
			
}
