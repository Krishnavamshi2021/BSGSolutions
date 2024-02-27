package Axis.BSGSolutions.ProjectAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popalerts {

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
				JavascriptExecutor js = (JavascriptExecutor)driver;


				  js.executeScript("window.scrollBy(0 ,1800)", "");
				  
				  WebElement PopupAlert = driver.findElement(By.xpath("//h1[contains(text(),'POPUP & ALERTS')]"));
				  PopupAlert.click();

				  Set<String> allWindows = driver.getWindowHandles();
				  System.out.println(allWindows);
				  Iterator<String>  itr = allWindows.iterator();
				  while(itr.hasNext()) {
					String childwindow = itr.next();
					if (!parentwindow.equalsIgnoreCase(childwindow)) {
						driver.switchTo().window(childwindow);
						
						WebElement JavaScriptAlert = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/span[1]/p[1]"));
						  JavaScriptAlert.click();
						  
						  Alert alt = driver.switchTo().alert();
							alt.dismiss();
							Thread.sleep(500);
							
//						WebElement modalpopup = driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/span[1]/p[1]"));
//						modalpopup.click();
//						driver.switchTo().window(childwindow);
						
						
						WebElement AjaxLoader = driver.findElement(By.xpath("//a[contains(text(),'CLICK ME!')]"));
						AjaxLoader.click();
						
						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						  
				 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='button1']")));
						
							 
								
						WebElement AjaxLoaderwait = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));
						AjaxLoaderwait.click();
					
						driver.switchTo().window(childwindow);
						
						WebElement javascript = driver.findElement(By.xpath("//span[@id='button4']"));
						javascript.click();
						  Alert alt1 = driver.switchTo().alert();
							alt1.accept();
							Thread.sleep(500);
						
						
					}			
		}

	}
	}
