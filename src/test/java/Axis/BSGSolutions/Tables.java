package Axis.BSGSolutions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			 
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
	 
			driver.get("https://the-internet.herokuapp.com/tables");
	 
			driver.manage().window().maximize();
	 
			Thread.sleep(500);
			
			List<WebElement> rowno = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr"));
			int rowcount = rowno.size();
			
			System.out.println(rowcount);
			
			
			List<WebElement> colno = driver.findElements(By.xpath("//table[@id = 'table1']/tbody/tr[2]/td"));
			int ccount = colno.size();
			System.out.println(ccount);
			
			
			WebElement celldata = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[3]/td[3]"));
			String txt = celldata.getText();
			System.out.println(txt);
			
			String realvalue = "jdoe@hotmail.com";
			
			if(txt.equals(realvalue) ) {
				System.out.println("The Value is correct");
		
			}
			else {
				System.out.println("The Value is incorrect");
			}
	 
}
}