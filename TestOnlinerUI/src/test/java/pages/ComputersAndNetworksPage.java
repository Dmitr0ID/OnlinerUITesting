package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ComputersAndNetworksPage extends BasePage{
    private List<String> namesOfItems;
    private By section = By.xpath("//li[@class='catalog-navigation-classifier__item ' and @data-id='2']");
    private By items = By.xpath("//div[@class='catalog-navigation-list__aside-title']");

    public ComputersAndNetworksPage(){}
    @Override
    public ComputersAndNetworksPage openPage(){
        driver.get("https://catalog.onliner.by/");
        return this;
    }
    public ComputersAndNetworksPage clickSection(){
        driver.findElement(section).click();
        return this;
    }
    public List<String> getNamesOfItems(){
        namesOfItems = new ArrayList<>();
        for (WebElement element : driver.findElements(items)){
            if(element.isDisplayed()) namesOfItems.add(element.getText());
        }
        return namesOfItems;
    }
}
