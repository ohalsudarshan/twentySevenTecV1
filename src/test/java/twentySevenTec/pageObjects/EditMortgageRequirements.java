package twentySevenTec.pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();		//Multiple Sources Of Deposit?
		logger.info("Click on Deposite section");
		Thread.sleep(3000);
		driver.findElement(By.id("f57642")).sendKeys("50000");				//Deposit Amount
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[21]")).click();		//Will the applicant(s) or their immediate family occupy 40% (or more) of the property?
		driver.findElement(By.id("f57666_0")).sendKeys("0");	
		captureScreen(driver);
		logger.info("Mortgage Requirementss updated successfully");
		}
	}


