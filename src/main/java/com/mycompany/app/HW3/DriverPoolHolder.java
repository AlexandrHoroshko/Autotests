package com.mycompany.app.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverPoolHolder {

    private static WebDriver mfInstance;

    private static WebDriver chromeInstance;

    public synchronized static WebDriver getDriver(String expectedDriverName) throws Exception {
        WebDriver result = null;

        if (expectedDriverName.equalsIgnoreCase("CHROME")) {
            if (chromeInstance == null) {
                WebDriverManager.chromedriver().version("73").setup();
                chromeInstance = new ChromeDriver();
            }
            result = chromeInstance;
        } else if (expectedDriverName.equalsIgnoreCase("MF")) {
            if (mfInstance == null) {
                WebDriverManager.firefoxdriver().setup();
                mfInstance = new FirefoxDriver();
            }
            result = mfInstance;
        } else {
            throw new Exception("Unable to recognize expectedDriver's name "+expectedDriverName);
        }
        return result;
    }

    public static void resetSession(String expectedDriverName) throws Exception {
        if (expectedDriverName.equalsIgnoreCase("CHROME")) {
            if (chromeInstance != null) {
                chromeInstance.quit();
            }
        } else if (expectedDriverName.equalsIgnoreCase("MF")) {
            if (mfInstance != null) {
                mfInstance.quit();
            }
        } else {
            throw new Exception("Unable to recognize expectedDriver's name " + expectedDriverName);
        }
    }
}
