import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    //final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    final String BASE_URL1 = "https://demoqa.com/login";

    @Before
    public void setUp() {
        // Configuration.browser="edge";
        // Configuration.timeout=10000;
        // Configuration.browserSize = "300x300";
        Configuration.fastSetValue = true;//java Script
        Configuration.clickViaJs = true;//java Script
        Configuration.headless = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL1);
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    public void switchToTab(int tabNum) {
        switchTo().window(tabNum);
    }

    BooksPage booksPage = new BooksPage();
    ProfilePage profilePage = new ProfilePage();
    LoginPage loginPage = new LoginPage();
    RegisterForm registerForm = new RegisterForm();
    CurrentBookForm currentBookForm =new CurrentBookForm();

    // LoginPage loginPage = new LoginPage();

    HeaderSection headerSection = new HeaderSection();
    //  LinkedInPage linkedInPage = new LinkedInPage();
    //  FacebookPage facebookPage = new FacebookPage();
    SideBar sideBar = new SideBar();

    // LoginTest loginTest=new LoginTest ();
}
