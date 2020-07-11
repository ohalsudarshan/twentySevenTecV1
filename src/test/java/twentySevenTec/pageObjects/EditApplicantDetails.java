package twentySevenTec.pageObjects;
import twentySevenTec.testCases.twentySevenBaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EditApplicantDetails extends twentySevenBaseClass{
	
	WebDriver driver;
	public EditApplicantDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditApplicantInfo() throws InterruptedException, Exception
	{	
		
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    
	    {
	    	logger.info("DIP Applicant Details ");
	    	Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s2096")).click();
			Thread.sleep(2000);
		
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[4]")).click(); //Has the applicant ever been known by another name?

		 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
		 			 	
		 	driver.findElement(By.id("f67222_0")).sendKeys(nin); //Applicant1National Insurance Number
		 	driver.findElement(By.id("f67225_0_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
		 	
		 	Thread.sleep(2000);

		 	JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
		    js.executeScript("window.scrollBy(0, 300)");
		    
		    Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[27]")).click();
		 	logger.info("Clicked on Applicant Address ");
		 	getAddress();
		 	Thread.sleep(20000);
		 	
		/*
		 * WebDriverWait expwait=new WebDriverWait(driver, 50); WebElement
		 * e1=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "(//label[@class='radio'][contains(.,'No')])[8]"))); e1.click();
		 * logger.info("waited and moved ahead");
		 */
		 	
	//	 	explicitlywait("(//label[@class='radio'][contains(.,'No')])[8]");
		 			
	//	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[8]")).click();		//Mortgaged?

		 	driver.findElement(By.id("f67242_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f67275_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f67224_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[7]")).click();		//Diplomatic Immunity?
		 	
		 	driver.findElement(By.id("f67252_0")).sendKeys("5");
		 	driver.findElement(By.id("f67253_0")).sendKeys("7");
		 	driver.findElement(By.id("f67262_0_button")).click();
		 	driver.findElement(By.linkText("Home Phone")).click();
		 	driver.findElement(By.id("f67241_0")).sendKeys("5");
		 	driver.findElement(By.id("f67230_0")).sendKeys("01/01/2015");
		 	captureScreen(driver);
		 	
		 	Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s2096")).click();
		 	logger.info("DIP Applicant details updated successfully");
	    }

	    else
	    {
	    	logger.info("FMA Applicant Details ");
			Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s1904")).click();
			Thread.sleep(2000);
		
		 	driver.findElement(By.xpath("//*[@id=\"f57724_0_ctrl\"]/table/tbody/tr/td[3]/label")).click(); //Has the applicant ever been known by another name?

		 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
		 			 	
		 	driver.findElement(By.id("f57687_0")).sendKeys(nin); //Applicant1National Insurance Number
		 	driver.findElement(By.id("f57690_0_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
		 	
		 	Thread.sleep(2000);

		 	JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
		    js.executeScript("window.scrollBy(0, 300)");
		    
		    Thread.sleep(2000);
		 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[29]")).click();
		 	logger.info("Clicked on Applicant Address ");
		 	getAddress();
		 	Thread.sleep(20000);
		 	
		/*
		 * WebDriverWait expwait=new WebDriverWait(driver, 50); WebElement
		 * e1=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "(//label[@class='radio'][contains(.,'No')])[8]"))); e1.click();
		 * logger.info("waited and moved ahead");
		 */
		 	
		 	explicitlywait("(//label[@class='radio'][contains(.,'No')])[8]");
		 			
	//	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[8]")).click();		//Mortgaged?

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
		 	logger.info("FMA Applicant details updated successfully");

	    }
		}		
	
	public void EditMultiApplicantInfo() throws InterruptedException, Exception
	{	
		
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    
	    {
	    	logger.info("DIP Applicant Details ");
	    	Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s2096")).click();
			Thread.sleep(2000);
		
			logger.info("Updating first Applicant Details ");
			
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[4]")).click(); //Has the applicant ever been known by another name?
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[5]")).click();
		 	
		 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
		 	String nin1= "AA"+randomNumber()+"A";
		 	
		 	driver.findElement(By.id("f67222_0")).sendKeys(nin); //Applicant1National Insurance Number
		 	driver.findElement(By.id("f67222_1")).sendKeys(nin1);
		 	
		 	driver.findElement(By.id("f67225_0_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
		 	
		 	driver.findElement(By.id("f67225_1_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
		 	
		 	Thread.sleep(2000);

//		 	JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
//		    js.executeScript("window.scrollBy(0, 300)");
//		    
//		    Thread.sleep(2000);
//		 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[27]")).click();
//		 	logger.info("Clicked on Applicant Address ");
//		 	getAddress();
//		 	Thread.sleep(20000);
		 	
		/*
		 * WebDriverWait expwait=new WebDriverWait(driver, 50); WebElement
		 * e1=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "(//label[@class='radio'][contains(.,'No')])[8]"))); e1.click();
		 * logger.info("waited and moved ahead");
		 */
		 	
	//	 	explicitlywait("(//label[@class='radio'][contains(.,'No')])[8]");
		 			
	//	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[8]")).click();		//Mortgaged?

		 	driver.findElement(By.id("f67242_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	driver.findElement(By.id("f67242_1_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	
		 	driver.findElement(By.id("f67275_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
			driver.findElement(By.id("f67275_1_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	driver.findElement(By.id("f67224_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
			driver.findElement(By.id("f67224_1_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[10]")).click();		//Diplomatic Immunity?
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[11]")).click();
		 	
		 	
		 	driver.findElement(By.id("f67252_0")).sendKeys("5");
		 	driver.findElement(By.id("f67252_1")).sendKeys("5");
		 	driver.findElement(By.id("f67253_0")).sendKeys("7");
		 	driver.findElement(By.id("f67253_1")).sendKeys("7");
		 	
		 	driver.findElement(By.id("f67262_0_button")).click();
		 	driver.findElement(By.linkText("Home Phone")).click();
		 	
		 	driver.findElement(By.id("f67262_1_button")).click();
		 	driver.findElement(By.linkText("Home Phone")).click();
		 	
		 	driver.findElement(By.id("f67241_0")).sendKeys("5");
		 	driver.findElement(By.id("f67241_0")).sendKeys("6");
//		 	driver.findElement(By.id("f67230_0")).sendKeys("01/01/2015");
		 	captureScreen(driver);
		 	
		 	
		 	Thread.sleep(2000);	
			driver.findElement(By.id("collapsetrigger-s2096")).click();
		 	logger.info("DIP Multi Applicant details updated successfully");
	    }


		}		

	public void EditMultiApplicantInfoFMA() throws InterruptedException, Exception
	{
		Thread.sleep(2000);
		logger.info("FMA Applicant Details ");
		driver.findElement(By.id("collapsetrigger-s1904")).click();
		Thread.sleep(5000);
//		ScrollByPixelUp();
	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[4]")).click();
	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[5]")).click();
	 	logger.info("Has the applicant ever been known by another name?");

	 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
	 	String nin1= "AA"+randomNumber()+"A";
	 	Thread.sleep(20000);
	 	driver.findElement(By.id("f57687_0")).sendKeys(nin);
	 	driver.findElement(By.id("f57687_1")).sendKeys(nin1);
	 	logger.info("Applicant1 National Insurance Number");

	 	driver.findElement(By.id("f57690_0_button")).click();
	 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?
	 	
	 	driver.findElement(By.id("f57690_1_button")).click();
	 	driver.findElement(By.linkText("Owner Occupied")).click();
	 	
	 	Thread.sleep(2000);

	 	JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll down the page by 300 pixel vertical	
	    js.executeScript("window.scrollBy(0, 300)");
	    
	    Thread.sleep(2000);
	 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[44]")).click();
	 	logger.info("Clicked on Applicant Address ");
	 	getAddress();
	 	Thread.sleep(20000);
	 	
		 	driver.findElement(By.xpath("(//button[contains(@type,'button')])[46]")).click();
		 	logger.info("Clicked on Applicant Address ");
		 	getAddress();
		 	Thread.sleep(20000);
	 	
	/*
	 * WebDriverWait expwait=new WebDriverWait(driver, 50); WebElement
	 * e1=expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "(//label[@class='radio'][contains(.,'No')])[8]"))); e1.click();
	 * logger.info("waited and moved ahead");
	 */
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[12]")).click();
		 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[13]")).click();
//	 	explicitlywait("(//label[@class='radio'][contains(.,'Yes')])[12]");
//	 	explicitlywait("(//label[@class='radio'][contains(.,'Yes')])[13]");
	 			
//	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[8]")).click();		//Mortgaged?

	 	driver.findElement(By.id("f57716_0_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();
	 	driver.findElement(By.id("f57716_1_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();
	 	
	 	
	 	driver.findElement(By.id("f57999_0_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();
	 	driver.findElement(By.id("f57999_1_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();
	 	
	 	driver.findElement(By.id("f57689_0_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();	 	
	 	driver.findElement(By.id("f57689_1_button")).click();
	 	driver.findElement(By.linkText("United Kingdom")).click();

	 	
	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[18]")).click();
	 	driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[19]")).click();
	 	logger.info("Diplomatic Immunity?");
	 	
	 	
	 	driver.findElement(By.id("f57734_0")).sendKeys("5");
	 	driver.findElement(By.id("f57734_1")).sendKeys("5");
	 	driver.findElement(By.id("f57735_0")).sendKeys("7");
	 	driver.findElement(By.id("f57735_1")).sendKeys("7");
	 	Thread.sleep(20000);
	 	
	 	driver.findElement(By.id("f57743_0_button")).click();
	 	driver.findElement(By.linkText("Home Phone")).click();
	 	
	 	driver.findElement(By.id("f57743_1_button")).click();
	 	driver.findElement(By.linkText("Home Phone")).click();
	 	
	 	driver.findElement(By.id("f57715_0")).sendKeys("5");
	 	driver.findElement(By.id("f57715_1")).sendKeys("5");
	 	
	 	driver.findElement(By.id("f57704_0")).sendKeys("01/01/2015");
	 	driver.findElement(By.id("f57704_1")).sendKeys("01/01/2015");
	 	captureScreen(driver);
	 	
	 	Thread.sleep(2000);	
		driver.findElement(By.id("collapsetrigger-s1904")).click();
	 	logger.info("FMA Applicant details updated successfully");

	}
}
