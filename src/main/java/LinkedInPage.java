import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LinkedInPage {
    private SelenideElement popupText =
        $("[class=\"contextual-sign-in-modal__join-now m-auto font-sans text-md text-color-text\"]");

    public void checkLinkedInPopupText(){
        popupText.shouldBe(visible, Duration.ofSeconds(10));
        popupText.shouldHave(text("LinkedIn"));

    }
}
