package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LetCarWorkPage extends BasePage {
    @FindBy(xpath = "//input[@ng-reflect-name='pickUpPlace']")
    WebElement emailField;
    @FindBy(xpath = "//label[@for='make']")
    WebElement manufactureField;
    @FindBy(xpath = "//label[@for='model']")
    WebElement modelField;
    @FindBy(xpath = "//label[@for='year']")
    WebElement yearField;
    @FindBy(xpath = "//label[@for='fuel']")
    WebElement fuelField;
    @FindBy(xpath = "//label[@for='seats']")
    WebElement seatsField;
    @FindBy(xpath = "//label[@for='class']")
    WebElement classField;
    @FindBy(xpath = "//label[@for='serialNumber']")
    WebElement serialNumberField;
    @FindBy(xpath = "//label[@for='price']")
    WebElement priceField;
    @FindBy(xpath = "//textarea[@id='about']")
    WebElement areaField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    public LetCarWorkPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

//    public void fillFormAndSave(Contact contact){
//        nameField.sendKeys(contact.getName());
//        lastnameField.sendKeys(contact.getName());
//        if(contact.getPhone().length()>=10 && contact.getPhone().length()<=15){
//            phoneField.sendKeys(contact.getPhone());
//        }
//        else{
//            throw new IllegalArgumentException("The phone number issue...");
//        }
//        emailField.sendKeys(contact.getEmail());
//        addressField.sendKeys(contact.getAddress());
//        descriptionField.sendKeys(contact.getDescription());
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text().'Save')]")));
//        saveButton.click();
//
//    }

//    public LetCarWorkPage(WebDriver driver){
//        setDriver(driver);
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
//    }
}