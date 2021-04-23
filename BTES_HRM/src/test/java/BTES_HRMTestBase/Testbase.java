package BTES_HRMTestBase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testbase {
	public static WebDriver driver;
	public  static Properties props;

public Testbase()

{
	try 
	{
	FileInputStream ip = new FileInputStream ("C:\\Users\\EKTA\\eclipse-workspace\\BTES_HRM\\src\\test\\java\\BTES_HRMConfiguration\\config.properties");
	props = new Properties();
	props.load(ip);
	}
	catch(IOException e)
	{
		e.getStackTrace();
	}
}
	
 public  static void initialisation()
 {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	 driver.get(props.getProperty("url"));
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 
	
	 
 }
 public static void terminate()
 {
	 driver.close();
 }
}