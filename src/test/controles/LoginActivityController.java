package test.controles;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

/**
 * Login activity controller
 * @author leobo
 *
 */
public class LoginActivityController extends Controller {

	public LoginActivityController(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		super(driver);
	}
	
	/**
	 * Click button login facebook
	 */
	public void clickLoginButton() {
		driver.findElementById("com.leandrobororo.visitapp:id/login_button").click();
	}
	
	/**
	 * Returns true if is initial login screen
	 * @return
	 */
	public boolean isInitialLoginScreen() {
		return driver.findElementById("com.leandrobororo.visitapp:id/login_button").isDisplayed();
	}
	
	/**
	 * Click WebView facebook login
	 */
	public void clickWebView() {
		driver.findElementByClassName("android.webkit.WebView").click();
	}
	
	/**
	 * Click cancel login
	 */
	public void clickCancelLogin() {
		driver.findElementByClassName("android.widget.ImageView").click();
	}
	
	/**
	 * Fills username
	 * @param nome String
	 */
	public void fillUserName(String userName) {
		driver.findElement(By.id("m_login_email")).sendKeys(userName);
	}
	
	/**
	 * Fills password
	 * @param nome String
	 */
	public void fillPassword(String password) {
		driver.findElement(By.id("m_login_password")).sendKeys(password);
	}
	
	/**
	 * Click login
	 */
	public void clickLogin() {
		driver.findElementByClassName("android.widget.Button").click();
	}
	
	/**
	 * Click confirm login
	 */
	public void clickConfirmLogin() {
		driver.findElementByClassName("android.widget.Button").click();
	}
}
