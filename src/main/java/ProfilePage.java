import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private SelenideElement profileUserNameValue = $(By.id("userName-value"));
    public SelenideElement openProfilePageIsDisplaeyd() {return profileUserNameValue;}

    private SelenideElement logoutButton = $(By.linkText("Log out"));
    public   void clickOnLogoutButton() {logoutButton.click();}

    private SelenideElement newUserButton = $(By.id("newUser"));
    public void clickNewUserButton(){newUserButton.click();}



}
//      profilePage.clickNewUserButton();
//        profilePage.clickOnLogoutButton();
//public void clickOnLoginButton() {loginButton.click();

