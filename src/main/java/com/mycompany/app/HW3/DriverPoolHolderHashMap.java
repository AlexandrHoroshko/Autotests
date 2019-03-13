package com.mycompany.app.HW3;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverPoolHolderHashMap {

    private static Map<String, WebDriver> testDriverMap = new HashMap<String, WebDriver>();

    private static Map<WebDriver, String> driverTestMap = new HashMap<WebDriver, String>();

    private static Map<String, WebDriver> sessionIdDriverMap = new HashMap<String, WebDriver>();

    public static synchronized void associateTestNameWithDriver(String test, WebDriver driver) {
        testDriverMap.put(test, driver);
        driverTestMap.put(driver, test);
        String sessionId = ((RemoteWebDriver) driver).getSessionId().toString();
        sessionIdDriverMap.put(sessionId, driver);
    }
    public static synchronized WebDriver getDriverByTestName(String test) {
        return testDriverMap.get(test);
    }

    public static synchronized WebDriver getDriverBySessionId(String sessionId) {
        return sessionIdDriverMap.get(sessionId);
    }

    public static String getSessionIdByTestName(String test) {
        if (testDriverMap.containsKey(test)) {
            RemoteWebDriver driver = (RemoteWebDriver) testDriverMap.get(test);
            return driver.getSessionId().toString();
        } else {
            return null;
        }
    }

    public static String getTestNameByDriver(WebDriver driver) {
        return driverTestMap.containsKey(driver) ? driverTestMap.get(driver) : null;
    }
}