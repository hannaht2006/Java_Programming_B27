package day49_functional_interface.driver;

import day49_functional_interface.ConfigReader;

import java.util.concurrent.TimeUnit;

public class Driver {

    //constructor to create an object
    private Driver(){}
    /*
    Q: why is the constructor private?
    private mean only accessible in the same class. constructor is used to created object

    so, I can not create object outside the class
     */
    private static WebDriver driver;

    /*
    private : only access inside the class
    static: don't need an object to use.

    default of driver: null
     */

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    //rest of the code for chrome

//                driver.manage().window().maximize();
//                driver.manage().timeout().implicitlyWait(10, TimeUnit.SECOND):
                    break;

                case "firefox":
                    driver = new FireFoxDriver();
                    //rest of the code for firefox
            }
        }
            return driver;
        }

}
//Driver.getDriver().get("google")