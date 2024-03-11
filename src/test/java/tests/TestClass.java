package tests;

import config.BaseTest;
import io.qameta.allure.Allure;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

public class TestClass extends BaseTest {

    @Test
    public void test001() throws InterruptedException {
        HomePage hp = new HomePage(getDriver());
        LoginPage loginPage = hp.openTopMenu(TopMenuItem.LOGIN);
        loginPage.tryToFindAnElement();
        LetTheCarWorkPage lcwp = loginPage.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);
        lcwp.setManufacturer("BMW").addLocation("Montana")
                .setFuelType().photoAttachment("C:\\Users\\yana\\Pictures\\Saved Pictures\\BlueCar.png");


        Thread.sleep(3000);
    }
    @Test
    public void test002() throws InterruptedException {
        HomePage hp = new HomePage(getDriver());
        SignUpPage signUpPage = hp.openTopMenu(TopMenuItem.SIGN_UP);
        LetTheCarWorkPage lcwp = signUpPage.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);

        Thread.sleep(3000);
    }

}