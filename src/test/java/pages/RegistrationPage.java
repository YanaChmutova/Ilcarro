package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegistrationPage extends BasePage{
    @FindBy(xpath = "//label[@for='name']") // Эта строка использует аннотацию @FindBy для поиска
    // веб-элемента на веб-странице с помощью XPath-выражения. В данном случае, элемент найден по XPath,
    // который ищет <input> элемент с атрибутом name, равным "email".
    // Найденный элемент сохраняется в переменной emailField типа WebElement.
    WebElement nameField;

    @FindBy(xpath = "//label[@for='lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//label[@for='email']") //Эта строка использует аннотацию @FindBy для поиска
    // веб-элемента на веб-странице с помощью XPath-выражения. В данном случае, элемент найден по XPath,
    // который ищет <button> элемент с атрибутом name, равным "registration".
    // Найденный элемент сохраняется в переменной registrationField типа WebElement.
    WebElement emailField;

    @FindBy(xpath = "//label[@for='password']") //Эта строка использует аннотацию @FindBy для поиска
    // веб-элемента на веб-странице с помощью XPath-выражения. В данном случае, элемент найден по XPath,
    // который ищет <button> элемент с атрибутом name, равным "login".
    // Найденный элемент сохраняется в переменной loginField типа WebElement.
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']") //Эта строка использует аннотацию @FindBy для поиска
    // веб-элемента на веб-странице с помощью XPath-выражения. В данном случае, элемент найден по XPath,
    // который ищет <button> элемент с атрибутом name, равным "registration".
    // Найденный элемент сохраняется в переменной registrationField типа WebElement.
    WebElement registrationButton;

       public RegistrationPage fillEmailField(String email){ // Этот метод заполняет поле электронной почты на веб-странице.
        // Он принимает строку email, переданную в качестве аргумента, и использует метод sendKeys(),
        // чтобы ввести эту строку в поле emailField.
        emailField.sendKeys(email);
        return  this;
    }

    public RegistrationPage clickByRegistrationButton() {
        registrationButton.click();
        return this;
    }
    public RegistrationPage fillPasswordField(String password){
        passwordField.sendKeys(password);
        return  this;
    }
    public RegistrationPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }
}
