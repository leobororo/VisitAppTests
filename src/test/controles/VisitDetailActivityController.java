package test.controles;

import io.appium.java_client.android.AndroidDriver;

/**
 * Visit Detail activity controller
 * @author leobo
 *
 */
public class VisitDetailActivityController extends Controller {

	public VisitDetailActivityController(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		super(driver);
	}
	
	/**
	 * Returns true if is initial details screen
	 * @return
	 */
	public boolean isDetailsScreen() {
		return driver.findElementById("com.leandrobororo.visitapp:id/buttonAmigos").isDisplayed();
	}
	
	/**
	 * Clicks on view friends button
	 */
	public void clickViewFriends() {
		driver.findElementById("com.leandrobororo.visitapp:id/buttonAmigos").click();
	}
	
	/**
	 * Clicks on view parking button
	 */
	public void clickViewParking() {
		driver.findElementById("com.leandrobororo.visitapp:id/buttonEstacionamento").click();
	}
	
	/**
	 * Returns true if it is parking screen
	 * @return
	 */
	public boolean isParkingScreen() {
		return driver.findElementById("com.google.android.apps.maps:id/compass_container").isDisplayed();
	}
}
