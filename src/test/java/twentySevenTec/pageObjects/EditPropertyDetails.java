package twentySevenTec.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditPropertyDetails extends twentySevenBaseClass{

	WebDriver driver;
	
	public EditPropertyDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditProperty() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1908")).click();
		Thread.sleep(2000);
	  		driver.findElement(By.id("f57973_button")).click(); // Type of Valuation required
	  		driver.findElement(By.linkText("Mortgage Valuation")).click();
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[46]")).click();
	  		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
		    js.executeScript("window.scrollBy(0, 300)");
		    Thread.sleep(2000);
	  		
	  		driver.findElement(By.xpath("(//button[contains(@type,'button')])[144]")).click();
	  		Thread.sleep(2000);
	  		logger.info("Property Address Updating");
	  		getAddress();
	  		Thread.sleep(3000);
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[47]")).click();	//Occupants over 17?
	  		logger.info("Updated Occupant Details");
	  		Thread.sleep(15000);
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[48]")).click();	//Adjacent to commerical premises?
	  		logger.info("Adjacent to commerical premises?");
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[49]")).click();	//Is property a new build?
	  		logger.info("Is property a new build? updated");
	  		
	  		driver.findElement(By.id("f61366")).sendKeys("5000");
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[55]")).click();	//Is it ex-local authority?
	  		logger.info("Is it ex-local authority? updated");
	  		
//	  		Thread.sleep(10000);
	  		driver.findElement(By.xpath("//*[@id=\"f57947_button\"]")).click(); // Which new home guarantee does it have?
	  		driver.findElement(By.linkText("NHBC")).click();
//	  		Thread.sleep(10000);	  	
	  		driver.findElement(By.id("f57950")).sendKeys("2");
	  		driver.findElement(By.id("f57951")).sendKeys("3");
	  		driver.findElement(By.id("f57952")).sendKeys("4");
	  		driver.findElement(By.id("f57953")).sendKeys("5");
	  		driver.findElement(By.id("f57954")).sendKeys("6");
	  		driver.findElement(By.id("f57955")).sendKeys("1");
	  		
	  		Thread.sleep(3000);
	  		driver.findElement(By.xpath("//button[contains(@id,'f57956_button')]")).click(); // Parking Type
	  		driver.findElement(By.linkText("On Site")).click();
	  		Thread.sleep(15000);
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[56]")).click(); // Is any applicant related to seller?
	  		
//	  		Thread.sleep(10000);	
	  		driver.findElement(By.id("f61359_button")).click(); // Property Region
	  		driver.findElement(By.linkText("London")).click();
//	  		Thread.sleep(10000);
	  		driver.findElement(By.id("f61360_button")).click();
	  		driver.findElement(By.linkText("England")).click();
	  		Thread.sleep(3000);
	  		
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[57]")).click(); // Solar Panels On Property
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[58]")).click(); // Lender To Appoint Solicitor?
	  		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[59]")).click(); // Will the property be the main residence?
	  		
	  		
	  		captureScreen(driver);
	  		driver.findElement(By.id("collapsetrigger-s1908")).click();
			logger.info("Property Details updated successfully");
	}
	
}
