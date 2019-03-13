package com.mycompany.app.HW2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHolder {
    private static WebDriver storedDriver;

    public synchronized static WebDriver getDriver() {
        if (storedDriver == null) {
            WebDriverManager.chromedriver().version("73").setup();
            storedDriver = new ChromeDriver();
        }
        return storedDriver;
    }

    public static void resetSession() {
        storedDriver.close();
        storedDriver.quit();
        storedDriver = null;
    }

}
