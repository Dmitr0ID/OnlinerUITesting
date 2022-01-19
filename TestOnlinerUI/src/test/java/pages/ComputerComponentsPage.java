package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ComputerComponentsPage extends BasePage{
    private By section = By.xpath("//li[@class='catalog-navigation-classifier__item ' and @data-id='2']");
    private By item = By.xpath("//div[text()=' Комплектующие ']");
    private By titles = By.xpath("//span[@class='catalog-navigation-list__dropdown-title']");
    private By descriptions = By.xpath("//span[@class='catalog-navigation-list__dropdown-description']");


    public ComputerComponentsPage(){}
    @Override
    public ComputerComponentsPage openPage(){
        driver.get("https://catalog.onliner.by/");
        return this;
    }
    public ComputerComponentsPage goToComponents() {
        driver.findElement(section).click();
        driver.findElement(item).click();
        return this;
    }
    public boolean checkTitles(){
        boolean noMissingTitles = true;
        for (WebElement element : driver.findElements(titles)){
            if(element.isDisplayed()){
                if(element.getText().isEmpty()){
                    noMissingTitles = false;
                    break;
                }
            }
        }
        return noMissingTitles;
    }
    public boolean checkDescriptions(){
        boolean noMissingDescriptions = true;
        for (WebElement element : driver.findElements(descriptions)){
            if(element.isDisplayed()){
                if(element.getText().isEmpty()){
                    noMissingDescriptions = false;
                    break;
                }
            }
        }
        return noMissingDescriptions;
    }
}
