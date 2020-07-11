package twentySevenTec.pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditEmploymentAndIncomeDetails extends twentySevenBaseClass {

	WebDriver driver;
	public EditEmploymentAndIncomeDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditEmploymentAndIncome() throws InterruptedException, IOException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2097")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//			ScrollByPixel();
			driver.findElement(By.id("f67279_0")).sendKeys("66");
			driver.findElement(By.id("f67281_0")).sendKeys("Capita");
			logger.info("Updated Employer Name");

//			
			driver.findElement(By.id("f67305_0")).sendKeys("employer1@gmail.com");
			driver.findElement(By.id("f67283_0")).sendKeys("09988333322");

			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//button[@class='btn btn-action'])[33]")).click();
//			logger.info("Clicked on Employer Address Address ");
//			getAddress();
//			Thread.sleep(2000);
			
			driver.findElement(By.id("f67284_0_button")).click();
			driver.findElement(By.linkText("Full Time")).click();
//			Thread.sleep(10000);
			driver.findElement(By.id("f67285_0_button")).click();
			driver.findElement(By.linkText("Information Technology")).click();

			captureScreen(driver);
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[23]")).click(); //
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[24]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[25]")).click(); //Any other income?
			
			logger.info("DIP Employment Details updated successfully");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2097")).click();
	    	
	    }
		
	    else
	    {
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1905")).click();
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("f57753_0")).sendKeys("66");
		driver.findElement(By.id("f57755_0")).sendKeys("Capita");
		driver.findElement(By.id("f61368_0")).sendKeys("Raj");
		driver.findElement(By.id("f61369_0")).sendKeys("Kale");
		
//		WebElement s1=driver.findElement(By.id("autosave"));
//		s1.notify();
		
		
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[84]")).click();
		getAddress();
		Thread.sleep(2000);
		
		driver.findElement(By.id("f57799_0")).sendKeys("employer1@gmail.com");
		driver.findElement(By.id("f57757_0")).sendKeys("09988333322");
		
//		Thread.sleep(10000);
		driver.findElement(By.id("f57758_0_button")).click();
		driver.findElement(By.linkText("Full Time")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("f57768_0_button")).click();
		driver.findElement(By.linkText("Information Technology")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("f57770_0_button")).click();
		driver.findElement(By.linkText("Weekly")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("f57771_0_button")).click();
		driver.findElement(By.linkText("Direct to Bank")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("f57772_0")).sendKeys("9988");				//Tax code
		captureScreen(driver);
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[31]")).click(); //
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[32]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[33]")).click(); //Any other income?
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[34]")).click();
		
		logger.info("Employment Details updated successfully");
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1905")).click();
	    }
	}
	
	public void EditMultiApplicantEmploymentAndIncome() throws InterruptedException, IOException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	   
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	
	    	Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2097")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			driver.findElement(By.id("f67278_1_button")).click();
			driver.findElement(By.linkText("Fixed Term Contract")).click();
			
			driver.findElement(By.id("f67279_0")).sendKeys("66");
			driver.findElement(By.id("f67279_1")).sendKeys("66");
			
			driver.findElement(By.id("f67280_1")).sendKeys("Builder");
			
			driver.findElement(By.id("f67281_0")).sendKeys("Capita");
			logger.info("Updated Employer Name");

//			
			driver.findElement(By.id("f67305_0")).sendKeys("employer1@gmail.com");
			driver.findElement(By.id("f67283_0")).sendKeys("09988333322");

			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//button[@class='btn btn-action'])[33]")).click();
//			logger.info("Clicked on Employer Address Address ");
//			getAddress();
//			Thread.sleep(2000);
			
			driver.findElement(By.id("f67284_0_button")).click();
			driver.findElement(By.linkText("Full Time")).click();
			
			driver.findElement(By.id("f67284_1_button")).click();
			driver.findElement(By.linkText("Full Time")).click();
			
			driver.findElement(By.id("f67302_1")).sendKeys("60");
			logger.info("No of Months Trading");
			
