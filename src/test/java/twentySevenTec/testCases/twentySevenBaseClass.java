package twentySevenTec.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class twentySevenBaseClass {
	
	public String baseURL="https://stagingmortgageapply.twenty7tec.com/Account/Login?ReturnUrl=%2F";
	public String username="27Tectestadviser@element21.co.uk";
	public String password="Capita@006";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C://Sudarshan//Automation//MavenProject//twentySevenTecV1//Drivers//geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
	//	driver.get(baseURL);
		
	//	C:\Sudarshan\Automation\MavenProject\twentySevenTecV1\Drivers\geckodriver.exe
	}
	

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
