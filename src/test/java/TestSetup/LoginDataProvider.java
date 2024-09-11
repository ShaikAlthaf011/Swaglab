package TestSetup;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
@DataProvider(name="logindta")
public Object[][]getdata(){
	return new Object[][] {
		{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"locked_out_user","standard_user"},
		{"problem_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"},
		{"standard_user","secret_sauces"},
		{"123456","secret_sauce"},
		{"123456789","secret_sauce"},
		{"123457877","secret_sauce"},
		{"122122114","secret_sauce"}
	};
}
}
