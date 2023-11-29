import org.junit.Test;

public class RegistrationTest extends BaseTest {

    /*  @Test
    //Please verify reCaptcha to register!
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
    }*/
    @Test
    public void registrationNewUserWithEmptyFirstNameField() {
        loginPage.clickOnLoginButton();

        profilePage.clickNewUserButton();

        registerForm.enterFirstNameField("");
        registerForm.enterLastNameField("Mask");
        registerForm.enterUserNameField("max.mask@gmail.com");
        registerForm.enterPasswordField("MaxMask0!");
        registerForm.clickRegisterButton();

        registerForm.getFirstNameField().getValue().isEmpty();

    }

    @Test
    public void registrationNewUserWithEmptyLastNameField() {
        loginPage.clickOnLoginButton();

        profilePage.clickNewUserButton();

        registerForm.enterFirstNameField("Max");
        registerForm.enterLastNameField("");
        registerForm.enterUserNameField("max.mask@gmail.com");
        registerForm.enterPasswordField("MaxMask0!");
        registerForm.clickRegisterButton();

        registerForm.getLastNameField().getValue().isEmpty();
    }

    @Test
    public void registrationNewUserWithEmptyUserNameField() {
        loginPage.clickOnLoginButton();

        profilePage.clickNewUserButton();

        registerForm.enterFirstNameField("Max");
        registerForm.enterLastNameField("Mask");
        registerForm.enterUserNameField("");
        registerForm.enterPasswordField("MaxMask0!");
        registerForm.clickRegisterButton();

        registerForm.getUserNameField().getValue().isEmpty();
    }

    @Test
    public void registrationNewUserWithEmptyPasswordField() {
        loginPage.clickOnLoginButton();

        profilePage.clickNewUserButton();

        registerForm.enterFirstNameField("Max");
        registerForm.enterLastNameField("Mask");
        registerForm.enterUserNameField("max.mask@gmail.com");
        registerForm.enterPasswordField("");
        registerForm.clickRegisterButton();

        registerForm.getPasswordField().getValue().isEmpty();
    }

    @Test
    public void registrationNewUserGoToLogin() {
        loginPage.clickOnLoginButton();

        profilePage.clickNewUserButton();

     /*   registerForm.enterFirstNameField(" ");
        registerForm.enterLastNameField(" ");
        registerForm.enterUserNameField("");
        registerForm.enterPasswordField("");
*/
        registerForm.clickBackToLoginButton();
        loginPage.visibleLoginButton();
    }
}