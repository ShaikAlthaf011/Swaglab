package ReusableComponents;

import org.testng.Assert;

import Orpage.Loginpage;

public class BussinessComponents extends TechnicalComponents {
public static Loginpage lp;

public static void Navigateurl(String url) {
	TechnicalComponents.Verifyurl(url);
	lp=new Loginpage(driver);
}
public void LoginCredential() {
	lp=new Loginpage(driver);
	lp.EnterPassword(lp.username,"standard_user");
	lp.Enterusername(lp.password,"secret_sauce");
	lp.LoginButton(lp.Login);
}
public void Product() {
	lp=new Loginpage(driver);
String str=	lp.gettext(lp.Product,"Products");
System.out.println(str);

}
public void Dataprovidercredential(String Username,String Password) {
	lp=new Loginpage(driver);
	lp.Enterusername(lp.username,Username);
	lp.EnterPassword(lp.password, Password);
	lp.LoginButton(lp.Login);
}
public void SwagExcelsheet(String username,String password) {
	lp=new Loginpage(driver);
	lp.Enterusername(lp.username,username);
	lp.EnterPassword(lp.password, password);
	lp.LoginButton(lp.Login);
}
}
