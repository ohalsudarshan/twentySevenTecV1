package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProductSearch
{
	WebDriver ldriver;
	
	public ProductSearch(WebDriver rdriver)
	{
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how =How.XPATH, using="//*[@id=\"main-nav-menu-sourcinghistory\"]")
	WebElement clkstartbtn;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_MortgageType_buttonlbl")
	WebElement dropmortgagetype;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_ReasonForMortgage_button")
	WebElement droploanpurpose;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_PurchasePrice")
	WebElement txtpurchaseprice;
	
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_LoanAmount")
	WebElement txtloanamount;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_SourceOfDeposit_button")
	WebElement dropsourceofdeposite;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_LoanTerm")
	WebElement txtloantermyear;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_TermUnit_button")
	WebElement droptermunit;
	
	@FindBy(how =How.ID_OR_NAME, using="CoreRequirement_PaymentMethod_buttonlbl")
	WebElement droppaymentmethod;
	
	@FindBy(how =How.XPATH, using="/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/div/footer/section/button")
	WebElement clksearchmortgage;

	public void ClickStarButton()
	{
//		WebElement clkstartbtn=ldriver.findElement(By.id("startBtn"));
		clkstartbtn.click();		
	}
	
	public void getMortgagetype(String mtype)
	{
		dropmortgagetype.sendKeys(mtype);
	}
	
	public void getLoanPurpose(String ltype)
	{
		droploanpurpose.sendKeys(ltype);
	}
	
	public void getPurchasePrice(String pprice)
	{
		txtpurchaseprice.sendKeys(pprice);
	}
	
	public void getsourceofdeposite(String sdepo)
	{
		dropsourceofdeposite.sendKeys(sdepo);
	}
	
	public void getLoanamount(String lamt)
	{
		txtloanamount.sendKeys(lamt);
	}
	
	public void getloantermyear(String lterm)
	{
		txtloantermyear.sendKeys(lterm);
	}
	
	public void clkonsearchmortgage()
	{
		clksearchmortgage.sendKeys();
	}
}
