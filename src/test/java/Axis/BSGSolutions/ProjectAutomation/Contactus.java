package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Contactus {

	public static WebDriver driver;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();


		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// vertical down scroll (x and y coordinates)

		js.executeScript("window.scrollBy(0 , 400)", "");
		WebElement contact = driver.findElement(By.xpath("//h1[contains(text(),'CONTACT US')]"));

		Actions Builder = new Actions(driver);
		Builder.click(contact).perform();

	

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				WebElement firstname = driver
						.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/input[1]"));

				Actions builder = new Actions(driver);
				Action seriesofact = builder.moveToElement(firstname).click().keyDown(firstname, Keys.INSERT)
						.sendKeys(firstname, "krishna").build();
				seriesofact.perform();
				
				WebElement lastname = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/input[2]"));
				
				Action seriesofact2 = builder.moveToElement(lastname).click().keyDown(lastname, Keys.INSERT)
						.sendKeys(lastname, "Vamshi").build();
						seriesofact2.perform();
						
		
								WebElement email = driver.findElement(By.xpath("//input[@name='email']")); 

								Action seriesofact3 = builder.moveToElement(email).click().keyDown(email, Keys.INSERT) .sendKeys(email, "krishna@gmail.com").build(); 

								seriesofact3.perform(); 
		
			   WebElement comment = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/textarea[1]"));
			   Action seriesofact4 = builder.moveToElement(comment).click().keyDown(comment, Keys.INSERT)
						.sendKeys(comment, "good night").build();
						seriesofact4.perform();
						
			   WebElement submit = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/div[1]/input[2]"));
			 
			   submit.click();
			   
			   WebElement fname = driver.findElement(By.xpath("//h1[contains(text(),'Thank You for your Message!')]")); 

				String text = fname.getText(); 

		 		String expectedTxt = "Thank You for your Message!"; 

		 		if(text.equals(expectedTxt)) { 

		 			System.out.println("Thank You Message is displayed"); 

		 		} else { 

		 			System.out.println("Thank You Message is not displayed"); 

		 		} 
			   
			}
		}
	}
}
	
			
	
			

