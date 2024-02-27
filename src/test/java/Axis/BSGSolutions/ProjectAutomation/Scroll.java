package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		Thread.sleep(500);

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0 , 1000)", "");
		WebElement scroll = driver.findElement(By.xpath("//h1[contains(text(),'SCROLLING AROUND')]"));
		scroll.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				WebElement footer = driver.findElement(By.xpath("//div[@id='zone1']"));
		        new Actions(driver).scrollToElement(footer).perform();
		        

		    					 js.executeScript("window.scrollBy(0 , 800)", "");
		    					 Thread.sleep(1000);
		    					 js.executeScript("window.scrollBy(0 , -800)", "");
		    					 Thread.sleep(1000);
		    					 
		    					 WebElement scr=driver.findElement(By.xpath("//div[@id='zone4']"));
		    					 js.executeScript("arguments[0].scrollIntoView(true);", scr);
		    					 
		    		}
		    	}
		        

}

	}
