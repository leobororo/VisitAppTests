package test.controles;

import io.appium.java_client.android.AndroidDriver;

/**
 * Friends activity controller
 * @author leobo
 *
 */
public class FriendsActivityController extends Controller {

	public FriendsActivityController(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		super(driver);
	}
	
	/**
	 * Returns true if it is friends screen
	 * @return
	 */
	public boolean isFriendsScreen() {
		return driver.findElementById("com.leandrobororo.visitapp:id/listAmigos").isDisplayed();
	}
}
