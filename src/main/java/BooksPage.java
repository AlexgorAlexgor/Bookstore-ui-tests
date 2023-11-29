import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BooksPage {

    private ElementsCollection activeBooks = $$(By.className("action-buttons"));
  //  private SelenideElement currentBookWeblink = $(By.id("see-book-Git"));
    //public void checkLinkHasText(String expectedText){
    //        availableLinks.filter(visible).get(0).shouldHave(exactText(expectedText));
    //    }
    //    see-book-Git Pocket Guide

    public SelenideElement firstBooksElement() {
        SelenideElement firstBook = activeBooks.filter(visible).get(0);
        return firstBook;
    }
    public SelenideElement goCurrentBookWeblink() {
        SelenideElement firstBook = activeBooks.filter(visible).get(0).$(By.id("see-book-Git"));

        return firstBook;
    }

}
