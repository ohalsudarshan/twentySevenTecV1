package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetails;
import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;
import twentySevenTec.pageObjects.ProductSelection;
import twentySevenTec.pageObjects.PropertyDetails;

public class TC_005_TwentySevenProductSearch extends twentySevenBaseClass{
	
	@Test
	public void GetProduct() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
				
		logger.info("Login Successfull for GetProduct test case");
		ClickonStartButton();
		logger.info("Clicked on start button");
		
		MortgageRequirements m1=new MortgageRequirements(driver);
		m1.GetMortgageRequirements();
		
		logger.info("Mortgage requirement details updated successfully");
		
		ApplicantDetails ad=new ApplicantDetails(driver);
		ad.GetApplicantDetails();	logger.info("Applicant details updated successfully");
		ad.getContactDetails();		logger.info("Contact details updated successfully");
		ad.getEmploymentDetails();	logger.info("Employment details updated successfully");
		ad.getOutgoingDetails();	logger.info("Outgoing details updated successfully");
		
		Thread.sleep(3000);
		PropertyDetails pd=new PropertyDetails(driver);
		pd.GetPropertyDetails();	logger.info("Property details updated successfully");
		
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
		
		logger.info("Product Selection completed");
	}

}
