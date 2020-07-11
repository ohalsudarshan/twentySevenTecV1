package twentySevenTec.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class ProductSelection {

	WebDriver driver;
	public ProductSelection(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void SelectChorleyBSProduct() throws Exception
	{	
		Thread.sleep(3000);	
		driver.findElement(By.id("mortgageLenderFilter_button")).click();
		driver.findElement(By.linkText("Chorley BS")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div[1]/article/div/div/div/div[3]/div/table/tbody/tr[1]/td[2]")).click();
		Thread.sleep(3000);	
		System.out.println("Product Selection Completed");
		
		driver.findElement(By.id("btn-apply-for-mortgage-available")).click();
		driver.findElement(By.id("bot2-Msg1")).click();
		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void SelectHSBCProduct() throws Exception
	{	
		Thread.sleep(3000);	
		driver.findElement(By.id("mortgageLenderFilter_button")).click();
		driver.findElement(By.linkText("HSBC")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div[1]/article/div/div/div/div[3]/div/table/tbody/tr[1]")).click();
		Thread.sleep(3000);	
		System.out.println("Product Selection Completed");
		
		driver.findElement(By.id("btn-apply-for-mortgage-available")).click();
		driver.findElement(By.id("bot2-Msg1")).click();
		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
}
