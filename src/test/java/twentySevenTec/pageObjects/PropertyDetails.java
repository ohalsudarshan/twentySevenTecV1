package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PropertyDetails {
	
	WebDriver driver;
	
	public PropertyDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

		public void GetPropertyDetails() throws Exception
		{		driver.findElement(By.id("startBtn")).click();
				Thread.sleep(3000);
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
//				driver.findElement(By.id("IsPropertyExLocalAuthority_Yes")).click();
				
	//			/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/fieldset/div/div[15]/div/table/tbody/tr/td[1]/label/i
				
				//Property Address
				
				driver.findElement(By.id("btn-property-address")).click();
				driver.findElement(By.xpath("//*[@id=\"manualEditButton\"]/i")).click();
				driver.findElement(By.id("PropertyDetail_PostCode")).sendKeys("GL52 2NP");
				driver.findElement(By.id("PropertyDetail_FlatNumber")).sendKeys("1");
				driver.findElement(By.id("PropertyDetail_BuildingName")).sendKeys("1 Warwick Apartments");
				driver.findElement(By.id("PropertyDetail_BuildingNumber")).sendKeys("1");
				driver.findElement(By.id("PropertyDetail_StreetName")).sendKeys("Warwick Place");
				driver.findElement(By.id("PropertyDetail_Town")).sendKeys("Cheltenham");
				driver.findElement(By.id("PropertyDetail_County")).sendKeys("Gloucestershire");

		}
	}	
