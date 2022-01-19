package pages;

import org.openqa.selenium.WebDriver;
import util.WebDriverRunner;

public abstract class BasePage {
    protected WebDriver driver = WebDriverRunner.getDriver();
    public abstract BasePage openPage();
}
