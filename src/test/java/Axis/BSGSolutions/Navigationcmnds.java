package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcmnds {

		public static WebDriver driver;

		public static void main(String[] args) {		

					System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

					driver = new ChromeDriver();
					
					//geturl
					
					driver.get("https://automationexercise.com/");
					
					driver.navigate().forward();
			
					driver.navigate().back();
					
							
					driver.navigate().refresh();
					
			
	}

}
