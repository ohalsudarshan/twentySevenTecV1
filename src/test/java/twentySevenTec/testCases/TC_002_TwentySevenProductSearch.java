package twentySevenTec.testCases;

import org.testng.annotations.Test;

import twentySevenTec.pageObjects.LoginPage;
import twentySevenTec.pageObjects.ProductSearch;

public class TC_002_TwentySevenProductSearch extends twentySevenBaseClass{
	
	@Test
	public void ProductSearch() throws Exception
	{
		driver.get("https://stagingmortgageapply.twenty7tec.com/Account/Login");
		driver.manage().window().maximize();
		
		LoginPage lp1=new LoginPage(driver);
		lp1.setUsername("27Tectestadviser@element21.co.uk");
		lp1.setPassword("Capita@006");
		lp1.clksubmitbtn();
		
		logger.info("Logged in Successfully");
		
		Thread.sleep(3000);
		
		ProductSearch p1=new ProductSearch(driver);
		
		p1.ClickStarButton();
		Thread.sleep(3000);
		logger.info("Click on Start Button");
		
		p1.getMortgagetype("Standard Residential");
		p1.getLoanPurpose("Purchase");
		p1.getPurchasePrice("100000");
		p1.getLoanamount("70000");
		p1.getloantermyear("15");
		p1.clkonsearchmortgage();
		
		String pagetitle= driver.getTitle();
		
		if(driver.getTitle()==pagetitle)
		{
			logger.info("product search page opened");
		}
		else
		{
			logger.info("product search page not opened yet");
		}
	}

}
