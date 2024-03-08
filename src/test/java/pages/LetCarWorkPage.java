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
    @FindBy(xpath = "//input[@placeholder='Enter your address']")
    WebElement emailField;
    @FindBy(xpath = "//label[contains(text(),'Manufacture')]")
    WebElement manufactureField;
    @FindBy(xpath = "//label[contains(text(),'Model')]")
    WebElement modelField;
    @FindBy(xpath = "//label[contains(text(),'Year')]")
    WebElement yearField;
    @FindBy(xpath = "//label[contains(text(),'Fuel')]")
    WebElement fuelField;
    @FindBy(xpath = "//label[contains(text(),'Seats')]")
    WebElement seatsField;
    @FindBy(xpath = "//label[contains(text(),'Car class')]")
    WebElement classField;
    @FindBy(xpath = "//label[contains(text(),'Car registration number')]")
    WebElement serialNumberField;
    @FindBy(xpath = "//label[contains(text(),'Price')]")
    WebElement priceField;
    @FindBy(xpath = "//textarea[@id='about']")
    WebElement areaField;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
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