package pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SpreadsheetComponent {

    public void checkSpreadsheet() {
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    }

    public void checkSpreadsheetMissing() {
        $(".modal-dialog").shouldNotBe(appear);
    }

    public void availabilityСheck(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
    }

    public void absenceСheck(String key) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(" "));
    }

}

