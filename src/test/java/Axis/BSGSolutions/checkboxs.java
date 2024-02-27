package Axis.BSGSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxs {
	
			public static WebDriver driver;

			public static void main(String[] args) {		

						System.setProperty("webdriver.chrome.driver",
								"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

						driver = new ChromeDriver();
//						driver.get("https://the-internet.herokuapp.com/checkboxes");
						driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
					driver.manage().window().maximize();
//					
//					WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[2])"));
//					
//					if(checkbox2.isSelected()) {
//						checkbox2.click();
//					}
//						
//					WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1])"));
//					
//					if(checkbox2.isEnabled())
//					{
//						checkbox1.click();
//					}

					
					WebElement radio1 = driver.findElement(By.xpath("((//input[@type= 'radio'])[1])"));
					if(radio1.isDisplayed()) {
						radio1.click();
//					}
//						
	}
			

					WebElement radio2 = driver.findElement(By.xpath("((//input[@type= 'radio'])[2])"));
					if(radio1.isSelected()) {
						
						radio2.submit();
			


}
}
}
