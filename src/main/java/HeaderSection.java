import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderSection {
    private SelenideElement userDropdownTab=$(By.className("oxd-userdropdown-tab"));

    public SelenideElement getUserDropdownTab() {
        return userDropdownTab;
    }
}
