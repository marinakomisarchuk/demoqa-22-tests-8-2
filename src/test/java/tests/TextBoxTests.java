package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase{

    LoginPage loginPage = new LoginPage();

    @Test
    void fillFormTest() {
        loginPage.openPage()
                .bannerRemove()
                .setUserName("kms3000")
                .setPassword("A1aPassword#")
                .clickLogin();

        loginPage.checkResult("kms3000");

    }

    @Test
    void fillFormNegativeTest() {
        loginPage.openPage()
                .bannerRemove()
                .setUserName("kms3000")
                .setPassword("12345678")
                .clickLogin();

        loginPage.checkNegativeResult();

    }

}
