package test.controles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

/**
 * Controller para a tela principal do aplicativo
 * @author leobo
 *
 */
public class DashboardActivityController extends Controller {

	public DashboardActivityController(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		super(driver);
	}
	
	/**
	 * Returns true if is initial dashboard screen
	 * @return
	 */
	public boolean isDashboardScreen() {
		return driver.findElementById("com.leandrobororo.visitapp:id/login_button").isDisplayed();
	}
	
	/**
	 * Clicks add button
	 */
	public void clickAddButton() {
		driver.findElementById("com.leandrobororo.visitapp:id/login_button").click();
	}
	
	/**
	 * Clicks add button
	 */
	public void clickSearchFrame() {
		driver.findElementById("com.google.android.gms:id/search_bar").click();
	}
	
	/**
	 * Fills search text
	 * @param nome String
	 */
	public void fillSearchText(String searchText) {
		driver.findElement(By.id("com.google.android.gms:id/edit_text")).sendKeys(searchText);
	}
	
	/**
	 * Select first prediction
	 */
	public void selectFirstPrediction() {
		((WebElement) driver.findElementByClassName("android.support.v7.widget.RecyclerView").findElements(By.className("android.widget.TextView")).get(0)).click();
	}
	
	/**
	 * Click settings
	 */
	public void clickConfirmPlace() {
		driver.findElementById("com.google.android.gms:id/confirm_button").click();
	}
	
	/**
	 * Select last day of month
	 */
	public void selectLastDay() {
		List<WebElement> dayViews = driver.findElementById("android:id/month_view").findElements(By.className("android.view.View"));
		
		if (dayViews.size() == 28) {
			((WebElement) dayViews.get(27)).click();
		} else if (dayViews.size() == 29) {
			((WebElement) dayViews.get(28)).click();
		} else if (dayViews.size() == 30) {
			((WebElement) dayViews.get(29)).click();
		} else if (dayViews.size() == 31) {
			((WebElement) dayViews.get(30)).click();
		}
	}
	
	/**
	 * Click settings
	 */
	public void clickOk() {
		driver.findElementById("android:id/button1").click();
	}
	
	/**
	 * Follow up friends yes
	 */
	public void clickYesFollowUpFriends() {
		driver.findElementById("android:id/button1").click();
	}
	
	/**
	 * Select radial picker
	 */
	public void selectRadialPicker(int number) {
		List<WebElement> views = driver.findElementById("android:id/radial_picker").findElements(By.className("android.widget.RadialTimePickerView$RadialPickerTouchHelper"));
		((WebElement) views.get(number)).click();

	}
	
	/**
	 * Return number of elements in the list view
	 * @return int
	 */
	public int getNuberOfElementsListView() {
		return driver.findElementsById("com.leandrobororo.visitapp:id/imgVisitPlace").size();
	}
	
	/**
	 * Swipe first visit
	 */
	public void swipeFirstVisit() {
		driver.swipe(8, 128, 472, 302, 1000);
	}
	
	/**
	 * Click Excluir
	 */
	public void clickExcluir() {
		((WebElement)driver.findElementsByClassName("android.widget.TextView").get(1)).click();
	}
	
	/**
	 * Click Abrir
	 */
	public void clickAbrir() {
		((WebElement)driver.findElementsByClassName("android.widget.TextView").get(0)).click();
	}
	
	/**
	 * Click settings
	 */
	public void clickSettings() {
		driver.findElementByClassName("android.widget.ImageView").click();
	}
	
	/**
	 * Click Configuracoes
	 */
	public void clickConfiguracoes() {
		((WebElement) driver.findElementsByClassName("android.widget.LinearLayout").get(0)).click();
	}
	
	/**
	 * Click Sair
	 */
	public void clickSair() {
		((WebElement) driver.findElementsByClassName("android.widget.LinearLayout").get(1)).click();
	}
	
	/**
	 * Simula o click no floating action button
	 */
	public void clicarNoFabDeAdicao() {
		driver.findElementById("com.cadastro.projeto.cadastro:id/fab").click();
	}

	/**
	 * Seleciona um item do listview
	 * @param indice int
	 */
	public void selecionarItem(int indice) {
		((WebElement) driver.findElementsById("com.cadastro.projeto.cadastro:id/avatar").get(indice)).click();
	}
	
	/**
	 * Clica no botão de remoção de um item do listview
	 * @param indice int
	 */
	public void removerItem(int indice) {
		((WebElement) driver.findElementsById("com.cadastro.projeto.cadastro:id/btnRemove").get(indice)).click();
	}
	
	/**
	 * Devolve a idade de um item do listview
	 * @param indice int
	 * @return String idade
	 */
	public String obterIdadeItem(int indice) {
		return ((WebElement) driver.findElementsById("com.cadastro.projeto.cadastro:id/txtIdade").get(indice)).getText();
	}
	
	/**
	 * Devolve o endereço de um item do listview
	 * @param indice int
	 * @return String endereço
	 */
	public String obterEnderecoItem(int indice) {
		return ((WebElement) driver.findElementsById("com.cadastro.projeto.cadastro:id/txtEndereco").get(indice)).getText();
	}
	
	/**
	 * Devolve o nome de um item do listview
	 * @param indice int
	 * @return String nome
	 */
	public String obterNomeItem(int indice) {
		return ((WebElement) driver.findElementsById("com.cadastro.projeto.cadastro:id/txtNome").get(indice)).getText();
	}
	
	/**
	 * Devolve o número de itens no listview
	 * @return int número de itens no listview
	 */
	public int obterNumeroElementosListView() {
		return driver.findElementsById("com.cadastro.projeto.cadastro:id/txtNome").size();
	}
}
