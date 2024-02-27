package Axis.BSGSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Invokeedge {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				System.setProperty("webdriver.edge.driver", 
						"C:\\Program Files\\Java\\msedgedriver.exe");

				WebDriver driver = new EdgeDriver();

				driver.get("https://www.selenium.dev/");
			}

		
		
	}

