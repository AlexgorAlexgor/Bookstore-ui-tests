import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class LoginPage {
  // private SelenideElement usernameField = $(By.cssSelector("[placeholder=\"Password\"]"));
    private SelenideElement usernameField = $("[placeholder=\"UserName\"]");
    private SelenideElement passwordField = $("[placeholder=\"Password\"]");
    private SelenideElement loginButton = $(byId("login"));

    // private  SelenideElement alertError=$(By.className("mb-1"));
    private  SelenideElement alertError=$(By.xpath("mt-4 row"));
   // private  SelenideElement alertError=$(By.id("output"));
    private  SelenideElement alertEmptyField=$(byCssSelector("mr-sm-2 is-invalid form-control"));
    private SelenideElement loginMessage=$(byTagName("h5"));
//private SelenideElement loginButton=$(byAttribute())


    //private SelenideElement alertError=$(byId("output"));

    public SelenideElement getErrorMessage(String alertErrorMessage) {
        return alertError.shouldHave(text(alertErrorMessage));
    }

    public SelenideElement getEmptyFieldMessage() {
        return alertEmptyField;
    }


    //Login in Book Store
    public SelenideElement getLoginMessage() {
        return loginMessage;
    }

    //        loginPage.getLoginMessage().shouldBe(visible);
  //  private SelenideElement alertError=$(By.partialLinkText("Invalid username or password!"));
 /*
 //   private SelenideElement loginButton = $(By.tagName("button"));
    private SelenideElement alertError = $(By.className("oxd-alert--error"));

    private SelenideElement logo = $(byAttribute("alt", "company-branding"));
    // private SelenideElement
    private SelenideElement linkedInIcon = $(byAttribute("href", "*lincedin.com*"));
   // private SelenideElement linkedinSite =$(b)
  // private SelenideElement facebookIcon = $x("//a[contains(@href, \"facebook\")]");*/
   /* private SelenideElement facebookIcon = $(byAttribute("href", "*facebook.com*"));
    private SelenideElement twitterIcon = $(byAttribute("href", "*twitter.com*"));
    private SelenideElement youtubeIcon = $(byAttribute("href", "*youtube.com*"));
*/
   /* public void linkedIconIsDisplayed() {linkedInIcon.shouldBe(visible);}

    public void linkedinGoToLinkedin(){
     //   linkedIcon.click();
        switchTo().window(1);
    }*/

  /*  public void facebookIconIsDisplayed() {facebookIcon.shouldBe(visible);}

    public void twitterIconIsDisplayed() {twitterIcon.shouldBe(visible);}

    public void youtubeIconIsDisplayed() {youtubeIcon.shouldBe(visible);}
*/
   /* public void logoImageIsCorrect() {
        logo.shouldHave(attributeMatching("src",
                ".*branding.png.*"));
    }

    public SelenideElement getLogo() {
        return logo;
    }

    public void logoIsDisplayed() {
        logo.shouldBe(visible);
    }

*/
   /* public void enterAlertError(String alertErrorValue) {
        alertError.shouldBe(visible);
    }*/

@Step("Enter user password ")
    public void enterUsername(String usernameValue) {
        usernameField.shouldBe(visible, Duration.ofSeconds(10));
        usernameField.setValue(usernameValue);
    }
    public void enterPassword(String passwordValue) {
        passwordField.setValue(passwordValue);
    }
    public void clickOnLoginButton() {
        loginButton.click();
    }

    public SelenideElement visibleLoginButton() {return loginButton;}
}
