package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Myapp {

    public static void main(String[] args) throws Exception {

        DriverHolder.getDriver().get("https://google.com");

        String title = DriverHolder.getDriver().getTitle();
        System.out.println(title);
        DriverHolder.resetSession();

        System.out.println( "Hello World!" );
    }
}
