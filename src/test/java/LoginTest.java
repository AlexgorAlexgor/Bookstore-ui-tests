import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertTrue;

public class LoginTest extends BaseTest {


    @Test
    @Category(Smoke.class)
    public void successLogin() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("Alexgor0!");
        loginPage.clickOnLoginButton();
        profilePage.openProfilePageIsDisplaeyd();
    }

    @Test
    public void invalidPassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("Bad_pass!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
                //.shouldHave(text("Invalid username or password!"));
    }
    @Test
    public void invalidEmailFormat() {
        loginPage.enterUsername("alexgorgmx.de");
        loginPage.enterPassword("Alexgor0!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void invalidWithoutDigitPassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("Alexgor!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void invalidWithoutUppercasePassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("alexgor0!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void invalidWithoutLowecasePassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("ALEXGOR0!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void invalidWithoutSpecialCharacterPassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("Alexgor0");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void invalidShortThat8CharacterPassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("Alexg0!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorMessage("Invalid username or password!");
        //.should(text("Invalid username or password!"));
    }
    @Test
    public void emptyUsername() {
        loginPage.enterUsername("");
        loginPage.enterPassword("Alexgor0!");
        loginPage.clickOnLoginButton();
        loginPage.getEmptyFieldMessage().shouldBe(visible);
    }
    @Test
    public void emptyPassword() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.getEmptyFieldMessage().shouldBe(visible);
    }
    @Test
    public void successLogout() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.getEmptyFieldMessage().shouldBe(visible);
        profilePage.clickOnLogoutButton();
        loginPage.getLoginMessage().shouldBe(visible);
    }
  /*  @Test
    public void registrationNewUser() {
        loginPage.enterUsername("alexgor@gmx.de");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.getEmptyFieldMessage().shouldBe(visible);
        profilePage.clickNewUserButton();
        registerPage.enterFirstName("Max");
        registerPage.enterLastName("Mask");

        registerPage.enterUsername("alexgor@gmx.de");
        registerPage.enterPassword("");

//Please verify reCaptcha to register!
    }*/
  /*@Test
  public void registrationNewUserWithEmptyUserNameField() {
      loginPage.enterUsername("");
      loginPage.enterPassword("");
      loginPage.clickOnLoginButton();
      loginPage.getEmptyFieldMessage().shouldBe(visible);
      profilePage.clickNewUserButton();
      registerPage.enterFirstName("Max");
      registerPage.enterLastName("Mask");

      registerPage.enterUsername("alexgor@gmx.de");
      registerPage.enterPassword("");}*/
/*   @Test
    public void invalidPasswordWithoutPO() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        $(By.name("username")).setValue("Admin");
        $("[placeholder=\"Password\"]").setValue("sdvdsvsd");
        $(By.tagName("button")).click();
        $(className("oxd-alert--error")).shouldBe(visible).shouldHave(text("Invalid credentials"));
    }*/
   /* //@Test
    public void forgotYourPassword() {
    }

    public void elementAreVisible() {
        // loginPage.getLogo().shouldBe(visible);
        // loginPage.logoImageIsCorrect();
        loginPage1.logoIsDisplayed();
        loginPage1.logoImageIsCorrect();

        //linked in icon  is displayed
        loginPage1.linkedIconIsDisplayed();

        //facebook icon  is displayed
        loginPage1.facebookIconIsDisplayed();
        //twitter icon  is displayed
        loginPage1.twitterIconIsDisplayed();
        // youtube icon  is displayed
        loginPage1.youtubeIconIsDisplayed();
    }

    public void clickOnLinkedInIcon() {
        //    linkedinIcon.shouldBe(visible, Duration.ofSeconds(10));
        //  linkedinIcon.click();
    }

    //    @Test
//    public void clickLinkedIn
//private SelenideElement facebookIcon = $x("//a[contains(@href, \"facebook\")]");
   *//* @Test
    public void linksAreValid() {
        loginPage.cl();
        switchToTab(1);
        linkedInPage.checkLinkedInPopupText();
        closeWindow();

        loginPage.clickOnFacebookIcon();
        switchToTab(2);
        facebookPage.urlContainsFacebook();
        closeWindow();
    }*/
}
