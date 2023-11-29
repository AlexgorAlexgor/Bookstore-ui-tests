import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CurrentBookForm {

    private SelenideElement buttonBackToBookStore =$(By.id("addNewRecordButton"));

    public SelenideElement visibleButtonBackToBookStore() {return buttonBackToBookStore;}

    public void clickButtonBackToBookStore(){buttonBackToBookStore.click();}

    //  private ElementsCollection activeBooks = $$("[class=\"action-buttons\"]");
    //     public void  clickRegisterButton(){registerButton.click();}
    //     private SelenideElement currentBookWeblink = $(By.id("see-book-Git Pocket Guide"));
}
