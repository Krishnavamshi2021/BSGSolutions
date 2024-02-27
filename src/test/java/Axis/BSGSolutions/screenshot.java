package Axis.BSGSolutions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, IOException{		

					System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

					driver = new ChromeDriver();
					driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				File f =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f,new File("C:\\Users\\yuvia\\Downloads/screenshot2021.jpg"));
				System.out.println("Screenshot is captured");

	}

}
