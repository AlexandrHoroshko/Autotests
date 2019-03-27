package HW4;

import com.mycompany.app.HW3.DriverPoolHolder;
import org.openqa.selenium.By;

public class HomePage {

    By SearchInputLocator = By.name("q");
    By GoogleIconLocator = By.id("hplogo");
    By SearchButtonLocator = By.cssSelector("[jsname = VlcLAe] center input[name = btnK]");
    By GoodLuckEmptyqLocator = By.cssSelector(".FPdoLc>center>input[name = btnI]");
    By GoodLuckFillqLocator = By.cssSelector("[jsname = VlcLAe] center>input[name = btnI]");

    private HomePage setText(String text) throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchInputLocator).sendKeys(text);
        return this;
    }

    private void submitSearch() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchInputLocator).submit();
    }

    private void clickOnSearchButton() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchButtonLocator).click();
    }

    private void clickOnGoodLuckEmpty() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckEmptyqLocator);
    }

    private void clickOnGoodLuck() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckFillqLocator).click();
    }

}
