
package test;

import org.junit.Assert;
import org.junit.Test;

public class LogoutTest extends BaseTest {

	@Test
	public void testLogout() {
		getLoginActivityController().clickLoginButton();
		getLoginActivityController().clickWebView();
		getLoginActivityController().fillUserName("joao.martelo.marmelo@gmail.com");
		getLoginActivityController().fillPassword("1Martelo");
		getLoginActivityController().clickLogin();
		getLoginActivityController().clickConfirmLogin();

		getDashboardActivityController().clickSettings();
		getDashboardActivityController().clickSair();
		
		Assert.assertTrue(getLoginActivityController().isInitialLoginScreen());
	}
}
