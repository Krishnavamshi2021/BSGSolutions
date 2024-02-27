package Axis.BSGSolutions.ProjectAutomation;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoList {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");

		driver.manage().window().maximize();
		// get the parent window handle
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0 ,1200)", "");
		Thread.sleep(1000);

		WebElement todolist = driver.findElement(By.xpath("//h1[contains(text(),'TO DO LIST')]"));
		todolist.click();
		Thread.sleep(1000);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		Thread.sleep(1000);
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String childwindow = itr.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);

				@SuppressWarnings("unused")
				Actions builder = new Actions(driver);
				Actions actions = new Actions(driver);

//				WebElement addnew = driver.findElement(By.xpath("//body/div[@id='container']/input[1]"));
//				addnew.click();
//				Thread.sleep(1000);
//				org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(addnew).click()
//						.keyDown(addnew, Keys.SHIFT).sendKeys(addnew, "Games").build();
//				seriesofact.perform();
//				Thread.sleep(1000);
//
//				Action seriesofact1 = builder.moveToElement(addnew).click().keyDown(addnew, Keys.ENTER).build();
//				seriesofact1.perform();
//
//				
//
////				WebElement Delpracticemagic1 = driver.findElement(By.xpath("//i[@id='plus-icon']"));
////				actions.moveToElement(Delpracticemagic1).perform();
////				Delpracticemagic1.click();
////
////				WebElement Plusicon1 = driver.findElement(By.xpath("//i[@id='plus-icon']"));
////				actions.moveToElement(Plusicon1).perform();
////				Thread.sleep(800);
////				Plusicon1.click();
				      
				       WebElement AddNewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
				        actions.moveToElement(AddNewTodo).perform();
				        Thread.sleep(800);
				        AddNewTodo.sendKeys("Contact Us");
				        AddNewTodo.sendKeys(Keys.ENTER);
				        Thread.sleep(800);
				        AddNewTodo.sendKeys("Login Function");
				        AddNewTodo.sendKeys(Keys.ENTER);
				        Thread.sleep(800);
				        AddNewTodo.sendKeys("AddSignUp");
				        AddNewTodo.sendKeys(Keys.ENTER);
				        Thread.sleep(800);
				        
				        WebElement Delpracticemagic = driver.findElement(By.xpath("//i[@id='plus-icon']"));
				        actions.moveToElement(Delpracticemagic).perform();
				        Delpracticemagic.click();
				        
				        WebElement Plusicon = driver.findElement(By.xpath("//i[@id='plus-icon']"));
				        actions.moveToElement(Plusicon).perform();
				        Thread.sleep(800);
				        Plusicon.click();	        
			}}
			}
		
	}




