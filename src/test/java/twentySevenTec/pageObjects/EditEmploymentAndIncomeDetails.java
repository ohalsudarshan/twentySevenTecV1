package twentySevenTec.pageObjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		Thread.sleep(2000);
		driver.findElement(By.id("collapsetrigger-s1905")).click();
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("f57753_0")).sendKeys("66");
		driver.findElement(By.id("f57755_0")).sendKeys("Capita");
		driver.findElement(By.id("f61368_0")).sendKeys("Raj");
		driver.findElement(By.id("f61369_0")).sendKeys("Kale");
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
