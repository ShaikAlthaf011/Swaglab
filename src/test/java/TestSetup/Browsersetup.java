package TestSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browsersetup {
	public static WebDriver driver;
	public static Properties ps;
	
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	driver=new ChromeDriver();
	
}
@AfterMethod
public void Teardown() {
	if(driver!=null) {
		driver.quit();
	}
}
public static String Open_browser(String Browser) throws IOException {
	File f=new File(System.getProperty("user.dir")+"//Configuration.properties");
	FileInputStream fis=new FileInputStream(f);
	ps=new Properties();
	ps.load(fis);
	String str=ps.getProperty(Browser);
	return str;
}
}
