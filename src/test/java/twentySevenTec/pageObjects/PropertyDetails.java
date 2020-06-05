package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class PropertyDetails extends twentySevenBaseClass {
	
	WebDriver driver;
	
	public PropertyDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

		public void GetPropertyDetails() throws Exception
		{			
				driver.findElement(By.xpath("//*[@id=\"hr1\"]/div/ul/li[3]/a")).click();
				driver.findElement(By.id("PropertyDetail_PropertyLocation_button")).click();
				driver.findElement(By.linkText("England")).click();
				driver.findElement(By.id("PropertyDetail_PropertyType_button")).click();
				driver.findElement(By.linkText("House")).click();
				driver.findElement(By.id("PropertyDetail_PropertyStyle_button")).click();
				driver.findElement(By.linkText("Detached")).click();
				driver.findElement(By.id("PropertyDetail_PropertyTenure_button")).click();
				driver.findElement(By.linkText("Freehold")).click();
				driver.findElement(By.id("PropertyDetail_WallType_button")).click();
				driver.findElement(By.linkText("Concrete")).click();
				driver.findElement(By.id("PropertyDetail_RoofType_button")).click();
				driver.findElement(By.linkText("Slate")).click();
				driver.findElement(By.id("PropertyDetail_PropertyUse_button")).click();
				driver.findElement(By.linkText("Primary Residence")).click();
				driver.findElement(By.id("PropertyDetail_PropertyAgeYears")).sendKeys("2");
				driver.findElement(By.id("PropertyDetail_PropertyAgeMonths")).sendKeys("2");
				driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[15]")).click();

		}
	}	
