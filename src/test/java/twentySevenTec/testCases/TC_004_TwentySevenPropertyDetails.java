package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.PropertyDetails;

public class TC_004_TwentySevenPropertyDetails extends twentySevenBaseClass
{
	@Test
	public void PropertyDetails() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		Thread.sleep(3000);
		
		logger.info("Login Successfull for Property Details TC");
		ClickonStartButton();
		
		PropertyDetails p1=new PropertyDetails(driver);
		p1.GetPropertyDetails();
		logger.info("Property Details updated successfully");
		
	}
	

}
