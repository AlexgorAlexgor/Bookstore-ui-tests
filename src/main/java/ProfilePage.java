import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    //private SelenideElement labelCurentUserNameValue = $(By.id("userName-value"));
    private SelenideElement labelCurentUserNameValue = $(By.id("userName-label"));
    private SelenideElement logoutButton = $(By.linkText("Log out"));
    private SelenideElement newUserButton = $(By.id("newUser"));

    public SelenideElement openProfilePageIsDisplaeyd() {return labelCurentUserNameValue.shouldBe(visible, Duration.ofSeconds(10));}
    public   void clickOnLogoutButton() {logoutButton.click();}
    public void clickNewUserButton(){newUserButton.click();}

}
//      profilePage.clickNewUserButton();
//        profilePage.clickOnLogoutButton();
//public void clickOnLoginButton() {loginButton.click();

