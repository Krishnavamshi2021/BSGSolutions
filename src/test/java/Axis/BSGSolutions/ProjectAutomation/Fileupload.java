package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		Thread.sleep(500);

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.MILLISECONDS);

		js.executeScript("window.scrollBy(0 ,4400)", "");
		Thread.sleep(1000);

		WebElement buttonclicks = driver.findElement(By.xpath("//h1[contains(text(),'FILE UPLOAD')]"));

		Actions Builder = new Actions(driver);
		Builder.click(buttonclicks).perform();

		Thread.sleep(500);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));

				upload.sendKeys("C:\\Users\\yuvia\\Downloads\\screenshot2.jpg");
				
				
				WebElement sub = driver.findElement(By.xpath("//input[@id='submit-button']"));
				Builder.click(sub).perform();
				System.out.println("File Upload Successfully");
				
				
				Alert alt1 = driver.switchTo().alert();
				alt1.accept();
			
			}

		}
	}
}
