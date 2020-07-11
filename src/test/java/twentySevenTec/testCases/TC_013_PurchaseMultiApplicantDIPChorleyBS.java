package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetailsMulti;
import twentySevenTec.pageObjects.EditApplicantDetails;
import twentySevenTec.pageObjects.EditCreditHistoryDetails;
import twentySevenTec.pageObjects.EditEmploymentAndIncomeDetails;
import twentySevenTec.pageObjects.EditIntermediaryInformation;
import twentySevenTec.pageObjects.EditMortgageRequirements;
import twentySevenTec.pageObjects.EditOutgoingsDetails;
import twentySevenTec.pageObjects.EditPropertyDetails;
import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;
import twentySevenTec.pageObjects.ProductSelection;
import twentySevenTec.pageObjects.PropertyDetails;
import twentySevenTec.testCases.twentySevenBaseClass;

public class TC_013_PurchaseMultiApplicantDIPChorleyBS extends twentySevenBaseClass{
	
	@Test
	public void PurchaseMultiApplicantDIPChorleyBS() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
				
		logger.info("Logged in Successfully for Mulit Applicant Details test case");
		
		ClickonStartButton();
		
		MortgageRequirements m1=new MortgageRequirements(driver);
		m1.GetMortgageRequirements();
		
		ApplicantDetailsMulti ad=new ApplicantDetailsMulti(driver);
		ad.GetApplicantDetails();
		logger.info("Applicant Details entered successfully");
		ad.getContactDetails();
	//	getAddress();
		logger.info("Contact Details entered successfully");
		ad.getEmploymentDetails();
		logger.info("Employment Details entered successfully");
		ad.getOutgoingDetails();
		logger.info("Outgoing Details entered successfully");
		
		ad.GetApplicantDetails2();
		logger.info("Applicant2 Details entered successfully");
		ad.getContactDetailsApplicant2();
		logger.info("Applicant2 Contact Details entered successfully");
		ad.getEmploymentDetailsApplicant2();
		logger.info("Applicant2 Employment Details entered successfully");
		ad.getOutgoingDetailsApplicant2();
		logger.info("Applicant2 Outgoing Details entered successfully");
		
		
		PropertyDetails p1=new PropertyDetails(driver);
		p1.GetPropertyDetails();
		
		SearchMortgageBtn();
		
		ProductSelection p2=new ProductSelection(driver);
		p2.SelectChorleyBSProduct();
		
		SelApplicationTypeDIP();
		ClickOnEditApplication();
		
//		EditIntermediaryInformation e4=new EditIntermediaryInformation(driver);
//		e4.EditIntermediaryInfoMultiApplicant();
		
//		EditApplicantDetails e5=new EditApplicantDetails(driver);
//		e5.EditMultiApplicantInfo();
		
//		EditMortgageRequirements e6=new EditMortgageRequirements(driver);
//		e6.EditMortgageReqMultiApplicant();
		
		EditEmploymentAndIncomeDetails e7=new EditEmploymentAndIncomeDetails(driver);
		e7.EditMultiApplicantEmploymentAndIncome();
		
		EditOutgoingsDetails e8=new EditOutgoingsDetails(driver);
		e8.EditOutgoingsMultiApplicant();
		
		EditCreditHistoryDetails e9=new EditCreditHistoryDetails(driver);
		e9.EditMulitApplicantCreditHistory();
		
		EditPropertyDetails e10=new EditPropertyDetails(driver);
		e10.EditPropertyMultiApplicant();
		
		
		
	}
	
}
