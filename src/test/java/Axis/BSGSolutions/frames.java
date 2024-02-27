package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
 
			driver.get("https://the-internet.herokuapp.com/iframe");
	 
			driver.manage().window().maximize();
	 
			Thread.sleep(500);
	 
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
			driver.switchTo().frame(frame1);
			WebElement content = driver.findElement(By.xpath("//body[@id='tinymce']"));
			content.clear();
			content.sendKeys("guddu");





	 
	 
		}
	 

}
