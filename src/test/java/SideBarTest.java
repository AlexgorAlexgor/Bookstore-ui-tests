import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.codeborne.selenide.Condition.visible;

public class SideBarTest extends BaseTest {

/*
    @Test @Category(Smoke.class)
    public void allLinksAreDisplayed() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        headerSection.getUserDropdownTab().shouldBe(visible);

        sideBar.adminLinkIsDisplayedCorrectly();
        sideBar.pimLinkIsDisplayedCorrectly();
        sideBar.leaveLinkIsDisplayedCorrectly();
        sideBar.timeLinkIsDisplayedCorrectly();
        sideBar.recruitmentLinkIsDisplayedCorrectly();
        sideBar.myInfoLinkIsDisplayedCorrectly();
        sideBar.performanceLinkIsDisplayedCorrectly();
        sideBar.dashboardLinkIsDisplayedCorrectly();
        sideBar.viewDirectoryLinkIsDisplayedCorrectly();
        sideBar.maintenanceLinkIsDisplayedCorrectly();
        sideBar.buzzLinkIsDisplayedCorrectly();
    }

    @Test
    public void sideBarRolledOut() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        headerSection.getUserDropdownTab().shouldBe(visible);

        System.out.println("#1 check that logo has changed ");
        sideBar.sideBarRolledOpen();
        sideBar.sideBarRolledClick();
        sideBar.sideBarRolledClose();
        sideBar.sideBarRolledClick();

        System.out.println("#2 check that text(Admin) has changed at no text(is empty) ");
        sideBar.sideBarRolledOpen();
        sideBar.adminLinkIsDisplayedCorrectly();
        sideBar.sideBarRolledClick();
        sideBar.sideBarRolledClose();
        sideBar.adminLinkIsDisplayedWithoutText();
        sideBar.sideBarRolledClick();


    }
*/

   /* @Test
    public void searchExactLink() {
        String queryValue = "Admin";
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        headerSection.getUserDropdownTab().shouldBe(visible);

        sideBar.enterValueToSearchInput(queryValue);
        sideBar.checkLinksQuantity(1);
        sideBar.checkLinkHasText(queryValue);
         *//*  sideBar.enteredTextAdmin();
        sideBar.availableLinksIsDisplayed();

        sideBar.enteredAnyText();
        sideBar.availableLinksIsNotDisplayed();*//*
    }

    @Test
    public void searchByPartText() {
        String queryValue = "re";
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        headerSection.getUserDropdownTab().shouldBe(visible);

        sideBar.enterValueToSearchInput(queryValue);
        //#1
        sideBar.checkExpectedLinksHasText(queryValue);
        //#2
        sideBar.checkAllLinksHasText("re");

    }
*/

}

