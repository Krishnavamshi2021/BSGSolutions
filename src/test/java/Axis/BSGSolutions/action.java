package Axis.BSGSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
		

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {		

					System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

					driver = new ChromeDriver();
					driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				driver.manage().window().maximize();
				
				WebElement doubleclick  = driver.findElement(By.xpath("//input[@id='double-click']"));
				
				Actions Builder = new Actions(driver);
				Builder.doubleClick(doubleclick).perform();
				
				Alert alt = driver.switchTo().alert();
				alt.accept();
				Thread.sleep(500);
				
				
				WebElement contextclick  = driver.findElement(By.xpath("//input[@name='download']"));
				Actions Builder2 = new Actions(driver);
				Builder2.contextClick(contextclick).perform();
				
		
	}

}
