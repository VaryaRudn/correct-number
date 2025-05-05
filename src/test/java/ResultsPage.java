import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ResultsPage extends BaseTest {

    private By paginationItems = By.cssSelector("div.page-pagination__list button.page-pagination__item");
    private By currentPageButton = By.cssSelector("div.page-pagination__list button.page-pagination__item[aria-current='true']");
    private By nextPageButton = By.cssSelector("button.page-pagination__next");

    public boolean isCurrentPageNumberCorrect(int expectedPageNumber) {
        String currentPageText = $(currentPageButton).getText();

        if (currentPageText.isEmpty()) {
            return false;
        }

        return Integer.parseInt(currentPageText) == expectedPageNumber; // Проверяем номер текущей страницы
    }

    public void goToNextPage() {
        $(nextPageButton).click(); // Нажимаем на кнопку следующей страницы
    }

    public boolean isLastPage() {
        // Проверяем, является ли последняя кнопка кнопкой с номером страницы
        return $$(paginationItems).last().getText().equals("44");
    }
}
