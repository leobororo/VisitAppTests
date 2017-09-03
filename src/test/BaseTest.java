package test;

import static test.controles.ControllerType.FRIENDS_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.DASHBOARD_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.VIEW_VISIT_DETAILS_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.LOGIN_ACTIVITY_CONTROLLER;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import test.controles.FriendsActivityController;
import test.controles.DashboardActivityController;
import test.controles.VisitDetailActivityController;
import test.controles.LoginActivityController;
import test.controles.ControlesFactory;


/**
 * Classe abstrata base para os testes do aplicativo
 * @author leobo
 *
 */
public class BaseTest {

	private static final String APP_NAME = "app-debug.apk";
	private static final String APP_PATH = "C:\\Users\\leobo\\pos_graduacao\\TCC";
	private static final String DEVICE_NAME = "0020145262";
	
	@SuppressWarnings("rawtypes")
	private AndroidDriver driver;
	
	private ControlesFactory factory;
	
	@SuppressWarnings("rawtypes")
	@Before
	public void setUp() {
		File appDir = new File(APP_PATH);
		File appName = new File(appDir, APP_NAME);
		
		DesiredCapabilities capabilities = obterDesiredCapabilities(appName);
		
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			factory = new ControlesFactory(driver);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Cria o objeto DesiredCapabilities com as configurações necessárias
	 * @param appName File
	 * @return DesiredCapabilities
	 */
	private DesiredCapabilities obterDesiredCapabilities(File appName) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.APP, appName.getAbsolutePath());
		
		return capabilities;
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	/**
	 * Returns DashboardActivityController controller
	 * @return DashboardActivityController
	 */
	protected DashboardActivityController getDashboardActivityController() {
		return (DashboardActivityController) factory.obterControle(DASHBOARD_ACTIVITY_CONTROLLER);
	}
	
	/**
	 * Returns FriendsActivityController controller
	 * @return FriendsActivityController
	 */
	protected FriendsActivityController getFriendsActivityController() {
		return (FriendsActivityController) factory.obterControle(FRIENDS_ACTIVITY_CONTROLLER);
	}
	
	/**
	 * Returns VisitDetailActivityController controller
	 * @return VisitDetailActivityController
	 */
	protected VisitDetailActivityController getVisitDetailActivityController() {
		return (VisitDetailActivityController) factory.obterControle(VIEW_VISIT_DETAILS_ACTIVITY_CONTROLLER);
	}
	
	/**
	 * Returns LoginActivityController controller
	 * @return LoginActivityController
	 */
	protected LoginActivityController getLoginActivityController() {
		return (LoginActivityController) factory.obterControle(LOGIN_ACTIVITY_CONTROLLER);
	}
}
