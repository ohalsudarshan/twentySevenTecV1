package twentySevenTec.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import twentySevenTec.utilities.ReadConfig;


public class twentySevenBaseClass{
	
	ReadConfig rc=new ReadConfig();
	
	public String baseURL=rc.getApplicationURL();
	public String username=rc.getUsername();
	public String password=rc.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
//		System.setProperty("webdriver.gecko.driver","C://Sudarshan//Automation//MavenProject//twentySevenTecV1//Drivers//geckodriver.exe");
		logger=Logger.getLogger("TwentySevenTec");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.getChromePath());
			driver= new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",rc.getFirefoxpath());
			driver= new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",rc.getIEPath());
			driver= new InternetExplorerDriver();
		}
				
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void tearDown()
	{
//		driver.close();
	}
	
	public void captureScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+randomString()+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}	
	
	public void ClickonStartButton()
	{
		driver.findElement(By.id("startBtn")).click();
	}
	public String randomString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}
	
	public String randomNumber()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(6);
		return (generatedstring2);
	}
	
	public boolean isAlertPresent()	//user defined method to check alert is present on not
	{	try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	public void SearchMortgageBtn()
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[2]/div/div/div[3]/div/div/footer/section/button")).click();
	}
	
	public void SelApplicationTypeFMA() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div[3]/section/section[1]/div/article/div/div/div[2]/button[2]")).click();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Boolean apptype= driver.getPageSource().contains("Full Mortgage Application");
		
		if(apptype==true)
			
		{
			logger.info("Full Mortgage Application Selected");
		}
		captureScreen(driver);
	}
	public void SelApplicationTypeDIP() throws IOException
	{
		driver.findElement(By.xpath("/html/body/div[3]/section/section[1]/div/article/div/div/div[2]/button[1]")).click();		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Boolean apptype= driver.getPageSource().contains("Decision In Principle");
		
		if(apptype==true)
			
		{
			logger.info("Decision In Principle Application Selected");
		}
		captureScreen(driver);
	}
	
	public void getAddress() throws InterruptedException, IOException
	{
		
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div[3]/form/div/div[2]/div[2]/div/div/fieldset/div/div/div[31]/div/div[1]/div/div[1]/span[2]/button")).click();
		System.out.println("clicked on address");
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			logger.info("on address details page");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"modalAddressform\"]/div[2]/div/fieldset/div[11]/div/button[1]")).click();
			captureScreen(driver);
			System.out.println("Moved to address details page");
			Thread.sleep(3000);
			driver.findElement(By.id("FlatNumber")).sendKeys("1");
			driver.findElement(By.id("BuildingName")).sendKeys("1 Warwick Apartments");
			driver.findElement(By.id("BuildingNumber")).sendKeys("1");
			driver.findElement(By.id("StreetName")).sendKeys("Warwick Place");
			driver.findElement(By.id("Town")).sendKeys("Cheltenham");
			driver.findElement(By.id("County")).sendKeys("Gloucestershire");
			Thread.sleep(3000);
			driver.findElement(By.id("CountryId_button")).click();
			driver.findElement(By.linkText("United Kingdom")).click();
			logger.info("Address Details updated successfully");
		}
	
		
		
	}
	
}
