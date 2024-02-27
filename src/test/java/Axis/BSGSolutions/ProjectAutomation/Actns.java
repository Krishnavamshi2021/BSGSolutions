package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actns {

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

//			WebElement ele = driver.findElement(By.xpath("//h1[contains(text(),'ACTIONS')]"));
//
//			js.executeScript("arguments[0].scrollIntoView(true);",ele);

		js.executeScript("window.scrollBy(0 ,2500)", "");
		Thread.sleep(1000);

		WebElement clickactns = driver.findElement(By.xpath("//h1[contains(text(),'ACTIONS')]"));

		Actions Builder = new Actions(driver);

		Builder.click(clickactns).perform();

		Thread.sleep(500);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				WebElement src = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/p[1]"));

				WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));

				Actions builder = new Actions(driver);

				builder.dragAndDrop(src, dest).perform();

				System.out.println("The item dragged and dropped");

				Thread.sleep(500);

				WebElement dclick = driver.findElement(By.xpath("//h2[contains(text(),'Double Click Me!')]"));

				builder.doubleClick(dclick).perform();

				System.out.println("Double click is done");

				Thread.sleep(1000);

				WebElement hoverable = driver
						.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]"));
				new Actions(driver).moveToElement(hoverable).perform();

				WebElement infoalt = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]"));
				infoalt.click();
				Thread.sleep(500);

				Alert alt = driver.switchTo().alert();
				alt.accept();
				Thread.sleep(500);

				WebElement hoverable1 = driver
						.findElement(By.xpath("//button[contains(text(),'Hover Over Me Second!')]"));
				new Actions(driver).moveToElement(hoverable1).perform();

				WebElement infoalt1 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[2]/div[1]/a[1]"));
				infoalt1.click();
				Thread.sleep(500);

				Alert alt1 = driver.switchTo().alert();
				alt1.accept();
				Thread.sleep(500);

				WebElement hoverable2 = driver
						.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]"));
				new Actions(driver).moveToElement(hoverable2).perform();

				WebElement infoalt2 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[3]/div[1]/a[1]"));
				infoalt2.click();
				Thread.sleep(500);

				Alert alt2 = driver.switchTo().alert();
				alt2.accept();
				Thread.sleep(1000);

				WebElement hoverable3 = driver
						.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]"));
				new Actions(driver).moveToElement(hoverable3).perform();

				WebElement infoalt3 = driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[3]/div[1]/a[2]"));
				infoalt3.click();
				Thread.sleep(1000);

				Alert alt3 = driver.switchTo().alert();
				alt3.accept();
				Thread.sleep(1000);
				
				WebElement clickandhold = driver.findElement(By.xpath("//div[@id='click-box']"));
		        new Actions(driver).clickAndHold(clickandhold).perform();

			}

		}
	}
}
