package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.ProductSelection;

public class TC_006_TwentySevenProductSelection extends twentySevenBaseClass{
	
	@Test
	public void ProductSelection() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clksubmitbtn();
		logger.info("Login successfull for Product selection test case");
		ClickonStartButton();
		logger.info("Clicked on Start Button");
		SearchMortgageBtn();
		logger.info("Clicked on Search mortgage Button");
				
		ProductSelection p1=new ProductSelection(driver);
		p1.SelectChorleyBSProduct();
		
		logger.info("Product Selected Successfully");
	}

}
