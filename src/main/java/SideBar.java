import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SideBar {

    private SelenideElement adminLink = $("[href*=\"viewAdminModule\"]");
    private SelenideElement pimIcon = $("[href*=\"viewPimModule\"]");
    private SelenideElement leaveIcon = $("[href*=\"viewLeaveModule\"]");
    private SelenideElement timeIcon = $("[href*=\"viewTimeModule\"]");
    private SelenideElement recruitmentIcon = $("[href*=\"viewRecruitmentModule\"]");
    private SelenideElement myInfoIcon = $("[href*=\"viewMyDetails\"]");
    private SelenideElement performanceIcon = $("[href*=\"viewPerformanceModule\"]");
    private SelenideElement dashboardIcon = $("[href*=\"dashboard\"]");
    private SelenideElement viewDirectoryIcon = $("[href*=\"viewDirectory\"]");
    private SelenideElement maintenanceIcon = $("[href*=\"viewMaintenanceModule\"]");
    private SelenideElement claimIcon = $("[href*=\"viewClaimModule\"]");
    private SelenideElement buzzIcon = $("[href*=\"viewBuzz\"]");

    private SelenideElement logoOrangehrm = $("[src*=\"orangehrm-logo\"]");
    private SelenideElement mainMenuButton = $(By.className("oxd-main-menu-button"));
    private SelenideElement logoOrange = $("[src*=\"orange\"]");

    private ElementsCollection hrmPictures = $$("[alt*=\"client brand\"]");
    private ElementsCollection iconsCollection = $$("[class=\"oxd-icon oxd-main-menu-item--icon\"]");

    private ElementsCollection availableLinks = $$("[class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]");
    private SelenideElement searchField = $("[class=\"oxd-input oxd-input--active\"]");
    private SelenideElement searchInputField=$("[class=\"oxd-input oxd-input--active\"]");

    public void checkAllLinksHasText(String expectedPartText){
        for (SelenideElement link: availableLinks.filter(visible)) {
            link.shouldHave(text(expectedPartText));
        }
    }

    public void enterValueToSearchInput(String query){
        searchInputField.setValue(query);
    }
    public void checkLinksQuantity(int expectedLinksQuantity){
        availableLinks.filter(visible).shouldHave(size(expectedLinksQuantity));
    }
    public void checkLinkHasText(String expectedText){
        availableLinks.filter(visible).get(0).shouldHave(exactText(expectedText));
    }

    public void checkExpectedLinksHasText(String expectedText){
        for (int i = 0; i < availableLinks.filter(visible).size()-1; i++) {
            availableLinks.filter(visible).get(i).shouldHave(text(expectedText));        }
        }


    public void enteredTextAdmin() {searchField.setValue("Admin").click();}
    public void enteredAnyText() {searchField.setValue("AdminAdmin").click();}

    public void availableLinksIsDisplayed() {
      /*  SelenideElement availableLinks.
        availableLinks.size().*/
        for (SelenideElement availableLink : availableLinks) {
            if (availableLink.isDisplayed()){availableLink.shouldHave(text("Admin"));}
        }
    }

    public void availableLinksIsNotDisplayed() {
        for (SelenideElement availableLink : availableLinks) {
            availableLinks.size();
            //if (availableLink.isDisplayed()){availableLink.shouldNotHave(text("Admin"));}
        }
    }


    public void allIconsAreDisplayed() {
        for (SelenideElement icon : iconsCollection) {
            icon.shouldBe(visible);
        }
    }

    public void checkExpandedSideBarPicture() {
        SelenideElement visiblePicture = hrmPictures.filter(visible).get(0);
        visiblePicture.shouldHave
                (attributeMatching("src", ".*orangehrm-logo.png.*"));
    }

    public void checkCollapsedSideBarPicture() {
        SelenideElement visiblePicture = hrmPictures.filter(visible).get(0);
        visiblePicture.shouldHave
                (attributeMatching("src", ".*orange.png.*"));
    }

    public void adminLinkIsDisplayedWithoutText() {
        //   adminLink.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Admin"));
        adminLink.shouldBe(visible, Duration.ofSeconds(10)).shouldNotHave(text("Admin"));
    }

    public void sideBarRolledOpen() {
        logoOrangehrm.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void sideBarRolledClose() {
        logoOrange.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void sideBarRolledClick() {
        mainMenuButton.click();
    }

    public void adminLinkIsDisplayedCorrectly() {
        adminLink.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Admin"));
    }

    public void pimLinkIsDisplayedCorrectly() {
        pimIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Pim"));
    }

    public void leaveLinkIsDisplayedCorrectly() {
        leaveIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Leave"));
    }

    public void timeLinkIsDisplayedCorrectly() {
        timeIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Time"));
    }

    public void recruitmentLinkIsDisplayedCorrectly() {
        recruitmentIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Recruitment"));
    }

    public void myInfoLinkIsDisplayedCorrectly() {
        myInfoIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("My Info"));
    }

    public void performanceLinkIsDisplayedCorrectly() {
        performanceIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Performance"));
    }

    public void dashboardLinkIsDisplayedCorrectly() {
        dashboardIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Dashboard"));
    }

    public void viewDirectoryLinkIsDisplayedCorrectly() {
        viewDirectoryIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Directory"));
    }

    public void maintenanceLinkIsDisplayedCorrectly() {
        maintenanceIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Maintenance"));
    }

    public void claimLinkIsDisplayedCorrectly() {
        claimIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Claim"));
    }

    public void buzzLinkIsDisplayedCorrectly() {
        buzzIcon.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Buzz"));
    }
}
