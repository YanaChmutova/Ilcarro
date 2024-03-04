package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        setDriver(driver);
        driver.get("https://ilcarro.web.app/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public <T extends BasePage> T openTopMenu(String topMenuItem) {
        WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'" + topMenuItem + "')]"));
        menuItem.click();

        switch (topMenuItem) {
            case "search":
                return (T) new HomePage(driver);
            case "let-car-work":
                return (T) new LetCarWorkPage(driver);
            case "terms-of-use":
                return (T) new TermsOfUse(driver);
            case "registration":
                return (T) new RegistrationPage(driver);
            case "login":
                return (T) new LoginPage(driver);

            default:
                throw new IllegalArgumentException("Something wrong" + topMenuItem);

        }
    }
}