package com.mycompany.app.HW4;

import com.mycompany.app.HW3.DriverPoolHolder;
import org.openqa.selenium.By;

public class HomePage {

    private By SearchInputLocator = By.name("q");
    private By GoogleIconLocator = By.id("hplogo");
    private By SearchButtonLocator = By.cssSelector("[jsname = VlcLAe] center input[name = btnK]");
    private By GoodLuckEmptyqLocator = By.cssSelector(".FPdoLc>center>input[name = btnI]");
    private By GoodLuckFillqLocator = By.cssSelector("[jsname = VlcLAe] center input[name = btnI]");

    private static final String url = "https://google.com";

    public void open() throws Exception {
        DriverPoolHolder.getDriver("chrome").get(url);
    }

    public void getLogo() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(GoogleIconLocator);
    }

    public void setText(String text) throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchInputLocator).sendKeys(text);
    }

    public void submitSearch() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchInputLocator).submit();
    }

    public void clickOnSearchButton() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(SearchButtonLocator).click();
    }

    public void clickOnGoodLuckEmpty() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckEmptyqLocator).click();
    }

    public void clickOnGoodLuck() throws Exception {
        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckFillqLocator).click();
    }

}
