package com.mycompany.app.HW3;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myapp {

    public static void main(String[] args) throws Exception {
        WebDriver driver1 = DriverPoolHolder.getDriver("Chrome");

        driver1.get("https://google.com");
        String title1 = driver1.getTitle();
        System.out.println(title1);
        DriverPoolHolder.resetSession("Chrome");

        WebDriver driver2 = DriverPoolHolder.getDriver("MF");

        driver2.get("https://google.com");
        String title2 = driver2.getTitle();
        System.out.println(title2);
        DriverPoolHolder.resetSession("MF");

        System.out.println( "Hello World!" );
    }
}
