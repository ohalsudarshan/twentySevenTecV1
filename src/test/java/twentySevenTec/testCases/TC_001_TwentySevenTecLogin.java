package twentySevenTec.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;

public class TC_001_TwentySevenTecLogin extends twentySevenBaseClass {
	
	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
	
		String title=(driver.getTitle());
				System.out.println(title);
		
		if(driver.getTitle().equals(title))
		{
			Assert.assertTrue(true);
			System.out.println("Login Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Login Failed");
		}
	}

}
