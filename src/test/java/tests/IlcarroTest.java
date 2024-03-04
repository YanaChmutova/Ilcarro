package tests;

import config.BaseTest;
import helpers.TopMenuItem;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;

public class IlcarroTest extends BaseTest {

    @Test
    @Parameters("browser")
    public void ilcarroTest_001(String browser) throws InterruptedException {
        MainPage mainPage = new MainPage(getDriver());
        RegistrationPage registrationPage = mainPage.openTopMenu(TopMenuItem.LOGIN.toString());
        registrationPage.fillEmailField("yanhik03@mail.ru").clickByRegistrationButton();
        Thread.sleep(5000);

    }
}