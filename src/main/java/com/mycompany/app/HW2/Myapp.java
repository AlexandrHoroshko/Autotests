package com.mycompany.app.HW2;

public class Myapp {

    public static void main(String[] args) throws Exception {

//        WebDriver driver = DriverHolder.getDriver();

        DriverHolder.getDriver().get("https://google.com");
        String title = DriverHolder.getDriver().getTitle();
        System.out.println(title);

        DriverHolder.resetSession();

        System.out.println( "Hello World!" );
    }
}
