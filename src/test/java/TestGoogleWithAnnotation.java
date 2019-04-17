import com.mycompany.app.HW3.DriverPoolHolder;
import com.mycompany.app.HW5.HomePageWithAnotation;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestGoogleWithAnnotation {


    private WebDriver driver = DriverPoolHolder.getDriver("chrome");

    private HomePageWithAnotation homePage = new HomePageWithAnotation(driver);

    public TestGoogleWithAnnotation() throws Exception {
    }

    @Test
    public void GoodLuck() throws Exception {
        homePage.open();
        Thread.sleep(1000);
        homePage.clickOnGoodLuckEmpty();
    }

    @Test
    public void GoodLuckFill() throws Exception {
        homePage.open();
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
    public void reset() throws Exception {
        DriverPoolHolder.resetSession("chrome");
    }

}
