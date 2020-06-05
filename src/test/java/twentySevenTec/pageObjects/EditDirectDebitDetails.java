package twentySevenTec.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditDirectDebitDetails extends twentySevenBaseClass{

WebDriver driver;
	
	public EditDirectDebitDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void EditDirectDebit() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
  		driver.findElement(By.id("collapsetrigger-s1979")).click(); // Re
  		Thread.sleep(2000);
  		driver.findElement(By.id("f61346")).sendKeys("HSBC Bank"); 
  		driver.findElement(By.xpath("(//button[contains(@type,'button')])[168]")).click();	
  		logger.info("On Bank address details page");
		Thread.sleep(3000);
		getAddress();
		Thread.sleep(15000);		
  		
		logger.info("Direct Debit Details updated successfully");
 //		driver.findElement(By.id("f61346")).sendKeys("HSBC Bank");  	
  		driver.findElement(By.id("f61348")).sendKeys("09988888888");
  		driver.findElement(By.id("f61349")).sendKeys("09988888889");
  		driver.findElement(By.id("f61350")).sendKeys("Bank@gmail.com");
  		driver.findElement(By.id("f61351")).sendKeys("09988888890");
   		driver.findElement(By.id("f61352")).sendKeys("98765485");
  		driver.findElement(By.id("f61353")).sendKeys("Bankulternate@gmail.com");
  		driver.findElement(By.id("f61354")).sendKeys("42-42-42");
  		driver.findElement(By.id("f61355")).sendKeys("852852852852");
  		driver.findElement(By.id("f61356")).sendKeys("852852855");
  		driver.findElement(By.id("f61357")).sendKeys("644565");
  		driver.findElement(By.id("f57653")).sendKeys("8");
  		captureScreen(driver);
  		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
	    js.executeScript("window.scrollBy(0, -500)");
  		driver.findElement(By.id("collapsetrigger-s1979")).click(); // Re
	}
}
