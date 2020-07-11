package twentySevenTec.pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditMortgageRequirements extends twentySevenBaseClass{
	
	WebDriver driver;
	public EditMortgageRequirements(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditMortgageReq() throws InterruptedException, IOException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2095")).click();
		
			explicitlywait("(//label[@class='radio'][contains(.,'No')])[11]");
			
//			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Multiple Sources Of Deposit?
			logger.info("Click on Deposite section");
			Thread.sleep(3000);
			driver.findElement(By.id("f67178")).sendKeys("50000");				//Deposit Amount
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElement(By.id("f67184")).sendKeys("8");			//Preferred direct debit collection date
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Will the applicant(s) or their immediate family occupy 40% (or more) of the property?
			driver.findElement(By.id("f67196_0")).sendKeys("0");			//Number of Mortgages in the last three years?
			captureScreen(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2095")).click();
			logger.info("DIP Mortgage Requirementss updated successfully");
	    }
	    
	    else
	    {
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
	
		explicitlywait("(//label[@class='radio'][contains(.,'No')])[15]");
		
//		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Multiple Sources Of Deposit?
		logger.info("Click on Deposite section");
		Thread.sleep(3000);
		driver.findElement(By.id("f57642")).sendKeys("50000");				//Deposit Amount
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[21]")).click();		//Will the applicant(s) or their immediate family occupy 40% (or more) of the property?
		driver.findElement(By.id("f57666_0")).sendKeys("0");	
		captureScreen(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
		logger.info("FMA Mortgage Requirementss updated successfully");
	    }
		
		}
	
	
	public void EditMortgageReqMultiApplicant() throws InterruptedException, IOException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2095")).click();
		
			explicitlywait("(//label[@class='radio'][contains(.,'No')])[18]");
			
//			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Multiple Sources Of Deposit?
			logger.info("Click on Deposite section");
			Thread.sleep(3000);
			driver.findElement(By.id("f67178")).sendKeys("50000");				//Deposit Amount
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElement(By.id("f67184")).sendKeys("8");			//Preferred direct debit collection date
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[22]")).click();		//Will the applicant(s) or their immediate family occupy 40% (or more) of the property?
			driver.findElement(By.id("f67196_0")).sendKeys("0");			//Number of Mortgages in the last three years?
			driver.findElement(By.id("f67196_1")).sendKeys("0");
			captureScreen(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2095")).click();
			logger.info("DIP Mortgage Requirementss updated successfully");
	    }
	    
	    
		}
	
	public void EditMortgageReqMultiApplicantFMA() throws InterruptedException, IOException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
		Thread.sleep(20000);
		explicitlywait("(//label[@class='radio'][contains(.,'No')])[26]");
		
//		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Multiple Sources Of Deposit?
		logger.info("Click on Deposite section");
//		Thread.sleep(3000);
		driver.findElement(By.id("f57642")).sendKeys("50000");
		logger.info("Deposit Amount updated");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[32]")).click();		
		logger.info("Will the applicant(s) or their immediate family occupy 40% (or more) of the property?");
		
		driver.findElement(By.id("f57666_0")).sendKeys("0");
		driver.findElement(By.id("f57666_1")).sendKeys("0");
		logger.info("Number of mortgages in the last three years?");
		
		captureScreen(driver);
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
		logger.info("FMA Mortgage Requirementss updated successfully");
	  }
		
	
}


