package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRunner {
    private static WebDriver driver;
    private WebDriverRunner(){}
    private static void initDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\TestOnlinerUI\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static WebDriver getDriver(){
        if (driver==null) {
            initDriver();}
        return driver;
    }
    public static void close(){
        driver.quit();
        driver = null;
    }
}
