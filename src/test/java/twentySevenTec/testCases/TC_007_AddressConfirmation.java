package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.ApplicantDetails;
import twentySevenTec.pageObjects.EditApplicantDetails;
import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;
import twentySevenTec.pageObjects.ProductSelection;
import twentySevenTec.pageObjects.PropertyDetails;

public class TC_007_AddressConfirmation extends twentySevenBaseClass{
	
	
	@Test
	public void AddressConfirmation() throws Exception
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		ClickonStartButton();
		
		MortgageRequirements mr=new MortgageRequirements(driver);
		mr.GetMortgageRequirements();
		
		ApplicantDetails ad=new ApplicantDetails(driver);
		ad.GetApplicantDetails();
		ad.getContactDetails();
		ad.getEmploymentDetails();
		ad.getOutgoingDetails();
		
		PropertyDetails pd=new PropertyDetails(driver);
		pd.GetPropertyDetails();
		
		SearchMortgageBtn();
		
		ProductSelection ps=new ProductSelection(driver);
		ps.SelectChorleyBSProduct();
		SelApplicationTypeFMA();
		
		EditApplicantDetails ed=new EditApplicantDetails(driver);
		ed.EditApplicantInfo();
		
		
		
	}

}
