package twentySevenTec.pageObjects;
import twentySevenTec.testCases.twentySevenBaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class EditApplicantDetails extends twentySevenBaseClass{
	
	WebDriver driver;
	public EditApplicantDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditApplicantInfo() throws InterruptedException, Exception
	{	

			Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s1904")).click();
			Thread.sleep(2000);
		
		 	driver.findElement(By.xpath("//*[@id=\"f57724_0_ctrl\"]/table/tbody/tr/td[3]/label")).click(); //Has the applicant ever been known by another name?

		 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
		 			 	
		 	driver.findElement(By.id("f57687_0")).sendKeys(nin); //Applicant1National Insurance Number
		 	driver.findElement(By.id("f57690_0_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
		 	
		 	JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
		    js.executeScript("window.scrollBy(0, 300)");
		    
		    Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[23]")).click();
		 	logger.info("Clicked on Applicant Address ");
		 	getAddress();
		 	Thread.sleep(20000);
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[8]")).click();		//Mortgaged?

		 	driver.findElement(By.id("f57716_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f57999_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f57689_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[11]")).click();		//Diplomatic Immunity?
		 	
		 	driver.findElement(By.id("f57734_0")).sendKeys("5");
		 	driver.findElement(By.id("f57735_0")).sendKeys("7");
		 	driver.findElement(By.id("f57743_0_button")).click();
		 	driver.findElement(By.linkText("Home Phone")).click();
		 	driver.findElement(By.id("f57715_0")).sendKeys("5");
		 	driver.findElement(By.id("f57704_0")).sendKeys("01/01/2015");
		 	captureScreen(driver);
		 	
		 	Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s1904")).click();
		 	logger.info("Applicant details updated successfully");

		}		
}
