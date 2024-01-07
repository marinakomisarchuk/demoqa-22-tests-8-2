package pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginResultComponent {

    public void goodResult(String userName) {
        $("#app").should(appear);
        $(".pattern-backgound").shouldHave(text("Profile"));
        $("#userName-value").shouldHave(text(userName));
    }

    public void wrongResult() {
        $("#name").shouldHave(text("Invalid username or password!"));
    }

}
