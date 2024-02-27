package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static WebDriver driver;
		 
			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
			
						driver.get("https://www.makemytrip.com/");

						driver.manage().window().maximize();

						Thread.sleep(500);

						JavascriptExecutor js = (JavascriptExecutor)driver;


						  // vertical down scroll (x and y coordinates)


						  js.executeScript("window.scrollBy(0 , 600)", "");


						  // vertical up scroll (x and y coordinates)

						  js.executeScript("window.scrollBy(0 , -600)", "");


						  Thread.sleep(500);

						  // resizing of the window

						  // horizontal down scroll (x and y coordinates)

						  js.executeScript("window.scrollBy(200 , 0)", "");


						  // vertical up scroll (x and y coordinates)

						  js.executeScript("window.scrollBy(-300 , 0)", "");


						WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Corporate Travel')]"));

						js.executeScript("arguments[0].scrollIntoView(true);", ele);


		 
		 
			}
		 
		

}
