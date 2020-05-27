package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.ProductSearch;

public class TC_002_TwentySevenProductSearch extends twentySevenBaseClass{
	
	@Test
	public void ProductSearch() throws Exception
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		LoginPage lp1=new LoginPage(driver);
		lp1.setUsername(username);
		lp1.setPassword(password);
		lp1.clksubmitbtn();
		
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000);
		
		ProductSearch p1=new ProductSearch(driver);
		
		p1.ClickStarButton();
		Thread.sleep(3000);
		logger.info("Click on Start Button");
		Thread.sleep(3000);
		p1.getMortgagetype("Standard Residential");
		
		logger.info("Standard Residential selected");
		
		p1.getLoanPurpose("Purchase");
		
		logger.info("Purchase selected");
		
		p1.getPurchasePrice("100000");
		p1.getLoanamount("70000");
		p1.getsourceofdeposite("Savings");
		p1.getloantermyear("15");
		p1.getpaymentmethod("Repayment");
		p1.clkonsearchmortgage();
		Thread.sleep(5000);
		
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
