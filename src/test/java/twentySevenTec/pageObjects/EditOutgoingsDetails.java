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
