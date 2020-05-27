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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
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
		String generatedstring2=RandomStringUtils.randomNumeric(5);
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
	
}
