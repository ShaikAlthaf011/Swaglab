package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;
import TestSetup.Browsersetup;
import TestSetup.LoginDataProvider;

public class VerifyData extends BussinessComponents {
@Test(dataProvider="logindta",dataProviderClass=LoginDataProvider.class)
public void VerifyData(String Username,String Password) throws IOException {
	String url=Browsersetup.Open_browser("url");
	Navigateurl(url);
	Dataprovidercredential(Username,Password);
	
}
}
