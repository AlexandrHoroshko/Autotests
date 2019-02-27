import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestGitHub {


    @Test
    public void testGitLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        WebElement Password = driver.findElement(By.id("password"));
        WebElement Login = driver.findElement(By.id("login_field"));


        Login.sendKeys("AlexandrHoroshkoTest11");
        Password.sendKeys("zXc123aSd456");
        driver.findElement(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.application-main > div > div.col-12.col-md-8.col-lg-6.p-responsive.mt-3.border-bottom > div > div.flex-auto > div.border.rounded-1.shelf.intro-shelf.js-notice > div > div > a.btn.shelf-cta.ml-3"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#repository_name"))
                .sendKeys("Test");
        driver.findElement(By.cssSelector("#repository_public_false"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#new_repository > div.js-with-permission-fields > button"))
                .click();
        Thread.sleep(3000);
        // Удаление репозитория
        driver.findElement(By.cssSelector("#js-repo-pjax-container > div.pagehead.repohead.instapaper_ignore.readability-menu.experiment-repo-nav > nav > a:nth-child(6)"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > summary"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > details-dialog > div.Box-body.overflow-auto > form > p > input"))
                .sendKeys("Test");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#options_bucket > div.Box.Box--danger > ul > li:nth-child(4) > details > details-dialog > div.Box-body.overflow-auto > form > button"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#user-links > li:nth-child(3) > details > summary > span"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#user-links > li:nth-child(3) > details > details-menu > form > button"))
                .click();
        Thread.sleep(3000);

        driver.close();
        driver.quit();
}


}
