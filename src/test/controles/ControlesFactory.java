package test.controles;

import static test.controles.ControllerType.FRIENDS_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.DASHBOARD_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.VIEW_VISIT_DETAILS_ACTIVITY_CONTROLLER;
import static test.controles.ControllerType.LOGIN_ACTIVITY_CONTROLLER;

import java.util.HashMap;
import java.util.Map;

import io.appium.java_client.android.AndroidDriver;

/**
 * Implementação do padrão Factory para subtipos da classe abstrata Controller
 * @author leobo
 *
 */
public class ControlesFactory {
	
	private Map<ControllerType, Controller> MAPA_CONTROLES = new HashMap<>();
	
	public ControlesFactory(AndroidDriver<?> driver) {
		MAPA_CONTROLES.put(VIEW_VISIT_DETAILS_ACTIVITY_CONTROLLER, new VisitDetailActivityController(driver));
		MAPA_CONTROLES.put(FRIENDS_ACTIVITY_CONTROLLER, new FriendsActivityController(driver));
		MAPA_CONTROLES.put(DASHBOARD_ACTIVITY_CONTROLLER, new DashboardActivityController(driver));
		MAPA_CONTROLES.put(LOGIN_ACTIVITY_CONTROLLER, new LoginActivityController(driver));
	}

	/**
	 * Devolve um controle do tipo especificado
	 * @param tipoControle ControllerType
	 * @return Controller um controle do tipo especificado
	 */
	public Controller obterControle(ControllerType tipoControle) {
		return MAPA_CONTROLES.get(tipoControle);
	}
}
