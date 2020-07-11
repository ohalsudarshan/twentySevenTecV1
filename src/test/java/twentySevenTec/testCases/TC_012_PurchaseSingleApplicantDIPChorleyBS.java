package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetails;
import twentySevenTec.pageObjects.EditApplicantDetails;
import twentySevenTec.pageObjects.EditCreditHistoryDetails;
import twentySevenTec.pageObjects.EditDirectDebitDetails;
import twentySevenTec.pageObjects.EditEmploymentAndIncomeDetails;
import twentySevenTec.pageObjects.EditIntermediaryInformation;
import twentySevenTec.pageObjects.EditMortgageRequirements;
import twentySevenTec.pageObjects.EditOutgoingsDetails;
import twentySevenTec.pageObjects.EditPropertyDetails;
import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;
import twentySevenTec.pageObjects.ProductSelection;
import twentySevenTec.pageObjects.PropertyDetails;

public class TC_012_PurchaseSingleApplicantDIPChorleyBS extends twentySevenBaseClass{
	
	@Test
	public void PurchaseSingleApplicantDIPChorleyBS() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		captureScreen(driver);
		logger.info("Login Successfull for GetProduct test case");
		ClickonStartButton();
		logger.info("Clicked on start button");
		captureScreen(driver);
		
		MortgageRequirements m1=new MortgageRequirements(driver);
		m1.GetMortgageRequirements();
		captureScreen(driver);
		logger.info("Mortgage requirement details updated successfully");
		
		ApplicantDetails ad=new ApplicantDetails(driver);
		ad.GetApplicantDetails();	logger.info("Applicant details updated successfully");
		ad.getContactDetails();		logger.info("Contact details updated successfully");
		ad.getEmploymentDetails();	logger.info("Employment details updated successfully");
		ad.getOutgoingDetails();	logger.info("Outgoing details updated successfully");
		captureScreen(driver);
		Thread.sleep(3000);
		PropertyDetails pd=new PropertyDetails(driver);
		pd.GetPropertyDetails();
		Thread.sleep(5000);
		logger.info("Property details updated successfully");
		captureScreen(driver); 
		SearchMortgageBtn();
		
		String pagetitle=driver.getTitle();
		
		if(driver.getTitle().equals(pagetitle))
		{
			logger.info("product search page opened");
		}
		else
		{
			logger.info("product search page not opened yet");
		}
		
		ProductSelection ps=new ProductSelection(driver);
		ps.SelectChorleyBSProduct();
		captureScreen(driver);
		logger.info("Product Selection completed");
		SelApplicationTypeDIP();
		Thread.sleep(3000);
		
//		ClickOnEditApplication();
		
		
//		EditIntermediaryInformation e1=new EditIntermediaryInformation(driver);
//		e1.EditIntermediaryInfo();
		
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
			
		logger.info("Edited All details successfully");
		
		ClickOnSaveButton();
		ClickOnValidate();
		ClickOnSubmitApplication();
	}

}
