package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// vertical down scroll (x and y coordinates)

		js.executeScript("window.scrollBy(0 , 4700)", "");
		
		Thread.sleep(1000);
		
		WebElement tab = driver.findElement(By.xpath("//h1[contains(text(),'DATEPICKER')]"));
		tab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		Iterator <String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				
				WebElement Calender = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]"));
				Calender.click();
				Thread.sleep(500);

				WebElement Change = driver
						.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]"));
				Change.click();
				Thread.sleep(500);
				
				WebElement Month = driver
						.findElement(By.xpath("//span[contains(text(),'Aug')]"));
				Month.click();
				Thread.sleep(500);
				
				WebElement Date = driver
						.findElement(By.xpath("//td[contains(text(),'15')]"));

				Date.click();
				Thread.sleep(500);
				
			}
		}
	}


}

