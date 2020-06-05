package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditCreditHistoryDetails extends twentySevenBaseClass{
	
	WebDriver driver;
	public EditCreditHistoryDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void EditCreditHistory() throws InterruptedException
	{
		driver.findElement(By.id("collapsetrigger-s1907")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[36]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[37]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[38]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[39]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[40]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[41]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[42]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[43]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[44]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[45]")).click();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
	    js.executeScript("window.scrollBy(0, -500)");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("collapsetrigger-s1907")).click();
	        
		logger.info("Credit History updated successfully");
	}
}
