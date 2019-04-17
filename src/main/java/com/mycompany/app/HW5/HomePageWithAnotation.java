package com.mycompany.app.HW5;

import com.mycompany.app.HW3.DriverPoolHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWithAnotation {


    private static final String url = "https://google.com";
    private WebDriver driver;

    @FindBy (name="q")
    private WebElement SearchInput;

    @FindBy(css = "[jsname = VlcLAe] center input[name = btnK]")
    private WebElement SearchButton;

    @FindBy(css = ".FPdoLc>center>input[name = btnI]")
    private WebElement GoodLuckEmpty;

    @FindBy(css = "[jsname = VlcLAe] center input[name = btnI]")
    private WebElement GoodLuckFillq;

    public HomePageWithAnotation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() throws Exception {
        driver.get(url);
    }


    public void setText(String text) {
        SearchInput.sendKeys(text);
    }

    public void submitSearch() {
        SearchInput.submit();
    }

    public void clickOnSearchButton() {
        SearchButton.click();
    }

    public void clickOnGoodLuckEmpty() {
        GoodLuckEmpty.click();
    }

    public void clickOnGoodLuck() {
        GoodLuckFillq.click();
    }

}
