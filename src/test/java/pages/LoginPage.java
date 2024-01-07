package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.LoginResultComponent;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    LoginResultComponent result = new LoginResultComponent();

    SelenideElement titleLabel = $(".login-wrapper"),
            userNameInput = $("#userName"),
            passwordInput = $("#password"),
            loginButton = $("#login");



    public LoginPage openPage() {
        open("/login");
        titleLabel.shouldHave(text("Welcome,"));
        titleLabel.shouldHave(text("Login in Book Store"));

        return this;
    }

    public LoginPage bannerRemove() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public LoginPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public LoginPage setPassword(String value) {
        passwordInput.setValue(value);

        return this;
    }

    public LoginPage clickLogin() {
        loginButton.click();

        return this;
    }

    public LoginPage checkResult(String userName) {
        result.goodResult(userName);

        return this;
    }

    public LoginPage checkNegativeResult() {
        result.wrongResult();

        return this;
    }

}

