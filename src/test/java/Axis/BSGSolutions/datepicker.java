package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

		public static WebDriver driver;

		public static void main(String[] args) throws Throwable {		

					System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

					driver = new ChromeDriver();
					driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				
				  WebElement Date = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
				  Date.click();
				  Thread.sleep(1000);
				  WebElement newDate = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
				  newDate.click();
			

	}

}
