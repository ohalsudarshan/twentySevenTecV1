package twentySevenTec.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import twentySevenTec.pageObjects.EditCreditHistoryDetails;
import twentySevenTec.pageObjects.EditDirectDebitDetails;
import twentySevenTec.pageObjects.EditEmploymentAndIncomeDetails;
import twentySevenTec.pageObjects.EditIntermediaryInformation;
import twentySevenTec.pageObjects.EditMortgageRequirements;
import twentySevenTec.pageObjects.EditOutgoingsDetails;
import twentySevenTec.pageObjects.EditPropertyDetails;
import twentySevenTec.pageObjects.EditApplicantDetails;

public class AllDemoTesting extends twentySevenBaseClass{
	
	@Test
	public void CheckAnything() throws Exception
	{
		driver.get("https://stagingmortgageapply.twenty7tec.com/Sourcing/ProductDetails?sourceDataId=77381&productCode=00614L&lenderFilter=Chorley%20BS&sortColumn=9,asc&productType=undefined");
		driver.manage().window().maximize(); // driver.close();
		driver.findElement(By.id("Email")).sendKeys("27Tectestadviser@element21.co.uk");
		driver.findElement(By.id("Password")).sendKeys("Capita@006");
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Logged in Successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-chevron-right fa-2x')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@id,'bot2-Msg1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Full Mortgage Application')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(@class,'fa fa-edit fa-2x')]")).click();			//Edit Application
		logger.info("Clicked on Edit Application");
		Thread.sleep(3000);
//		driver.findElement(By.id("collapsetrigger-s1902")).click();			
//		Thread.sleep(3000);
		
		EditIntermediaryInformation e1=new EditIntermediaryInformation(driver);
				e1.EditIntermediaryInfo();
		
		EditApplicantDetails f1=new EditApplicantDetails(driver);
				f1.EditApplicantInfo();
		
		EditMortgageRequirements e2=new EditMortgageRequirements(driver);
				e2.EditMortgageReq();
				
		EditEmploymentAndIncomeDetails e3=new EditEmploymentAndIncomeDetails(driver);
				e3.EditEmploymentAndIncome();
				
		EditOutgoingsDetails e4=new EditOutgoingsDetails(driver);
				e4.EditOutgoings();
				
		EditCreditHistoryDetails e5=new EditCreditHistoryDetails(driver);
				e5.EditCreditHistory();
				
		EditPropertyDetails e6=new EditPropertyDetails(driver);
				e6.EditProperty();
				
		EditDirectDebitDetails e7=new EditDirectDebitDetails(driver);
				e7.EditDirectDebit();
		
		
	}
	
}
