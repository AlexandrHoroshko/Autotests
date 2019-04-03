import HW4.HomePage;
import com.mycompany.app.HW3.DriverPoolHolder;
import org.junit.After;
import org.junit.Test;

public class TestGoogle {

    private HomePage homePage = new HomePage();

    @Test
    public void GoodLuck() throws Exception {
        homePage.open();
        homePage.getLogo();
        homePage.clickOnGoodLuckEmpty();
        Thread.sleep(1000);
    }

    @Test
    public void GoodLuckFill() throws Exception {
        homePage.open();
        homePage.getLogo();
        homePage.setText("Page object Java");
        Thread.sleep(1000);
        homePage.clickOnGoodLuck();
    }

    @Test
    public void submitSearch() throws Exception {
        homePage.open();
        homePage.setText("Page object Java");
        Thread.sleep(1000);
        homePage.submitSearch();
    }

    @Test
    public void clickSearch() throws Exception {
        homePage.open();
        homePage.setText("Page object Java");
        Thread.sleep(1000);
        homePage.clickOnSearchButton();
    }

    @After
    public void resset() throws Exception {
        DriverPoolHolder.resetSession("chrome");
    }

}
