package test.controles;

import io.appium.java_client.android.AndroidDriver;

/**
 * Classe base para a criação de uma classe concreta de controle de uma tela do aplicativo
 * @author leobo
 *
 */
public abstract class Controller {

	/**
	 * driver para o aplicativo
	 */
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	
	public Controller(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		this.driver = driver;
	}
}
