package twentySevenTec.pageObjects;

import java.util.concurrent.TimeUnit;

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
		
//	    String PageTitle=driver.getTitle();
	    		
//	    System.out.println("Title DIP: "+PageTitle);
	    
	    String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    
	    System.out.println(DipApp);
	    
	    logger.info("Editing Broker Fees");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    	
	    {
	    	logger.info("We are in DIP Block");
	    	 driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]")).click();		
			 logger.info("Editing broker fees 100$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[42]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[39]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 100$");
			 
			 		
			 driver.findElement(By.xpath("(//button[contains(@type,'button')])[15]")).click();	
			 logger.info("Editing broker fees 50$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[42]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[39]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 50$");
			 
			driver.findElement(By.id("collapsetrigger-s2094")).click();		
			logger.info("Updated the DIP Intermediary Information");
	    }
	    
	    else
	    	
	    {
	    	logger.info("We are in FMA Block");
	    	 driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]")).click();		
			 logger.info("Editing broker fees 100$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[62]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[contains(@class,'btn btn-default dropdown-toggle btn-dropdownlist control-label required ')])[60]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[@type='button'][contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 100$");
			 
			 		
			 driver.findElement(By.xpath("(//button[contains(@type,'button')])[15]")).click();	
			 logger.info("Editing broker fees 50$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[62]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[contains(@class,'btn btn-default dropdown-toggle btn-dropdownlist control-label required ')])[60]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[@type='button'][contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 50$");

			 driver.findElement(By.id("collapsetrigger-s1902")).click();		
				logger.info("Updated the FMA Intermediary Information");
	    }
		
		 
		/*
		 * driver.findElement(By.xpath("(//button[contains(@title,'Delete')])[2]")).
		 * click(); logger.info("Deleted broker fees 100$"); driver.findElement(By.
		 * xpath("(//button[contains(@class,'btn btn-delete')])[2]")).click();
		 * logger.info("Deleted broker fees 50$");
		 */


	}
	
	public void EditIntermediaryInfoMultiApplicant() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
	    js.executeScript("window.scrollBy(0, 300)");
	    
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[1]")).click();	//Is sale advised?
		
	    String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    
	    System.out.println(DipApp);
	    
	    logger.info("Editing Broker Fees");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))	    	
	    {
	    	logger.info("We are in DIP Block");
	    	 driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]")).click();		
			 logger.info("Editing broker fees 100$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[64]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[59]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 100$");
			 
			 		
			 driver.findElement(By.xpath("(//button[contains(@type,'button')])[15]")).click();	
			 logger.info("Editing broker fees 50$");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[64]")).click();	//Added to Loan?
			 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[59]")).click();					//Is this refundable and when?
			 driver.findElement(By.linkText("Not Refundable")).click();
			 
			 driver.findElement(By.xpath("//button[contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
			 logger.info("Updated broker fees 50$");
			 
			driver.findElement(By.id("collapsetrigger-s2094")).click();		
			logger.info("Updated the DIP Intermediary Information");
	    }
	    
		/*
		 * driver.findElement(By.xpath("(//button[contains(@title,'Delete')])[2]")).
		 * click(); logger.info("Deleted broker fees 100$"); driver.findElement(By.
		 * xpath("(//button[contains(@class,'btn btn-delete')])[2]")).click();
		 * logger.info("Deleted broker fees 50$");
		 */


	}
	
	public void EditIntermediaryInfoMultiApplicantFMA() throws InterruptedException
    {
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
	    js.executeScript("window.scrollBy(0, 300)");
	    
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[1]")).click();	//Is sale advised?
	    
	    logger.info("Editing Broker Fees");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logger.info("We are in FMA Block");
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[12]")).click();		
		 logger.info("Editing broker fees 100$");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[90]")).click();	//Added to Loan?
		 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[84]")).click();					//Is this refundable and when?
		 driver.findElement(By.linkText("Not Refundable")).click();
		 
		 driver.findElement(By.xpath("//button[@type='button'][contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
		 logger.info("Updated broker fees 100$");
		 
		 		
		 driver.findElement(By.xpath("(//button[contains(@type,'button')])[15]")).click();	
		 logger.info("Editing broker fees 50$");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[90]")).click();	//Added to Loan?
		 driver.findElement(By.xpath("(//button[@class='btn btn-default dropdown-toggle btn-dropdownlist control-label required '][contains(@id,'button')])[84]")).click();					//Is this refundable and when?
		 driver.findElement(By.linkText("Not Refundable")).click();
		 
		 driver.findElement(By.xpath("//button[@type='button'][contains(.,'Update Broker Fee')]")).click();	// Click Update Broker Fee
		 logger.info("Updated broker fees 50$");

		 driver.findElement(By.id("collapsetrigger-s1902")).click();		
			logger.info("Updated the FMA Intermediary Information");
    }   
	
}
