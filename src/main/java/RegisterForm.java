import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterForm {
    private SelenideElement firstNameField = $("[placeholder=\"First Name\"]");
    private SelenideElement lastNameField = $("[placeholder=\"Last Name\"]");
    private SelenideElement userNameField = $("[placeholder=\"UserName\"]");
    private SelenideElement passwordField = $("[placeholder=\"Password\"]");
    private SelenideElement registerButton= $(By.id("register"));
    private SelenideElement backToLoginButton= $(By.id("gotologin"));
       //     registerForm.clickBackToLoginButton();


    //private SelenideElement emptyElement=$(by.focus)
    //  private SelenideElement emptyFirstNameField = $(by.border-color"#dc3545");
//"#dc3545"

    public void  clickRegisterButton(){registerButton.click();}
    public void  clickBackToLoginButton(){backToLoginButton.click();}

    public void enterFirstNameField(String firstNameValue) {firstNameField.setValue(firstNameValue);}
    public void enterLastNameField(String lastNameValue) {lastNameField.setValue(lastNameValue);}
    public void enterUserNameField(String userNameValue) {userNameField.setValue(userNameValue);}
    public void enterPasswordField(String passwordValue) {passwordField.setValue(passwordValue);}

    public SelenideElement getFirstNameField() {return firstNameField;}

    public SelenideElement getLastNameField() {return lastNameField;}

    public SelenideElement getUserNameField() {return userNameField;}

    public SelenideElement getPasswordField() {return passwordField;}

//registerForm.clickRegisterButton();
//public SelenideElement getErrorMessage() {return alertError;}
    //  First Name
    //  private SelenideElement passwordField = $("[placeholder=\"Password\"]");
}
