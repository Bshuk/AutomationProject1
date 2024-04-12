package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import uitils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		try {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\hybridframework\\src\\main\\java\\config\\config.properties");
		prop.load(ip);
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initalization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("edge")) {
			  System.setProperty("webdriver.edge.driver","E:\\Bhupesh\\Excelr\\Assignments\\Selenium Automation assignment\\Codes\\msedgedriver.exe");
			  driver = new EdgeDriver();			  
		}else if(browserName.equals("FF")) {
			System.setProperty("WebDriver.gecko.driver" , "geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);		
		driver.get(prop.getProperty("url"));
	}

}
