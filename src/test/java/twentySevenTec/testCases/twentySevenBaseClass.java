package twentySevenTec.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class twentySevenBaseClass {
	
	public String baseURL="https://stagingmortgageapply.twenty7tec.com/Account/Login";
	public String username="27Tectestadviser@element21.co.uk";
	public String password="Capita@006";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
//		System.setProperty("webdriver.gecko.driver","C://Sudarshan//Automation//MavenProject//twentySevenTecV1//Drivers//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();

		logger=Logger.getLogger("TwentySevenTec");
		PropertyConfigurator.configure("log4j.properties");
	}
	

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
