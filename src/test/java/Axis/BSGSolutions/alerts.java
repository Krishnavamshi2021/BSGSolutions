package Axis.BSGSolutions;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {


	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {		

				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().window().maximize();
			//information
			WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
			infoalt.click();
			Thread.sleep(500);
			
			Alert alt = driver.switchTo().alert();
			alt.accept();
			Thread.sleep(500);
			
			//confirmation
			WebElement confalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
			confalt.click();
			Thread.sleep(500);
			Alert alt1 = driver.switchTo().alert();
			alt1.dismiss();
			Thread.sleep(500);
			
			//prompt
			WebElement promptalt = driver.findElement(By.xpath("//input[@name='prompt']"));
			promptalt.click();
			Thread.sleep(500);
			Alert alt2 = driver.switchTo().alert();
			alt2.accept();
			Thread.sleep(500);
	}

}
