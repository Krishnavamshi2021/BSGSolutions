package Axis.BSGSolutions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadanddownload {



		public static WebDriver driver;

		public static void main(String[] args) {		

					System.setProperty("webdriver.chrome.driver",
							"C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

					driver = new ChromeDriver();
					driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				driver.manage().window().maximize();
				
				WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
				
				upload.sendKeys("C:\\Users\\yuvia\\Downloads\\pan.jpg");
				
				WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
				download.click();
				
				File file = new File("C:\\Users\\yuvia\\Downloads\\resume.pdf");
				if(file.exists()) {
					System.out.println("The file Exists");
				}
				else {
					System.out.println("The file does not Exists");
				}
				}

	}


