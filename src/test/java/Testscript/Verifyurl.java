package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import ReusableComponents.BussinessComponents;
import TestSetup.Browsersetup;

public class Verifyurl extends BussinessComponents {
@Test
public void Verifyurl() throws IOException {
	String url=Browsersetup.Open_browser("url");
	Navigateurl(url);
	//LoginCredential();
	//Product();
}
}
