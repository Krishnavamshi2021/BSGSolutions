package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {
	public static WebDriver driver;

	public static void main(String[] args) {		

				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
			
	}

}
