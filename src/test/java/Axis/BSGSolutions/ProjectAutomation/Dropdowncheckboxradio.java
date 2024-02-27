package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowncheckboxradio {

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

		js.executeScript("window.scrollBy(0 , 1000)", "");
		WebElement tab = driver.findElement(By.xpath("//h1[contains(text(),'DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)')]"));
		tab.click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				WebElement ddown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
				Select drop1 = new Select(ddown1);
				Thread.sleep(1000);
				drop1.selectByVisibleText("JAVA");

				WebElement ddown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
				Select drop2 = new Select(ddown2);
				Thread.sleep(1000);
				drop2.selectByVisibleText("Maven");

				WebElement ddown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
				Select drop3 = new Select(ddown3);
				Thread.sleep(1000);
				drop3.selectByVisibleText("JavaScript");

				List<WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
				Thread.sleep(500);
				for (WebElement wb : allcheck) {
					wb.click();
				}

				WebElement rbtn1 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/form[1]/input[4]"));
				Thread.sleep(1000);
				rbtn1.click();

				WebElement rbtn2 = driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/form[1]/input[1]"));
				Thread.sleep(1000);
				rbtn2.click();

				WebElement disabled = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
				Select disab = new Select(disabled);
				Thread.sleep(1000);
				disab.selectByVisibleText("Apple");

			}
		}
	}
}


