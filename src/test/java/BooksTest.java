import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;

public class BooksTest extends BaseTest {

    @Test
    public void enterToCurrentBookPage() {
        booksPage.goCurrentBookWeblink().click();
        currentBookForm.visibleButtonBackToBookStore().shouldBe(visible);
        //        loginPage.getEmptyFieldMessage().shouldBe(visible);

    }

}