//			Thread.sleep(10000);
			driver.findElement(By.id("f67285_0_button")).click();
			driver.findElement(By.linkText("Information Technology")).click();

			captureScreen(driver);
			
			driver.findElement(By.id("f67329_1")).sendKeys("80000");
			
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[31]")).click(); //
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[32]")).click();
			logger.info("Has the applicant paid UK tax or declared UK income for tax purposes?");
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[33]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'Yes')])[34]")).click();
			logger.info("Income paid into UK bank account?");
			
			driver.findElement(By.id("f67306_1")).sendKeys("9000");
			logger.info("Net Monthly Income");
			
			driver.findElement(By.id("f67333_1")).sendKeys("30");
			logger.info("Net Monthly Income");
			
			driver.findElement(By.id("f67288_1_button")).click();
			driver.findElement(By.linkText("Sub Contractor")).click();
			logger.info("What is the applicant's self employed basis?");
			
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[35]")).click(); //Any other income?
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[36]")).click();
			
			logger.info("DIP Employment Details updated successfully");
			Thread.sleep(2000);
			driver.findElement(By.id("collapsetrigger-s2097")).click();
	    	
	    }
		
	    
	}

	public void EditMultiApplicantEmploymentAndIncomeFMA() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		ScrollByPixel();
//		Thread.sleep(5000);
		driver.findElement(By.id("collapsetrigger-s1905")).click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ScrollByPixelUp();		
		dropDown("f57752_1_button", "Salaried Director");
				
		driver.findElement(By.id("f57753_0")).sendKeys("66");
		driver.findElement(By.id("f57753_1")).sendKeys("66");
		
		sendkeys("f57754_1", "Builder", "Occupation");
		
		driver.findElement(By.id("f57755_0")).sendKeys("Capita");
		
		driver.findElement(By.id("f61368_0")).sendKeys("Raj");
		driver.findElement(By.id("f61368_1")).sendKeys("Vijay");

		
		driver.findElement(By.id("f61369_0")).sendKeys("Kale");
		driver.findElement(By.id("f61369_1")).sendKeys("Kale");
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//button[contains(@type,'button')])[137]")).click();
		getAddress();
		Thread.sleep(20000);
		
		driver.findElement(By.id("f57799_0")).sendKeys("employer1@gmail.com");
		driver.findElement(By.id("f57757_0")).sendKeys("09988333322");
		
//		Thread.sleep(10000);
		driver.findElement(By.id("f57758_0_button")).click();
		driver.findElement(By.linkText("Full Time")).click();
		
		dropDown("f57758_1_button", "Full Time");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[41]")).click();
		logger.info("Is this a Limited Company?");
		
		sendkeys("f57759_1", "Sudarshan Constructions", "What is the name of the applicant's business?");
		
		

		driver.findElement(By.xpath("(//button[contains(@type,'button')])[145]")).click();
		getAddress();
		Thread.sleep(20000);
		
		sendkeys("f57796_1", "60", "Number of Months Trading");
		sendkeys("f57762_1", "01/01/2015", "When did the applicant become connected with the business?");
		sendkeys("f57763_1", "Construction", "What is the nature of the business?");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[43]")).click();
		
//		Thread.sleep(10000);
		
		dropDown("f57770_0_button", "Weekly");
		dropDown("f57770_1_button", "Weekly");
		dropDown("f57771_0_button", "Direct to Bank");
		dropDown("f57771_1_button", "Direct to Bank");
		
		driver.findElement(By.id("f57772_0")).sendKeys("9988");	
		driver.findElement(By.id("f57772_1")).sendKeys("9988");	
		
		driver.findElement(By.id("f57768_0_button")).click();
		driver.findElement(By.linkText("Information Technology")).click();
		
		dropDown("f57768_0_button", "Information Technology");
		
//		Thread.sleep(10000);

		driver.findElement(By.id("f57771_0_button")).click();
		driver.findElement(By.linkText("Direct to Bank")).click();
//		Thread.sleep(10000);
		driver.findElement(By.id("f57772_0")).sendKeys("9988");				//Tax code
		driver.findElement(By.id("f57772_1")).sendKeys("9988");
		captureScreen(driver);
		
		sendkeys("f57773_1", "120000", "Basic salary");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[44]")).click(); //
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[45]")).click();
		logger.info("Has the applicant paid UK tax or declared UK income for tax purposes?");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[46]")).click(); //
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[47]")).click();
		logger.info("Income paid into UK bank account?");
		
		sendkeys("f57800_1", "10000", "Net Monthly Income");
		sendkeys("f57774_1", "20", "If the applicant is a Company Director, what is their shareholding percentage?");
		sendkeys("f57828_1", "30", "Self Employed shareholding percentage?");

		dropDown("f57775_1_button", "Sub Contractor");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[48]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[49]")).click(); //Any other income?
		logger.info("Any other income?");
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[50]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[51]")).click(); //Any other income?
		logger.info("Does the applicant expect income to reduce in the future?");
		
		logger.info("Employment Details updated successfully");
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1905")).click();
	    
	}
}
