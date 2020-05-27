package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.MortgageRequirements;

public class TC_002_TwentySevenMortgageRequirements extends twentySevenBaseClass{
	
	@Test
	public void MortgageRequirements() throws Exception
	{
		
		LoginPage lp1=new LoginPage(driver);
		lp1.setUsername(username);
		lp1.setPassword(password);
		lp1.clksubmitbtn();
		ClickonStartButton();
		
		logger.info("Logged in Successfully for MortgageRequirements test case");
		
		Thread.sleep(3000);
		
		MortgageRequirements p1=new MortgageRequirements(driver);
		
		p1.GetMortgageRequirements();
		logger.info("MortgageRequirements Updated");	
	
		String pagetitle=driver.getTitle();
		
		if(driver.getTitle().equals(pagetitle))
		{
			logger.info("product search page opened");
		}
		else
		{
			logger.info("product search page not opened yet");
		}
	}

}
