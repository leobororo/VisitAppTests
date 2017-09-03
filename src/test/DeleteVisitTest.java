package test;

import org.junit.Assert;
import org.junit.Test;

public class DeleteVisitTest extends BaseTest {

	@Test
	public void testAddVisit() {
		getLoginActivityController().clickLoginButton();
		getLoginActivityController().clickWebView();
		getLoginActivityController().fillUserName("joao.martelo.marmelo@gmail.com");
		getLoginActivityController().fillPassword("1Martelo");
		getLoginActivityController().clickLogin();
		getLoginActivityController().clickConfirmLogin();

		getDashboardActivityController().clickAddButton();
		getDashboardActivityController().clickSearchFrame();
		getDashboardActivityController().fillSearchText("Mineirao");
		getDashboardActivityController().selectFirstPrediction();
		getDashboardActivityController().clickConfirmPlace();
		getDashboardActivityController().selectLastDay();
		getDashboardActivityController().clickOk();
		getDashboardActivityController().selectRadialPicker(18);
		getDashboardActivityController().clickOk();
		getDashboardActivityController().selectRadialPicker(20);
		getDashboardActivityController().clickOk();
		
		getDashboardActivityController().clickYesFollowUpFriends();
		
		getDashboardActivityController().swipeFirstVisit();
		getDashboardActivityController().clickExcluir();
		
		getDashboardActivityController().clickOk();
		
		Assert.assertTrue("Delete visit failed", getDashboardActivityController().getNuberOfElementsListView() == 0);
		
	}
}
