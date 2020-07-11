package twentySevenTec.testCases;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;
import twentySevenTec.pageObjects.PropertyDetails;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetailsMulti;


public class TC_008_TwentySevenMultiApplicantDetailsEmployedandSelfEmployedEmployment extends twentySevenBaseClass{
	
	@Test
	public void ApplicantDetails() throws Exception 
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
	}

	
}
