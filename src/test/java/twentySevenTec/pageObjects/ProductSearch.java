package twentySevenTec.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class ProductSearch
{
	WebDriver ldriver;
	
	public ProductSearch(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	
	@FindBy(how =How.ID, using="CoreRequirement_LoanTerm")
	@CacheLookup
	WebElement txtloantermyear;
	
	@FindBy(how =How.ID, using="CoreRequirement_TermUnit_button")
	@CacheLookup
	WebElement droptermunit;
	
	@FindBy(how =How.ID, using="CoreRequirement_PaymentMethod_buttonlbl")
	@CacheLookup
	WebElement droppaymentmethod;
	
	@FindBy(how =How.XPATH, using="/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/div/footer/section/button")
	@CacheLookup
	WebElement clksearchmortgage;

	public void ClickStarButton()
	{
		ldriver.findElement(By.id("startBtn")).click();
	}
	
	public void getMortgagetype(String mtype)
	{		
		ldriver.findElement(By.id("CoreRequirement_MortgageType_buttonlbl")).click();
		ldriver.findElement(By.linkText(mtype)).click();
	}
	
	public void getLoanPurpose(String ltype)
	{
	//	droploanpurpose.click();
		ldriver.findElement(By.id("CoreRequirement_ReasonForMortgage_button")).click();
		ldriver.findElement(By.linkText(ltype)).click();
	}
	
	public void getPurchasePrice(String pprice)
	{
		ldriver.findElement(By.id("CoreRequirement_PurchasePrice")).sendKeys(pprice);
	}
	
		
	public void getLoanamount(String lamt)
	{
		ldriver.findElement(By.id("CoreRequirement_LoanAmount")).sendKeys(lamt);
	}
	
	public void getsourceofdeposite(String sdepo)
	{
		ldriver.findElement(By.id("CoreRequirement_SourceOfDeposit_button")).click();
		ldriver.findElement(By.linkText(sdepo)).click();

	}
	
	public void getloantermyear(String lterm)
	{
		ldriver.findElement(By.id("CoreRequirement_LoanTerm")).sendKeys(lterm);
	}
	
	public void getpaymentmethod(String pmethod)
	{
		ldriver.findElement(By.id("CoreRequirement_PaymentMethod_buttonlbl")).click();
		ldriver.findElement(By.linkText(pmethod)).click();

	}
	
	public void clkonsearchmortgage()
	{
		ldriver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/div/footer/section/button")).click();
	}
}
