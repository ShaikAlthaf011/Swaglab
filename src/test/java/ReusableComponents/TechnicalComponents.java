package ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import TestSetup.Browsersetup;

public class TechnicalComponents extends Browsersetup {
public static void Verifyurl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
public static void Sendkeys(WebElement element,String Text) {
	element.sendKeys(Text);
}
public static void Click(WebElement element) {
	element.click();
}
public static String Text(WebElement element,String Text) {
	element.getText();
	return Text;
	
}

}
