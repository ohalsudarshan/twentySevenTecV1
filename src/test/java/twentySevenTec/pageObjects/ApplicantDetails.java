package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import twentySevenTec.testCases.twentySevenBaseClass;;

public class ApplicantDetails extends twentySevenBaseClass{
	
	WebDriver driver;
	
	public ApplicantDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void GetApplicantDetails() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/ul/li[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"hr1\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("tab-applicant-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Client_Applicants_0__Title_button")).click();
		driver.findElement(By.linkText("Mr")).click();
		
		String firstname=randomString();
		String midname=randomString();
		String lastname=randomString();
		
		driver.findElement(By.id("Client_Applicants_0__FirstNameDecrypted")).sendKeys(firstname);
		driver.findElement(By.id("Client_Applicants_0__MiddleNameDecrypted")).sendKeys(midname);
		driver.findElement(By.id("Client_Applicants_0__LastNameDecrypted")).sendKeys(lastname);
		
		driver.findElement(By.id("Client_Applicants_0__Gender_button")).click();
		driver.findElement(By.linkText("Male")).click();
		driver.findElement(By.id("Client_Applicants_0__MaritalStatus_button")).click();
		driver.findElement(By.linkText("Single")).click();
		driver.findElement(By.id("Client_Applicants_0__Nationality_button")).click();
		driver.findElement(By.linkText("British")).click();
		driver.findElement(By.id("Client_Applicants_0__ApplicantType_button")).click();
		driver.findElement(By.linkText("No Current Mortgage")).click();
		 WebElement e1=driver.findElement(By.id("Client_Applicants_0__DateofBirth"));
		 e1.sendKeys("08/04/1991");
	}
	
	public void getContactDetails()
	{
		driver.findElement(By.id("btn-contact-details")).click();
		driver.findElement(By.id("Client_Applicants_0__HomePhoneDecrypted")).sendKeys("09028040507");
		driver.findElement(By.id("Client_Applicants_0__WorkPhoneDecrypted")).sendKeys("09028040508");
		driver.findElement(By.id("Client_Applicants_0__MobilePhoneDecrypted")).sendKeys("09028040509");
		driver.findElement(By.id("Client_Applicants_0__EmailDecrypted")).sendKeys("Sud@gmail.com");
	}
	
	public void getEmploymentDetails() throws InterruptedException
	{
		driver.findElement(By.id("btn-employment-financial-income-details")).click();
		driver.findElement(By.id("Client_Applicants_0__EmploymentStatus_button")).click();
		driver.findElement(By.linkText("Employed")).click();
		driver.findElement(By.id("Client_Applicants_0__Occupation")).sendKeys("Developer");
		driver.findElement(By.id("Client_Applicants_0__BasicAnnualSalaryGross")).sendKeys("150000");
		driver.findElement(By.id("Client_Applicants_0__NetMonthlyIncome")).sendKeys("14000");
		driver.findElement(By.id("Client_Applicants_0__CurrentEmploymentYears")).sendKeys("5");
		driver.findElement(By.id("Client_Applicants_0__CurrentEmploymentMonths")).sendKeys("6");
		driver.findElement(By.id("Client_Applicants_0__ContinuousEmploymentYears")).sendKeys("7");
		driver.findElement(By.id("Client_Applicants_0__ContinuousEmploymentMonths")).sendKeys("8");
		Thread.sleep(3000);		
		driver.findElement(By.id("Client_Applicants_0__CurrentAccountProvider")).click();
		driver.findElement(By.linkText("Accord")).click();
	}
		
		public void getOutgoingDetails()
		{
		driver.findElement(By.id("btn-outgoings")).click();


				/* Outgoings */
		// Household

		driver.findElement(By.id("Client_Applicants_0__OutMortgageRent")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutElectricity")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutCouncilTax")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutTelevision")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutInsurance")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutGas")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutWater")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutHouseholdOther")).sendKeys("2");

		// Living Costs

		driver.findElement(By.id("Client_Applicants_0__OutGroceries")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutClothing")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutHomeHelp")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutLaundryDryCleaning")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutHomePhone")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutMobilePhone")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutInternet")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutInvestments")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutLoansHirePurchase")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutMaintenancePayments")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutLivingCostsOther")).sendKeys("2");

		// Lifestyle

		driver.findElement(By.id("Client_Applicants_0__OutEntertainment")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutHolidays")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutSports")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutCigarettesAlcohol")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutPensionInsurances")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutLeisure")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutTravel")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutLifestyleOther")).sendKeys("2");

		// Transport

		driver.findElement(By.id("Client_Applicants_0__OutPetrol")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutCommutingCosts")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutCarCosts")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutCarInsurance")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutTransportOther")).sendKeys("2");

		// Children

		driver.findElement(By.id("Client_Applicants_0__OutDayCare")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutSchooling")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutClothes")).sendKeys("2");
		driver.findElement(By.id("Client_Applicants_0__OutChildrenOther")).sendKeys("2");
	 
	 
	//	driver.findElement(By.xpath("//*[@id=\"hr1\"]/div/div/footer/section/button")).click();
		System.out.println("Logged in Successfully using excel data");
	}
	
}
