package twentySevenTec.testCases;

import twentySevenTec.pageObjects.LoginPage;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetails;

public class TC_003_TwentySevenApplicantDetails extends twentySevenBaseClass{
	
	@Test
	public void ApplicantDetails() throws Exception 
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		
		logger.info("Logged in Successfully for Applicant Details test case");
		
		ApplicantDetails ad=new ApplicantDetails(driver);
		ad.GetApplicantDetails();
		logger.info("Applicant Details entered successfully");
		ad.getContactDetails();
		logger.info("Contact Details entered successfully");
		ad.getEmploymentDetails();
		logger.info("Employment Details entered successfully");
		ad.getOutgoingDetails();
		logger.info("Outgoing Details entered successfully");
		
	}

	
}
