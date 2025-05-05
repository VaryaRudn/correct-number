import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckServer extends BaseTest {

    @Test
    public void testPagination() {
        int currentPage = 1; // Начинаем с первой страницы

        ResultsPage resultsPage = new ResultsPage();

        // Проверяем первую страницу
        assertTrue(resultsPage.isCurrentPageNumberCorrect(currentPage),
                "Номер текущей страницы неверен. Ожидалось: " + currentPage);

        // Перелистываем страницы, пока не достигнем последней
        while (!resultsPage.isLastPage()) {
            resultsPage.goToNextPage(); // Переходим на следующую страницу
            currentPage++; // Увеличиваем номер страницы

            // Проверяем номер текущей страницы
            assertTrue(resultsPage.isCurrentPageNumberCorrect(currentPage),
                    "Номер текущей страницы неверен. Ожидалось: " + currentPage);
        }
    }
}
