package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage extends BasePage{
    private List<String> namesOfSections;
    private By sections = By.xpath("//span[@class='catalog-navigation-classifier__item-title']");

    public CatalogPage(){}
    @Override
    public CatalogPage openPage(){
        driver.get("https://catalog.onliner.by/");
        return this;
    }
    public List<String> getNamesOfSections(){
        namesOfSections = new ArrayList<>();
        for (WebElement element : driver.findElements(sections)){
            namesOfSections.add(element.getText());
        }
        return namesOfSections;
    }
}
