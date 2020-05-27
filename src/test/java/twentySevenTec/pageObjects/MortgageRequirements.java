package twentySevenTec.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


public class MortgageRequirements
{
	WebDriver ldriver;
	
	public MortgageRequirements(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void GetMortgageRequirements()
	{
		ldriver.findElement(By.id("CoreRequirement_MortgageType_buttonlbl")).click();
		ldriver.findElement(By.linkText("Standard Residential")).click();
		ldriver.findElement(By.id("CoreRequirement_ReasonForMortgage_button")).click();
		ldriver.findElement(By.linkText("Purchase")).click();
		ldriver.findElement(By.id("CoreRequirement_PurchasePrice")).sendKeys("120000");
		ldriver.findElement(By.id("CoreRequirement_LoanAmount")).sendKeys("80000");
		ldriver.findElement(By.id("CoreRequirement_SourceOfDeposit_button")).click();
		ldriver.findElement(By.linkText("Savings")).click();
		ldriver.findElement(By.id("CoreRequirement_LoanTerm")).sendKeys("15");
		ldriver.findElement(By.id("CoreRequirement_PaymentMethod_buttonlbl")).click();
		ldriver.findElement(By.linkText("Repayment")).click();


	}
	
}
