import com.codeborne.selenide.WebDriverRunner;

public class FacebookPage {
   /* private SelenideElement popupText =
            $("[class=\"contextual-sign-in-modal__join-now m-auto font-sans text-md text-color-text\"]");
    //private SelenideElement facebookIcon = $x("//a[contains(@href, \"facebook\")]");
    public void checkFacebookPopupText(){
        popupText.shouldBe(visible, Duration.ofSeconds(10));
        popupText.shouldHave(text("facebook"));*/
   public boolean urlContainsFacebook(){
       return WebDriverRunner.getWebDriver().getCurrentUrl().contains("facebook");
   }
}
