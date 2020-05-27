package twentySevenTec.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;

public class TC_001_TwentySevenTecLogin extends twentySevenBaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		logger.info("URL is Provided");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Username Provided");
		lp.setPassword(password);
		logger.info("Password Provided");
		lp.clksubmitbtn();
	
		String title=(driver.getTitle());
				System.out.println(title);
		
		if(driver.getTitle().equals(title))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
