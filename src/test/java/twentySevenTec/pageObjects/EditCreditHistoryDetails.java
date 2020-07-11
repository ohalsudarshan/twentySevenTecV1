package twentySevenTec.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import twentySevenTec.testCases.twentySevenBaseClass;

public class EditCreditHistoryDetails extends twentySevenBaseClass{
	
	WebDriver driver;
	public EditCreditHistoryDetails(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void EditCreditHistory() throws InterruptedException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	    Thread.sleep(2000);
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	driver.findElement(By.id("collapsetrigger-s2099")).click();
	    	Thread.sleep(2000);
	    	ScrollByPixelUp();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[27]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[28]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[29]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[30]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[31]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[32]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[33]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[34]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[35]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[36]")).click();
			ScrollByPixelUp();
//			JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
//		    js.executeScript("window.scrollBy(0, -500)");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("collapsetrigger-s2099")).click();
		        
			logger.info("DIP Credit History updated successfully");
	    }
	    else
	    {
		driver.findElement(By.id("collapsetrigger-s1907")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[36]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[37]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[38]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[39]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[40]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[41]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[42]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[43]")).click();
		
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[44]")).click();
		driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[45]")).click();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
	    js.executeScript("window.scrollBy(0, -500)");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("collapsetrigger-s1907")).click();
	        
		logger.info("Credit History updated successfully");
	}
}
	
	public void EditMulitApplicantCreditHistory() throws InterruptedException
	{
		
		String DipApp=driver.findElement(By.xpath("//h1[contains(.,'Edit Application [Decision in Principle]')]")).getText();
	    System.out.println(DipApp);
	    Thread.sleep(2000);
	    if(DipApp.equalsIgnoreCase("EDIT APPLICATION [DECISION IN PRINCIPLE]"))
	    {
	    	driver.findElement(By.id("collapsetrigger-s2099")).click();
	    	Thread.sleep(2000);
//	    	ScrollByPixelUp();
	    	
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[39]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[40]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[41]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[42]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[43]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[44]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[45]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[46]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[47]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[48]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[49]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[50]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[51]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[52]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[53]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[54]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[55]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[56]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[57]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[58]")).click();
			
			ScrollByPixelUp();
//			JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
//		    js.executeScript("window.scrollBy(0, -500)");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("collapsetrigger-s2099")).click();
		        
			logger.info("DIP Credit History updated successfully");
	    }
	   
	
}

	public void EditMulitApplicantCreditHistoryFMA() throws InterruptedException
	{
		
		Thread.sleep(2000);
		ScrollByPixel();
			driver.findElement(By.id("collapsetrigger-s1907")).click();
			Thread.sleep(2000);
			ScrollByPixelUp();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[54]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[55]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[56]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[57]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[58]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[59]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[60]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[61]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[62]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[63]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[64]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[65]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[66]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[67]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[68]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[69]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[70]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[71]")).click();
			
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[72]")).click();
			driver.findElement(By.xpath("(//label[@class='radio'][contains(.,'No')])[73]")).click();

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;	// This  will scroll up the page by  -500 pixel vertical	
		    js.executeScript("window.scrollBy(0, -500)");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("collapsetrigger-s1907")).click();
		        
			logger.info("Credit History updated successfully");
	}
}