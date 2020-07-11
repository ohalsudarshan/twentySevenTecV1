package twentySevenTec.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ch.qos.logback.classic.Logger;
import twentySevenTec.testCases.twentySevenBaseClass;

public class EditOutgoingsDetails extends twentySevenBaseClass{

	WebDriver driver;
	public EditOutgoingsDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditOutgoings() throws InterruptedException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2098")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			ScrollByPixelUp();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[26]")).click();
			
			driver.findElement(By.id("f67395_0")).sendKeys("0");
			logger.info("Updated DIP Outgoing details");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2098")).click();
	    }
	    
	    else
	    {
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1906")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[35]")).click();
		
		driver.findElement(By.id("f57889_0")).sendKeys("0");
		logger.info("Updated Outgoing details");
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1906")).click();
	}
	   }
	
	
	public void EditOutgoingsMultiApplicant() throws InterruptedException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2098")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			ScrollByPixelUp();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[37]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[38]")).click();
			logger.info("Does the applicant have any outstanding commitments?");
			
			
			driver.findElement(By.id("f67395_0")).sendKeys("0");
			driver.findElement(By.id("f67395_1")).sendKeys("0");
			logger.info("Number of Credit Cards");
			
			logger.info("Updated DIP Outgoing details");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2098")).click();
	    }
	    
	   
	   }

	public void EditOutgoingsMultiApplicantFMA() throws InterruptedException
	{
			Thread.sleep(5000);
			driver.findElement(By.id("collapsetrigger-s1902")).click();	
		   logger.info("Closing intermediary screen");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s1906")).click();
			Thread.sleep(2000);
			ScrollByPixelUp();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[52]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[53]")).click();
			
			driver.findElement(By.id("f57889_0")).sendKeys("0");
			driver.findElement(By.id("f57889_1")).sendKeys("0");
			logger.info("Updated Outgoing details");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s1906")).click();
		
	}
	

}
