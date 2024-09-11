package Orpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents {

	
	@FindBy(xpath="//input[@id='user-name']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement Login;
	
	@FindBy(xpath="//div[@class='product_label']")
	public WebElement Product;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Enterusername(WebElement element,String Text) {
		TechnicalComponents.Sendkeys(element, Text);
	}
	public void EnterPassword(WebElement element,String Text) {
		TechnicalComponents.Sendkeys(element, Text);
		
	}
	public void LoginButton(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-button']")));
		TechnicalComponents.Click(element);
		
	}
	public static String gettext(WebElement element,String Text) {
		String str=TechnicalComponents.Text(element, Text);
		return str;
		
	}

}
