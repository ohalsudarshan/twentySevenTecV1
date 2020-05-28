package twentySevenTec.pageObjects;
import twentySevenTec.testCases.twentySevenBaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class FMAEditApplication extends twentySevenBaseClass{
	
	WebDriver driver;
	public FMAEditApplication(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void UpdateApplicantDetails() throws InterruptedException, Exception
	{	
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/section/div[4]/div[2]/div[1]/div/a[1]")).click();			//Edit Application
		Thread.sleep(5000);	
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[1]/div/a[4]")).click();			//Click on validate
		System.out.println("Clicked on Validate");
		driver.findElement(By.id("collapsetrigger-s1904")).click();
		 Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//*[@id=\"f57724_0_ctrl\"]/table/tbody/tr/td[3]/label")).click(); //Has the applicant ever been known by another name?

		 	String nin= "AA"+randomNumber()+"A";	//Creating Random National Insurance number
		 
		 	driver.findElement(By.id("f57687_0")).sendKeys(nin); //Applicant1National Insurance Number
		 	driver.findElement(By.id("f57690_0_button")).click();
		 	driver.findElement(By.linkText("Owner Occupied")).click();//Applicant1Current residential status?

		 	driver.findElement(By.xpath("//*[@id=\"f57738_0_ctrl\"]/table/tbody/tr/td[3]/label")).click();		//Mortgaged?

		 	driver.findElement(By.id("f57716_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f57999_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f57689_0_button")).click();
		 	driver.findElement(By.linkText("United Kingdom")).click();
		 	driver.findElement(By.id("f57734_0")).sendKeys("5");
		 	driver.findElement(By.id("f57735_0")).sendKeys("7");
		 	driver.findElement(By.id("f57743_0_button")).click();
		 	driver.findElement(By.linkText("Home Phone")).click();
		 	driver.findElement(By.id("f57715_0")).sendKeys("5");
		 	driver.findElement(By.id("f57704_0")).sendKeys("01/01/2015");
		 	captureScreen(driver);
		 	logger.info("Applicant details updated successfully");
		 	
//		 	driver.findElement(By.id("autosave")).click();
		}
	
		public void UpdateMortgageRequirements() throws InterruptedException, IOException
			{
		Thread.sleep(3000);
		driver.findElement(By.id("collapsetrigger-s1903")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"f57640_ctrl\"]/table/tbody/tr/td[3]/label")).click();		//Multiple Sources Of Deposit?
		
//		driver.findElement(By.id("f57642")).sendKeys("100000");				//Deposit Amount
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id=\"f57659_ctrl\"]/table/tbody/tr/td[3]/label")).click();		//Will the applicant(s) or their immediate family occupy 40% (or more) of the property?
		driver.findElement(By.id("f57666_0")).sendKeys("0");	
		captureScreen(driver);
		logger.info("Mortgage Requirementss updated successfully");
		}
		
		public void UpdateEmploymentandIncomeDetails() throws InterruptedException, IOException
		{
			Thread.sleep(5000);
			driver.findElement(By.id("collapsetrigger-s1905")).click();
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.id("f57753_0")).sendKeys("66");
			driver.findElement(By.id("f57755_0")).sendKeys("Capita");
			driver.findElement(By.id("f61368_0")).sendKeys("Raj");
			driver.findElement(By.id("f61369_0")).sendKeys("Kale");
			
			driver.findElement(By.id("f57799_0")).sendKeys("employer1@gmail.com");
			driver.findElement(By.id("f57757_0")).sendKeys("09988333322");
			
			
			driver.findElement(By.id("f57758_0_button")).click();
			driver.findElement(By.linkText("Full Time")).click();

			
			Thread.sleep(3000);
			driver.findElement(By.id("f57768_0_button")).click();
			driver.findElement(By.linkText("Information Technology")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.id("f57770_0_button")).click();
			driver.findElement(By.linkText("Weekly")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("f57771_0_button")).click();
			driver.findElement(By.linkText("Direct to Bank")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("f57772_0")).sendKeys("9988");
			captureScreen(driver);
			logger.info("Employment Details updated successfully");
		}
	
		public void UpdatePropertyDetails() throws InterruptedException, IOException
		{	
			Thread.sleep(5000);
			driver.findElement(By.id("collapsetrigger-s1908")).click();
			Thread.sleep(3000);
		  		driver.findElement(By.id("f57973_button")).click(); // Type of Valuation required
		  		driver.findElement(By.linkText("Mortgage Valuation")).click();
		  		driver.findElement(By.id("f61366")).sendKeys("5000");
		  		Thread.sleep(2000);
		  		driver.findElement(By.xpath("//*[@id=\"f57947_button\"]")).click(); // Which new home guarantee does it have?
		  		driver.findElement(By.linkText("NHBC")).click();
		  		Thread.sleep(3000);		  	
		  		driver.findElement(By.id("f57950")).sendKeys("2");
		  		driver.findElement(By.id("f57951")).sendKeys("3");
		  		driver.findElement(By.id("f57952")).sendKeys("4");
		  		driver.findElement(By.id("f57953")).sendKeys("5");
		  		driver.findElement(By.id("f57954")).sendKeys("6");
		  		driver.findElement(By.id("f57955")).sendKeys("1");
		  		Thread.sleep(2000); 		
		  		driver.findElement(By.id("f61359_button")).click(); // Property Region
		  		driver.findElement(By.linkText("North West")).click();
		  		driver.findElement(By.id("f61360_button")).click();
		  		driver.findElement(By.linkText("England")).click();
		  		captureScreen(driver);
				logger.info("Property Details updated successfully");
		}
		
		public void UpdateDirectDebitDetails() throws InterruptedException, IOException
		{
			Thread.sleep(3000);
	  		driver.findElement(By.id("collapsetrigger-s1979")).click(); // Re
	  		Thread.sleep(3000);
	  		driver.findElement(By.id("f61346")).sendKeys("HSBC Bank");
	  		driver.findElement(By.id("f61348")).sendKeys("09988888888");
	  		driver.findElement(By.id("f61349")).sendKeys("09988888889");
	  		driver.findElement(By.id("f61350")).sendKeys("Bank@gmail.com");
	  		driver.findElement(By.id("f61351")).sendKeys("09988888890");
	  		driver.findElement(By.id("f61352")).sendKeys("98765485");
	  		driver.findElement(By.id("f61353")).sendKeys("Bankulternate@gmail.com");
	  		driver.findElement(By.id("f61354")).sendKeys("42-42-42");
	  		driver.findElement(By.id("f61355")).sendKeys("852852852852");
	  		driver.findElement(By.id("f61356")).sendKeys("852852855");
	  		driver.findElement(By.id("f61357")).sendKeys("644565");
	  		driver.findElement(By.id("f57653")).sendKeys("8");
	  		captureScreen(driver);
			logger.info("Direct Debit Details updated successfully");
		}
		
}
