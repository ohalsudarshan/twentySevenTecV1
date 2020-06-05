package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditIntermediaryInformation extends twentySevenBaseClass{

	WebDriver driver;
	public EditIntermediaryInformation(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditIntermediaryInfo() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[1]")).click();	//Is sale advised?
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
	    js.executeScript("window.scrollBy(0, 300)");
		
		driver.findElement(By.xpath("(//button[contains(@title,'Delete')])[2]")).click();
		logger.info("Deleted broker fees 100$");
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-delete')])[2]")).click();
		logger.info("Deleted broker fees 50$");
	
		driver.findElement(By.id("collapsetrigger-s1902")).click();		
		logger.info("Updated the Intermediary Information");

	}
}
