package com.mycompany.app.HW5;

import com.mycompany.app.HW3.DriverPoolHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWithAnotation {

    private WebDriver driver;
    private static final String url = "https://google.com";

    public HomePageWithAnotation(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (name="q")
    WebElement SearchInput;

    @FindBy(css = "[jsname = VlcLAe] center input[name = btnK]")
    WebElement SearchButton;

    @FindBy(css = ".FPdoLc>center>input[name = btnI]")
    WebElement GoodLuckEmpty;

    @FindBy(css = "[jsname = VlcLAe] center input[name = btnI]")
    WebElement GoodLuckFillq;

    public void open() throws Exception {
        driver.get(url);
    }


    public void setText(String text) throws Exception {
        SearchInput.sendKeys(text);
    }

//    public void submitSearch() throws Exception {
//        DriverPoolHolder.getDriver("chrome").findElement(SearchInputLocator).submit();
//    }
//
//    public void clickOnSearchButton() throws Exception {
//        DriverPoolHolder.getDriver("chrome").findElement(SearchButtonLocator).click();
//    }
//
//    public void clickOnGoodLuckEmpty() throws Exception {
//        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckEmptyqLocator).click();
//    }
//
//    public void clickOnGoodLuck() throws Exception {
//        DriverPoolHolder.getDriver("chrome").findElement(GoodLuckFillqLocator).click();
//    }

}
