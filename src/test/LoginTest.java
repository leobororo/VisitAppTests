
package test;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {

	@Test
	public void testSuccessfulLogin() {
		getLoginActivityController().clickLoginButton();
		getLoginActivityController().clickWebView();
		getLoginActivityController().fillUserName("joao.martelo.marmelo@gmail.com");
		getLoginActivityController().fillPassword("1Martelo");
		getLoginActivityController().clickLogin();
		getLoginActivityController().clickConfirmLogin();
		
		Assert.assertTrue(getDashboardActivityController().isDashboardScreen());
	}
	
	@Test
	public void testCancelLogin() {
		getLoginActivityController().clickLoginButton();
		getLoginActivityController().clickCancelLogin();
		
		Assert.assertTrue(getLoginActivityController().isInitialLoginScreen());
	}
}
