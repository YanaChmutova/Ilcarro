package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//label[@for='city']")
    WebElement cityField;
    @FindBy(xpath = "//label[@for='dates']")
    WebElement datesField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;

    public HomePage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }
}
