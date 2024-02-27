package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsercmnds {
	public static WebDriver driver;

	public static void main(String[] args) {		

				System.setProperty("webdriver.chrome.driver",
						"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

				driver = new ChromeDriver();
				
				//geturl
				
				driver.get("https://automationexercise.com/");
				
				
				//get curr url
				
				String cururl = driver.getCurrentUrl();
				System.out.println(cururl);
				
				//sourcecode
				
				String pagesource = driver.getPageSource();
				System.out.println(pagesource);
				
	//pagetitle
				
				String title = driver.getTitle();
				System.out.println(title);
				
				driver.close();

	}

}
