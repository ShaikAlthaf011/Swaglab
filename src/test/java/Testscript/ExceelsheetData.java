package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;
import ReusableComponents.DataProviders;
import TestSetup.Browsersetup;

public class ExceelsheetData extends BussinessComponents {
@Test(dataProvider="logindata",dataProviderClass=DataProviders.class)
public void ExceelsheetData(String username,String password) throws IOException {
	String url=Browsersetup.Open_browser("url");
	Navigateurl(url);
	SwagExcelsheet(username.trim(),password.trim());
}
}
