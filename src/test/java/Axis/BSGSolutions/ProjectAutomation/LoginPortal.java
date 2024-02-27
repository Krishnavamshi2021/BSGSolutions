package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPortal {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0 , 400)", "");
		Thread.sleep(500);
		WebElement loginportal = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[2]/a[1]/div[1]/div[1]"));
		loginportal.click();

		Thread.sleep(500);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				WebElement username = driver.findElement(By.xpath("//input[@id='text']"));
				Thread.sleep(500);
				Actions builder = new Actions(driver);

				org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(username).click().keyDown(username,Keys.INSERT).sendKeys(username, "webdriver").build();
				seriesofact.perform();
				Thread.sleep(500);
				
				WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
				Thread.sleep(500);
				
				org.openqa.selenium.interactions.Action seriesofact1 = builder.moveToElement(password).click().keyDown(password, Keys.INSERT).sendKeys(password, "webdriver123").build();
				seriesofact1.perform();
				
				Thread.sleep(500);
			
				WebElement loginbutton = driver.findElement(By.xpath("//button[@id='login-button']"));
				loginbutton.click();
				
				Thread.sleep(500);
				
				Alert alt = driver.switchTo().alert();
				alt.accept();
				Thread.sleep(500);
			}
		}
	}
}
